package ma.dentalcare.dentalcare.service.IMPL;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import ma.dentalcare.dentalcare.controller.PatientController;
import ma.dentalcare.dentalcare.model.Patient;
import ma.dentalcare.dentalcare.repository.PatientRepository;
import ma.dentalcare.dentalcare.security.SecurityUtils;
import ma.dentalcare.dentalcare.service.PatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PatientImplService implements PatientService, UserDetailsService {

    private PasswordEncoder encoder;
    private static final Logger LOGGER = LoggerFactory.getLogger(PatientController.class);

    @Autowired
    private PatientRepository repo;
    public PatientImplService(PatientRepository repo) {
        this.repo = repo;
    }

    @Override
    public Patient AddPatient(Patient patient) {
        return repo.save(patient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    @Override
    public Patient savePatient(Patient patient) {
        patient.setPassword(encoder.encode(patient.getPassword())   );
        return repo.save(patient);
    }

    @Override
    public Patient getPatientById(Long id) {
        return repo.findById(id).orElseThrow(()-> new UsernameNotFoundException("User By ID "+id+"was Not Found"));
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return repo.save(patient);
    }
    @Override
    public void deletePatient(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<Patient> getUserWithAuthorities() {
        return SecurityUtils.getCurrentUsername().flatMap(repo::findOneWithAuthoritiesByUsername);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Patient patient = repo.findByUsername(username);
        if (username == null) {
            log.error("UserName Not Found");
            throw new UsernameNotFoundException("UserName Not Found");
        } else {
            log.info("UserName Found");
        }
        Collection <SimpleGrantedAuthority> authorities = new ArrayList<>();
        return new org.springframework.security.core.userdetails.User(patient.getUsername(), patient.getPassword(),authorities);
    }
}
