package ma.dentalcare.dentalcare.service.IMPL;

import ma.dentalcare.dentalcare.model.Medecin;
import ma.dentalcare.dentalcare.repository.MedecinRepository;
import ma.dentalcare.dentalcare.service.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedecinServiceImpl implements MedecinService {
    @Autowired
    private MedecinRepository repo;

    public MedecinServiceImpl(MedecinRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Medecin> getAllMedecins() {
        return repo.findAll();
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return repo.save(medecin);
    }

    @Override
    public Medecin getMedecinById(Long id) {
        return repo.findById(id).orElseThrow(()->new UsernameNotFoundException("Medecin by ID "+id+"was not found"));
    }

    @Override
    public Medecin updateMedecin(Medecin medecin) {
        return repo.save(medecin);
    }

    @Override
    public void deleteMedecin(Long id) {
           repo.deleteById(id);
    }
}
