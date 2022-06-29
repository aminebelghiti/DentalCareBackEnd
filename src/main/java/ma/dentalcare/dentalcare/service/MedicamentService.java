package ma.dentalcare.dentalcare.service;

import ma.dentalcare.dentalcare.model.Medecin;
import ma.dentalcare.dentalcare.model.Medicament;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MedicamentService {
    List<Medicament> getAllMedicaments();

    Medicament saveMedicament (Medicament medicament);

    Medicament getMedicamentById (Long id);

    Medicament updateMedicament (Medicament medicament);

    void deleteMedicament(Long id);
}
