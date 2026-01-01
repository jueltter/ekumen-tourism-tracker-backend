package tech.samagua.ekumen_tourism_tracker_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tech.samagua.ekumen_tourism_tracker_backend.entities.Tourist;

public interface TouristJpaRepository extends JpaRepository<Tourist, Long>, JpaSpecificationExecutor<Tourist> {
    Tourist findByUsername(String username);
}
