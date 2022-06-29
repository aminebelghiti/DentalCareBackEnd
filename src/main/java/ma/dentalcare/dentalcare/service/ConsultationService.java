package ma.dentalcare.dentalcare.service;

import ma.dentalcare.dentalcare.model.Consultation;
import ma.dentalcare.dentalcare.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ConsultationService {
    List<Consultation> getAllConsultation();

    Consultation saveConsultation (Consultation consu);

    Consultation getConsultationById (Long id);

    Consultation updateConsultation (Consultation consu);

    void deletePConsultation(Long id);
}
