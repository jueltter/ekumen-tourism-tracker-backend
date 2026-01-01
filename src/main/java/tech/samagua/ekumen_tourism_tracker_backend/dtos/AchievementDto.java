package tech.samagua.ekumen_tourism_tracker_backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AchievementDto {
    private Long id;
    private String title;
    private String description;
    private Long points;
    private String pointType;
    private Long administrativeDivision;
}
