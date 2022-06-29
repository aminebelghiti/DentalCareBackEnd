package ma.dentalcare.dentalcare.service.IMPL;

import ma.dentalcare.dentalcare.model.Ordonnance;
import ma.dentalcare.dentalcare.repository.OrdonnanceRepository;
import ma.dentalcare.dentalcare.service.OrdonnanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrdonnanceImpl implements OrdonnanceService {
    @Autowired
    private OrdonnanceRepository repository;
    @Override
    public List<Ordonnance> getAllOrdonnances() {
        return repository.findAll();
    }

    @Override
    public Ordonnance saveOrdonnance(Ordonnance ordonnance) {
        return repository.save(ordonnance);
    }

    @Override
    public Ordonnance getOrdonnanceById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Ordonnance updateOrdonnance(Ordonnance ordonnance) {
        return repository.save(ordonnance);
    }

    @Override
    public void deleteOrdonnance(Long id) {
        repository.deleteById(id);
    }
}
