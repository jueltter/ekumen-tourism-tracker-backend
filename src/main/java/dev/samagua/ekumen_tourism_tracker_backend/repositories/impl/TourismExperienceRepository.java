package dev.samagua.ekumen_tourism_tracker_backend.repositories.impl;

import dev.samagua.ekumen_tourism_tracker_backend.entities.AdministrativeDivision;
import dev.samagua.ekumen_tourism_tracker_backend.entities.TourismExperience;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.AdministrativeDivisionJpaRepository;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.TourismExperienceJpaRepository;
import ec.dev.samagua.commons_models.controllers_exceptions.RepositoryException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TourismExperienceRepository {

    private final TourismExperienceJpaRepository repository;

    public List<TourismExperience> findAll(){
        try {
            return repository.findAll();
        } catch (Exception ex) {
            throw RepositoryException.getReadException(ex);
        }
    }

    public Optional<TourismExperience> findById(Long id) {
        try {
            return repository.findById(id);
        } catch (Exception ex) {
            throw RepositoryException.getReadException(ex);
        }
    }

}
