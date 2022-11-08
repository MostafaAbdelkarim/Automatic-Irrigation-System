package banquemisr.irrigation.repository;

import banquemisr.irrigation.model.Land;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LandRepository extends JpaRepository<Land, Long> {

    Optional<Land> findById(Long id);
}
