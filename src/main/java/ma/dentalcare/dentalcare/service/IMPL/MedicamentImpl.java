package ma.dentalcare.dentalcare.service.IMPL;

import ma.dentalcare.dentalcare.model.Medicament;
import ma.dentalcare.dentalcare.repository.MedicamentRepository;
import ma.dentalcare.dentalcare.service.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MedicamentImpl implements MedicamentService {
    @Autowired
    private MedicamentRepository repository;
    @Override
    public List<Medicament> getAllMedicaments() {
        return repository.findAll();
    }

    @Override
    public Medicament saveMedicament(Medicament medecin) {
        return repository.save(medecin);
    }

    @Override
    public Medicament getMedicamentById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Medicament updateMedicament(Medicament medecin) {
        return repository.save(medecin);
    }

    @Override
    public void deleteMedicament(Long id) {
            repository.deleteById(id);
    }
}
