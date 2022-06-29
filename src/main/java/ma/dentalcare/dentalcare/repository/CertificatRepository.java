package ma.dentalcare.dentalcare.repository;

import ma.dentalcare.dentalcare.model.Certificat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificatRepository extends JpaRepository<Certificat,Long> {
}
