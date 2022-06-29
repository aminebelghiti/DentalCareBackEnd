package ma.dentalcare.dentalcare.service.IMPL;

import ma.dentalcare.dentalcare.model.Antecedant;
import ma.dentalcare.dentalcare.repository.AntecedantRepository;
import ma.dentalcare.dentalcare.service.AntecedantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AntecedantImpl implements AntecedantService {
    @Autowired
    private AntecedantRepository repository;
    @Override
    public List<Antecedant> getAllAntecedants() {
        return repository
                .findAll();
    }
    @Override
    public Antecedant saveAntecedant(Antecedant antecedant) {
        return repository.save(antecedant);
    }
    @Override
    public Antecedant getAntecedantById(Long id) {
        return repository.findById(id).get();
    }
    @Override
    public Antecedant updateAntecedant(Antecedant antecedant) {
        return repository.save(antecedant);
    }
    @Override
    public void deleteAntecedant(Long id) {
        repository.deleteById(id);
    }
}
