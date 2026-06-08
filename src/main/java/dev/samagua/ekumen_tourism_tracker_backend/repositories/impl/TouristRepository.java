package dev.samagua.ekumen_tourism_tracker_backend.repositories.impl;

import dev.samagua.ekumen_tourism_tracker_backend.entities.TourismExperience;
import dev.samagua.ekumen_tourism_tracker_backend.entities.Tourist;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.ProcessMediaJpaRepository;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.TouristJpaRepository;
import ec.dev.samagua.commons_models.controllers_exceptions.RepositoryException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TouristRepository {
    private final TouristJpaRepository repository;

    public Optional<Tourist> findById(Long id) {
        try {
            return repository.findById(id);
        } catch (Exception ex) {
            throw RepositoryException.getReadException(ex);
        }
    }
}
