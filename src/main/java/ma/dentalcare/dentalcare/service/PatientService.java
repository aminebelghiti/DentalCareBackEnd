package ma.dentalcare.dentalcare.service;

import ma.dentalcare.dentalcare.model.Patient;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


public interface PatientService {


    public Patient AddPatient(Patient patient);
    List<Patient> getAllPatients();
    Patient savePatient (Patient patient);
    Patient getPatientById (Long id);
    Patient updatePatient (Patient patient);
    void deletePatient(Long id);
    public Optional<Patient> getUserWithAuthorities();
    }

