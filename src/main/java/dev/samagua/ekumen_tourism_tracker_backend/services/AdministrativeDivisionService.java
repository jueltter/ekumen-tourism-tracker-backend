package dev.samagua.ekumen_tourism_tracker_backend.services;

import dev.samagua.ekumen_tourism_tracker_backend.entities.Achievement;
import dev.samagua.ekumen_tourism_tracker_backend.entities.AdministrativeDivision;

import java.util.List;
import java.util.Optional;

public interface AdministrativeDivisionService {
    List<AdministrativeDivision> findAll();
    Optional<AdministrativeDivision> findById(Long id);
}
