package dev.samagua.ekumen_tourism_tracker_backend.services.impl;

import dev.samagua.ekumen_tourism_tracker_backend.entities.TourismExperience;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.impl.TourismExperienceRepository;
import dev.samagua.ekumen_tourism_tracker_backend.services.TourismExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TourismExperienceServiceImpl implements TourismExperienceService {

    private final TourismExperienceRepository tourismExperienceRepository;

    @Override
    public List<TourismExperience> findAll() {
        return tourismExperienceRepository.findAll();
    }


    @Override
    public Optional<TourismExperience> findById(Long id) {
        return tourismExperienceRepository.findById(id);
    }

}
