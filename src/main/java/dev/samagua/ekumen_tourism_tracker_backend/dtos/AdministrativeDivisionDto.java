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
public class AdministrativeDivisionDto {
    private Long id;

    private String code;

    private String name;

    private String description;

    private Long parent;
}
