package ma.dentalcare.dentalcare.service.IMPL;

import ma.dentalcare.dentalcare.model.Secretaire;
import ma.dentalcare.dentalcare.repository.SecretaireRepository;
import ma.dentalcare.dentalcare.service.SecretaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecretaireServiceImpl implements SecretaireService {
    @Autowired
    private SecretaireRepository repo;

    public SecretaireServiceImpl(SecretaireRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Secretaire> getAllSecretaires() {
        return repo.findAll();
    }

    @Override
    public Secretaire saveSecretaire(Secretaire secretaire) {
        return repo.save(secretaire);
    }

    @Override
    public Secretaire getSecretaireById(Long id) {
        return repo.findById(id).orElseThrow(()->new UsernameNotFoundException("Secretaire by id "+id+"was not found"));
    }

    @Override
    public Secretaire updateRDV(Secretaire secretaire) {
        return repo.save(secretaire);
    }

    @Override
    public void deleteSecretaire(Long id) {
         repo.deleteById(id);
    }
}
