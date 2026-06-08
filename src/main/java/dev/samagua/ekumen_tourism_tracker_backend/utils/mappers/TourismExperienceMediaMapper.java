package dev.samagua.ekumen_tourism_tracker_backend.utils.mappers;

import dev.samagua.ekumen_tourism_tracker_backend.dtos.TourismExperienceMediaDto;
import dev.samagua.ekumen_tourism_tracker_backend.models.TourismExperienceMedia;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TourismExperienceMediaMapper {
        TourismExperienceMediaDto toDto(TourismExperienceMedia tourismExperienceMedia);

}
