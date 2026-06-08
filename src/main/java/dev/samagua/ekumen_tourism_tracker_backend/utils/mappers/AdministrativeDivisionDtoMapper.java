package dev.samagua.ekumen_tourism_tracker_backend.utils.mappers;

import dev.samagua.ekumen_tourism_tracker_backend.dtos.AchievementDto;
import dev.samagua.ekumen_tourism_tracker_backend.dtos.AdministrativeDivisionDto;
import dev.samagua.ekumen_tourism_tracker_backend.entities.Achievement;
import dev.samagua.ekumen_tourism_tracker_backend.entities.AdministrativeDivision;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AdministrativeDivisionDtoMapper {
    @Mapping(target = "parent", source = "parent.id")
    AdministrativeDivisionDto entityToDto(AdministrativeDivision achievement);
}
