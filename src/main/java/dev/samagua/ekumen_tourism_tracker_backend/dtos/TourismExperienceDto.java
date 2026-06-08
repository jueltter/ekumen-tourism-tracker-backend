package dev.samagua.ekumen_tourism_tracker_backend.dtos;

import dev.samagua.ekumen_tourism_tracker_backend.entities.AdministrativeDivision;
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
public class TourismExperienceDto {

    private Long id;

    private Long province;

    private String city;

    private String address;

    private String latitude;

    private String longitude;

    private String name;

    private String description;

    private String type;
}
