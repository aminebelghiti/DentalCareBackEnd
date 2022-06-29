package ma.dentalcare.dentalcare.service;

import ma.dentalcare.dentalcare.model.Medecin;
import ma.dentalcare.dentalcare.model.Ordonnance;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrdonnanceService {

    List<Ordonnance> getAllOrdonnances();

    Ordonnance saveOrdonnance (Ordonnance ordonnance);

    Ordonnance getOrdonnanceById (Long id);

    Ordonnance updateOrdonnance (Ordonnance ordonnance);

    void deleteOrdonnance(Long id);
}
