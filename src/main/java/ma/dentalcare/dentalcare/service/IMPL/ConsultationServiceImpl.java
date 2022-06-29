package ma.dentalcare.dentalcare.service.IMPL;

import ma.dentalcare.dentalcare.model.Consultation;
import ma.dentalcare.dentalcare.model.Patient;
import ma.dentalcare.dentalcare.repository.ConsultationRepository;
import ma.dentalcare.dentalcare.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConsultationServiceImpl implements ConsultationService
{
    @Autowired
    private ConsultationRepository repo;

    public ConsultationServiceImpl(ConsultationRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Consultation> getAllConsultation() {
        return repo.findAll();
    }

    @Override
    public Consultation saveConsultation(Consultation consu) {
        return repo.save(consu);
    }

    @Override
    public Consultation getConsultationById(Long id) {
        return repo.findById(id).orElseThrow(()->new UsernameNotFoundException("Consultation by id "+id+"Was not found"));
    }

    @Override
    public Consultation updateConsultation(Consultation consu) {
        return repo.save(consu);
    }

    @Override
    public void deletePConsultation(Long id) {
       repo.deleteById(id);
    }
}
