package tech.samagua.ekumen_tourism_tracker_backend.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tech.samagua.ekumen_tourism_tracker_backend.entities.Achievement;
import tech.samagua.ekumen_tourism_tracker_backend.repositories.impl.AchievementRepository;
import tech.samagua.ekumen_tourism_tracker_backend.services.impl.AchievementServiceImpl;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class AchievementServiceTest {

    @InjectMocks
    private AchievementServiceImpl achievementService; // todo: change to interface AchievementService

    @Mock
    private AchievementRepository achievementRepository;

    @Test
    void findByIdNotFound() {
        when(achievementRepository.findById(any(Long.class)))
                .thenReturn(Optional.empty());

        assertEquals(Optional.empty(),
                achievementService.findById(1L));
    }

    @Test
    void findByIdFound() {
        when(achievementRepository.findById(any(Long.class)))
                .thenReturn(Optional.of(new Achievement()));

        assertTrue(achievementService.findById(1L).isPresent());
    }
}