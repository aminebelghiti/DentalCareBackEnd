package ma.dentalcare.dentalcare.service;

import ma.dentalcare.dentalcare.model.Medecin;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MedecinService {

    List<Medecin> getAllMedecins();

    Medecin saveMedecin (Medecin medecin);

    Medecin getMedecinById (Long id);

    Medecin updateMedecin (Medecin medecin);

    void deleteMedecin(Long id);
}
