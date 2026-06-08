package dev.samagua.ekumen_tourism_tracker_backend.repositories.impl;

import dev.samagua.ekumen_tourism_tracker_backend.entities.ExperienceReview;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.ExperienceReviewJpaRepository;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.TourismExperienceJpaRepository;
import ec.dev.samagua.commons_models.controllers_exceptions.RepositoryException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ExperienceReviewRepository {

    private final ExperienceReviewJpaRepository repository;

    public List<ExperienceReview> findAllByTouristId(Long touristId) {
        try {
            return repository.findAllByTouristId(touristId);
        } catch (Exception ex) {
            throw RepositoryException.getReadException(ex);
        }

    }

    public Optional<ExperienceReview> findById(Long id) {
        try {
            return repository.findById(id);
        } catch (Exception ex) {
            throw RepositoryException.getReadException(ex);
        }
    }

}
