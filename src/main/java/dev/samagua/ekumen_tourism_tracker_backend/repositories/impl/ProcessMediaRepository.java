package dev.samagua.ekumen_tourism_tracker_backend.repositories.impl;

import dev.samagua.ekumen_tourism_tracker_backend.entities.ProcessMedia;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.CatalogJpaRepository;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.ProcessMediaJpaRepository;
import ec.dev.samagua.commons_models.controllers_exceptions.RepositoryException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProcessMediaRepository {

    private final ProcessMediaJpaRepository repository;

    public List<ProcessMedia> findByProcessCodeAndProcessTypeCode(String processCode, String processTypeCode) {
        try {
            return repository.findByProcessCodeAndProcessTypeCode(processCode, processTypeCode);
        } catch (Exception ex) {
            throw RepositoryException.getReadException(ex);
        }
    }

}
