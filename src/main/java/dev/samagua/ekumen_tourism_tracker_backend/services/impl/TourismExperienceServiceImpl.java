package dev.samagua.ekumen_tourism_tracker_backend.services.impl;

import dev.samagua.ekumen_tourism_tracker_backend.entities.TourismExperience;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.impl.ProcessMediaRepository;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.impl.TourismExperienceRepository;
import dev.samagua.ekumen_tourism_tracker_backend.services.TourismExperienceService;
import dev.samagua.ekumen_tourism_tracker_backend.utils.Constants;
import dev.samagua.ekumen_tourism_tracker_backend.utils.mappers.ProcessMediaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TourismExperienceServiceImpl implements TourismExperienceService {

    private final TourismExperienceRepository tourismExperienceRepository;
    private final ProcessMediaRepository processMediaRepository;
    private final ProcessMediaMapper processMediaMapper;

    @Override
    public List<TourismExperience> findAll() {
        return tourismExperienceRepository.findAll();
    }


    @Override
    public Optional<TourismExperience> findById(Long id) {
        var tourismExperienceOpt = tourismExperienceRepository.findById(id);
        if (tourismExperienceOpt.isEmpty()) {
            return Optional.empty();
        }

        var tourismExperience = tourismExperienceOpt.get();

        var processMediaList = processMediaRepository.findByProcessCodeAndProcessTypeCode(
                tourismExperience.getId().toString(),
                Constants.PROCESS_TYPE_TOURISM_EXPERIENCE_MEDIA);

        var mediaList = processMediaList.stream()
                .map(processMediaMapper::toTourismExperienceMedia)
                .toList();

        tourismExperience.setMediaList(mediaList);

        return tourismExperienceRepository.findById(id);
    }

}
