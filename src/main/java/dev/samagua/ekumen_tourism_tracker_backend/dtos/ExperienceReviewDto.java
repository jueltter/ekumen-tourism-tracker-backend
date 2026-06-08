package dev.samagua.ekumen_tourism_tracker_backend.dtos;

import dev.samagua.ekumen_tourism_tracker_backend.entities.TourismExperience;
import dev.samagua.ekumen_tourism_tracker_backend.entities.Tourist;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExperienceReviewDto {
    private Long id;

    private Double rating;

    private String title;

    private String description;

    private Long tourist;

    private Long tourismExperience;
}
