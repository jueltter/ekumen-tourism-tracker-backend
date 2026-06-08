package dev.samagua.ekumen_tourism_tracker_backend.repositories.impl;

import dev.samagua.ekumen_tourism_tracker_backend.entities.Catalog;
import dev.samagua.ekumen_tourism_tracker_backend.entities.TourismExperience;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.CatalogJpaRepository;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.TourismExperienceJpaRepository;
import ec.dev.samagua.commons_models.controllers_exceptions.RepositoryException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CatalogRepository {

    private final CatalogJpaRepository repository;

    public List<Catalog> findAll(){
        try {
            return repository.findAll();
        } catch (Exception ex) {
            throw RepositoryException.getReadException(ex);
        }
    }

    public Optional<Catalog> findById(String id) {
        try {
            return repository.findById(id);
        } catch (Exception ex) {
            throw RepositoryException.getReadException(ex);
        }
    }

}
