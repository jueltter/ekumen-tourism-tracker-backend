package dev.samagua.ekumen_tourism_tracker_backend.repositories.impl;

import dev.samagua.ekumen_tourism_tracker_backend.entities.Achievement;
import dev.samagua.ekumen_tourism_tracker_backend.entities.AdministrativeDivision;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.AchievementJpaRepository;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.AdministrativeDivisionJpaRepository;
import ec.dev.samagua.commons_models.controllers_exceptions.RepositoryException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AdministrativeDivisionRepository {

    private final AdministrativeDivisionJpaRepository repository;

    public List<AdministrativeDivision> findAll(){
        try {
            return repository.findAll();
        } catch (Exception ex) {
            throw RepositoryException.getReadException(ex);
        }
    }

    public Optional<AdministrativeDivision> findById(Long id) {
        try {
            return repository.findById(id);
        } catch (Exception ex) {
            throw RepositoryException.getReadException(ex);
        }
    }

}
