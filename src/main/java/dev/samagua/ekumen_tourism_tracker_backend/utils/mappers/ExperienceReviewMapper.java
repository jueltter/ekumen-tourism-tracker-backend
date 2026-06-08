package dev.samagua.ekumen_tourism_tracker_backend.utils.mappers;

import dev.samagua.ekumen_tourism_tracker_backend.dtos.ExperienceReviewDto;
import dev.samagua.ekumen_tourism_tracker_backend.entities.ExperienceReview;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ExperienceReviewMapper {

    @Mapping(target = "tourismExperience", source = "tourismExperience.id")
    @Mapping(target = "tourist", source = "tourist.id")
    ExperienceReviewDto to(ExperienceReview experienceReview);

    @Mapping(target = "tourismExperience.id", source = "tourismExperience")
    @Mapping(target = "tourist.id", source = "tourist")
    ExperienceReview from(ExperienceReviewDto experienceReviewDto);

}
