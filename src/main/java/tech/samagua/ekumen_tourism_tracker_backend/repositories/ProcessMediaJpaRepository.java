package tech.samagua.ekumen_tourism_tracker_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tech.samagua.ekumen_tourism_tracker_backend.entities.ProcessMedia;

import java.util.List;

public interface ProcessMediaJpaRepository extends JpaRepository<ProcessMedia, Long>, JpaSpecificationExecutor<ProcessMedia> {
    List<ProcessMedia> findByProcessCodeAndProcessTypeCode(String processCode, String processTypeCode);
}
