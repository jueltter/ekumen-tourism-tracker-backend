package tech.samagua.ekumen_tourism_tracker_backend.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.samagua.ekumen_tourism_tracker_backend.entities.Achievement;
import tech.samagua.ekumen_tourism_tracker_backend.repositories.impl.AchievementRepository;
import tech.samagua.ekumen_tourism_tracker_backend.services.AchievementService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AchievementServiceImpl implements AchievementService {

    private final AchievementRepository achievementRepository;

    @Override
    public Achievement save(Achievement achievement) {
        return achievementRepository.save(achievement);
    }

    @Override
    public List<Achievement> findAll() {
        return achievementRepository.findAll();
    }

    @Override
    public List<Achievement> findByAdministrativeDivisionId(long administrativeDivisionId) {
        return achievementRepository.findByAdministrativeDivisionId(administrativeDivisionId);
    }
}
