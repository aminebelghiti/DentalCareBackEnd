package ma.dentalcare.dentalcare.service;

import ma.dentalcare.dentalcare.model.Certificat;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CertificatService {
    List<Certificat> getAllCertificat();

    Certificat saveCertificat (Certificat certificat);

    Certificat getCertificatById (Long id);

    Certificat updateCertificat (Certificat certificat);

    void deleteCertificat(Long id);
}
