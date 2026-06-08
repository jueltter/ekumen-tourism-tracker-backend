package dev.samagua.ekumen_tourism_tracker_backend.services.impl;

import dev.samagua.ekumen_tourism_tracker_backend.entities.Catalog;
import dev.samagua.ekumen_tourism_tracker_backend.entities.ExperienceReview;
import dev.samagua.ekumen_tourism_tracker_backend.entities.TourismExperience;
import dev.samagua.ekumen_tourism_tracker_backend.entities.Tourist;
import dev.samagua.ekumen_tourism_tracker_backend.models.ExperienceReviewMedia;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.impl.*;
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
    private final CatalogRepository catalogRepository;
    private final TouristRepository touristRepository;
    private final TourismExperienceRepository tourismExperienceRepository;

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

    @Override
    public ExperienceReview save(ExperienceReview experienceReview) {


        final Tourist tourist = touristRepository.findById(experienceReview.getTourist().getId()).orElseThrow();
        final TourismExperience tourismExperience = tourismExperienceRepository.findById(experienceReview.getTourismExperience().getId()).orElseThrow();

        experienceReview.setTourist(tourist);
        experienceReview.setTourismExperience(tourismExperience);
        var experienceReviewSaved = experienceReviewRepository.save(experienceReview);

        final Catalog processType = catalogRepository.findById(Constants.PROCESS_TYPE_EXPERIENCE_REVIEW_MEDIA).orElseThrow();

        List<ExperienceReviewMedia> mediaListToSave = experienceReview.getMediaList() != null ? experienceReview.getMediaList() : List.of();
        var mediaListSaved = mediaListToSave.stream().peek(media -> media.setExperienceReview(experienceReviewSaved.getId()))
                .map(processMediaMapper::fromExperienceReviewMedia)
                .peek(obj -> obj.setProcessType(processType))
                .map(processMediaRepository::save)
                .map(processMediaMapper::toExperienceReviewMedia)
                .toList();

        experienceReview.setMediaList(mediaListSaved);

        return experienceReview;

    }


}
