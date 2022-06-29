package ma.dentalcare.dentalcare.repository;

import ma.dentalcare.dentalcare.model.Patient;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByUsername(String username);
    Boolean existsByUsername(String username);

    @EntityGraph(attributePaths = "authorities")
    Optional<Patient> findOneWithAuthoritiesByUsername(String username);

}
