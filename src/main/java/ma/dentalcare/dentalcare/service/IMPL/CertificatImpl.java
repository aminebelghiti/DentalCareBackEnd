package ma.dentalcare.dentalcare.service.IMPL;

import ma.dentalcare.dentalcare.model.Certificat;
import ma.dentalcare.dentalcare.repository.CertificatRepository;
import ma.dentalcare.dentalcare.service.CertificatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificatImpl implements CertificatService {
    @Autowired
    private CertificatRepository repository;
    @Override
    public List<Certificat> getAllCertificat() {
        return repository.findAll();
    }

    @Override
    public Certificat saveCertificat(Certificat certificat) {
        return repository.save(certificat);
    }

    @Override
    public Certificat getCertificatById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Certificat updateCertificat(Certificat certificat) {
        return repository.save(certificat);
    }

    @Override
    public void deleteCertificat(Long id) {
        repository.deleteById(id);
    }
}
