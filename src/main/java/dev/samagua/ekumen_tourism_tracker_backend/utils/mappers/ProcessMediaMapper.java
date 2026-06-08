package dev.samagua.ekumen_tourism_tracker_backend.utils.mappers;

import dev.samagua.ekumen_tourism_tracker_backend.dtos.TourismExperienceDto;
import dev.samagua.ekumen_tourism_tracker_backend.entities.ProcessMedia;
import dev.samagua.ekumen_tourism_tracker_backend.entities.TourismExperience;
import dev.samagua.ekumen_tourism_tracker_backend.models.ExperienceReviewMedia;
import dev.samagua.ekumen_tourism_tracker_backend.models.TourismExperienceMedia;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProcessMediaMapper {

    @Mapping(target = "tourismExperience", source = "processCode")
    TourismExperienceMedia toTourismExperienceMedia(ProcessMedia processMedia);

    @Mapping(target = "experienceReview", source = "processCode")
    ExperienceReviewMedia toExperienceReviewMedia(ProcessMedia processMedia);

}
