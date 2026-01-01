package tech.samagua.ekumen_tourism_tracker_backend.utils.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tech.samagua.ekumen_tourism_tracker_backend.dtos.AchievementDto;
import tech.samagua.ekumen_tourism_tracker_backend.entities.Achievement;

@Mapper(componentModel = "spring")
public interface AchievementDtoMapper {
    @Mapping(target = "administrativeDivision", source = "administrativeDivision.id")
    AchievementDto entityToDto(Achievement achievement);

    @Mapping(target = "administrativeDivision.id", source = "administrativeDivision")
    Achievement dtoToEntity(AchievementDto achievementDto);
}
