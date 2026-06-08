package dev.samagua.ekumen_tourism_tracker_backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TourismExperienceMediaDto {
    private Long id;
    private String title;
    private String description;
    private String mediaType;
    private String fileName;
    private String filePath;
    private String mimeType;
}
