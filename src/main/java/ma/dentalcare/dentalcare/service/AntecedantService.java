package ma.dentalcare.dentalcare.service;

import ma.dentalcare.dentalcare.model.Antecedant;
import ma.dentalcare.dentalcare.model.Certificat;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AntecedantService {

    List<Antecedant> getAllAntecedants();

    Antecedant saveAntecedant (Antecedant antecedant);

    Antecedant getAntecedantById (Long id);

    Antecedant updateAntecedant (Antecedant antecedant);

    void deleteAntecedant(Long id);
}
