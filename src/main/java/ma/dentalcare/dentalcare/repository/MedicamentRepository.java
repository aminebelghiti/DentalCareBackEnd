package ma.dentalcare.dentalcare.repository;

import ma.dentalcare.dentalcare.model.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentRepository extends JpaRepository<Medicament,Long> {
}
