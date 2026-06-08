package dev.samagua.ekumen_tourism_tracker_backend.utils.mappers;

import dev.samagua.ekumen_tourism_tracker_backend.entities.ProcessMedia;
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

    @Mapping(target = "processCode", source = "experienceReview")
    //@Mapping(target = "processType.code", constant = Constants.PROCESS_TYPE_EXPERIENCE_REVIEW_MEDIA)
    ProcessMedia fromExperienceReviewMedia(ExperienceReviewMedia experienceReviewMedia);

}
