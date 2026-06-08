package dev.samagua.ekumen_tourism_tracker_backend.services.impl;

import dev.samagua.ekumen_tourism_tracker_backend.entities.Achievement;
import dev.samagua.ekumen_tourism_tracker_backend.entities.ExperienceReview;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.impl.ExperienceReviewRepository;
import dev.samagua.ekumen_tourism_tracker_backend.services.ExperienceReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExperienceReviewServiceImpl implements ExperienceReviewService {

    private final ExperienceReviewRepository experienceReviewRepository;


    @Override
    public List<ExperienceReview> findAllByTouristId(Long touristId) {
        return experienceReviewRepository.findAllByTouristId(touristId);
    }

    @Override
    public Optional<ExperienceReview> findById(Long id) {
        return experienceReviewRepository.findById(id);
    }
}
