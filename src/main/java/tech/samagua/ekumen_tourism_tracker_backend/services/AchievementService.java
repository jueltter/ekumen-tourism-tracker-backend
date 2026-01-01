package tech.samagua.ekumen_tourism_tracker_backend.services;

import tech.samagua.ekumen_tourism_tracker_backend.entities.Achievement;

import java.util.List;

public interface AchievementService {
    Achievement save(Achievement achievement);
    List<Achievement> findAll();
    List<Achievement> findByAdministrativeDivisionId(long administrativeDivisionId);
}
