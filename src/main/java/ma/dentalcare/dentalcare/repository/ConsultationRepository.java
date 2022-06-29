package ma.dentalcare.dentalcare.repository;

import ma.dentalcare.dentalcare.model.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
