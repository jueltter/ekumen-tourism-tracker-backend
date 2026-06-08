package dev.samagua.ekumen_tourism_tracker_backend.controllers;

import dev.samagua.ekumen_tourism_tracker_backend.dtos.ExperienceReviewDto;
import dev.samagua.ekumen_tourism_tracker_backend.dtos.TourismExperienceDto;
import dev.samagua.ekumen_tourism_tracker_backend.services.ExperienceReviewService;
import dev.samagua.ekumen_tourism_tracker_backend.services.TourismExperienceService;
import dev.samagua.ekumen_tourism_tracker_backend.utils.mappers.ExperienceReviewMapper;
import dev.samagua.ekumen_tourism_tracker_backend.utils.mappers.TourismExperienceDtoMapper;
import ec.dev.samagua.commons_models.controllers_models.ControllerResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class ExperienceReviewsController {

    private final ExperienceReviewService service;
    private final ExperienceReviewMapper mapper;

    @GetMapping("/experience-reviews/{id}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<ControllerResult<ExperienceReviewDto>> findById(@PathVariable Long id) {
        var entityOpt = service.findById(id);
        if (entityOpt.isPresent()) {
            var dto = mapper.toDto(entityOpt.get());
            return ResponseEntity.ok(ControllerResult.getSuccessResult(dto));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/experience-reviews/tourist/{touristId}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<ControllerResult<List<ExperienceReviewDto>>> findAllByTouristId(@PathVariable Long touristId) {
        var entities = service.findAllByTouristId(touristId);
        var dtos = entities.stream().map(mapper::toDto).toList();
        return ResponseEntity.ok(ControllerResult.getSuccessResult(dtos));

    }



}
