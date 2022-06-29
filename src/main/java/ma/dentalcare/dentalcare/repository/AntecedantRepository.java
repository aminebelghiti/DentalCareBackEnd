package ma.dentalcare.dentalcare.repository;

import ma.dentalcare.dentalcare.model.Antecedant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntecedantRepository extends JpaRepository<Antecedant,Long> {
}
