package ma.dentalcare.dentalcare.service;

import ma.dentalcare.dentalcare.model.Patient;
import ma.dentalcare.dentalcare.model.RDV;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RDVService {
    public RDV AddRdv(RDV rdv);

    List<RDV> getAllRDVs();

    RDV saveRDV (RDV RDV);

    RDV getRDVById (Long id);

    RDV updateRDV (RDV RDV);

    void deleteRDV(Long id);
}
