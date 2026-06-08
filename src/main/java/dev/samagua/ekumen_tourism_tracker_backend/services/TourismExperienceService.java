package dev.samagua.ekumen_tourism_tracker_backend.services;

import dev.samagua.ekumen_tourism_tracker_backend.entities.AdministrativeDivision;
import dev.samagua.ekumen_tourism_tracker_backend.entities.TourismExperience;

import java.util.List;
import java.util.Optional;

public interface TourismExperienceService {
    List<TourismExperience> findAll();
    Optional<TourismExperience> findById(Long id);
}
