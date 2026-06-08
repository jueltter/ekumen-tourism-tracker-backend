package dev.samagua.ekumen_tourism_tracker_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import dev.samagua.ekumen_tourism_tracker_backend.entities.ExperienceReview;

import java.util.List;

public interface ExperienceReviewJpaRepository  extends JpaRepository<ExperienceReview, Long>, JpaSpecificationExecutor<ExperienceReview> {

    List<ExperienceReview> findAllByTouristId(Long touristId);

}
