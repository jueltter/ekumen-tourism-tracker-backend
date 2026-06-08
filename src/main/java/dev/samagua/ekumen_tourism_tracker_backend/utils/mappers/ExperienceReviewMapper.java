package dev.samagua.ekumen_tourism_tracker_backend.utils.mappers;

import dev.samagua.ekumen_tourism_tracker_backend.dtos.ExperienceReviewDto;
import dev.samagua.ekumen_tourism_tracker_backend.dtos.TourismExperienceDto;
import dev.samagua.ekumen_tourism_tracker_backend.entities.ExperienceReview;
import dev.samagua.ekumen_tourism_tracker_backend.entities.TourismExperience;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ExperienceReviewMapper {

    @Mapping(target = "tourismExperience", source = "tourismExperience.id")
    @Mapping(target = "tourist", source = "tourist.id")
    ExperienceReviewDto toDto(ExperienceReview experienceReview);

}
