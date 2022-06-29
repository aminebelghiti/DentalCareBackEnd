package ma.dentalcare.dentalcare.repository;

import ma.dentalcare.dentalcare.model.Ordonnance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdonnanceRepository extends JpaRepository<Ordonnance,Long> {
}
