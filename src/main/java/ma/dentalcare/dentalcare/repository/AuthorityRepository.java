package ma.dentalcare.dentalcare.repository;

import ma.dentalcare.dentalcare.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority,Long> {
}
