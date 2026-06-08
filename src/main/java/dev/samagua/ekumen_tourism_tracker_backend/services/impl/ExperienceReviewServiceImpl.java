package dev.samagua.ekumen_tourism_tracker_backend.services.impl;

import dev.samagua.ekumen_tourism_tracker_backend.entities.Achievement;
import dev.samagua.ekumen_tourism_tracker_backend.entities.ExperienceReview;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.impl.ExperienceReviewRepository;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.impl.ProcessMediaRepository;
import dev.samagua.ekumen_tourism_tracker_backend.services.ExperienceReviewService;
import dev.samagua.ekumen_tourism_tracker_backend.utils.Constants;
import dev.samagua.ekumen_tourism_tracker_backend.utils.mappers.ProcessMediaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExperienceReviewServiceImpl implements ExperienceReviewService {

    private final ExperienceReviewRepository experienceReviewRepository;
    private final ProcessMediaRepository processMediaRepository;
    private final ProcessMediaMapper processMediaMapper;

    private ExperienceReview setMediaList(ExperienceReview experienceReview) {
        var processMediaList = processMediaRepository.findByProcessCodeAndProcessTypeCode(
                experienceReview.getId().toString(),
                Constants.PROCESS_TYPE_EXPERIENCE_REVIEW_MEDIA);

        var mediaList = processMediaList.stream()
                .map(processMediaMapper::toExperienceReviewMedia)
                .toList();

        experienceReview.setMediaList(mediaList);

        return experienceReview;
    }


    @Override
    public List<ExperienceReview> findAllByTouristId(Long touristId) {
        return experienceReviewRepository.findAllByTouristId(touristId).stream().peek(this::setMediaList).toList();
    }

    @Override
    public Optional<ExperienceReview> findById(Long id) {
        var experienceReviewOpt = experienceReviewRepository.findById(id);
        if (experienceReviewOpt.isEmpty()) {
            return Optional.empty();
        }

        var experienceReview = experienceReviewOpt.get();

        return Optional.of(this.setMediaList(experienceReview));
    }
}
