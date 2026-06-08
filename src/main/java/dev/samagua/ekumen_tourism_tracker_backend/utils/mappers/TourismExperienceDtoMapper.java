package dev.samagua.ekumen_tourism_tracker_backend.utils.mappers;

import dev.samagua.ekumen_tourism_tracker_backend.dtos.AdministrativeDivisionDto;
import dev.samagua.ekumen_tourism_tracker_backend.dtos.TourismExperienceDto;
import dev.samagua.ekumen_tourism_tracker_backend.entities.AdministrativeDivision;
import dev.samagua.ekumen_tourism_tracker_backend.entities.TourismExperience;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TourismExperienceDtoMapper {
    @Mapping(target = "province", source = "province.id")
    TourismExperienceDto entityToDto(TourismExperience tourismExperience);
}
