package ma.dentalcare.dentalcare.service;

import ma.dentalcare.dentalcare.model.Secretaire;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SecretaireService {

    List<Secretaire> getAllSecretaires();

    Secretaire saveSecretaire (Secretaire secretaire);

    Secretaire getSecretaireById (Long id);

    Secretaire updateRDV (Secretaire secretaire);

    void deleteSecretaire(Long id);
}
