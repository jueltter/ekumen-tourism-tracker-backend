package dev.samagua.ekumen_tourism_tracker_backend.services;

import dev.samagua.ekumen_tourism_tracker_backend.entities.ExperienceReview;

import java.util.List;
import java.util.Optional;

public interface ExperienceReviewService {
    List<ExperienceReview> findAllByTouristId(Long touristId);
    Optional<ExperienceReview> findById(Long id);
}
