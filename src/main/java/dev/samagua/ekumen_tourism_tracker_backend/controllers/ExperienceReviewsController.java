package dev.samagua.ekumen_tourism_tracker_backend.controllers;

import dev.samagua.ekumen_tourism_tracker_backend.dtos.ExperienceReviewDto;
import dev.samagua.ekumen_tourism_tracker_backend.services.ExperienceReviewService;
import dev.samagua.ekumen_tourism_tracker_backend.utils.mappers.ExperienceReviewMapper;
import ec.dev.samagua.commons_models.controllers_models.ControllerResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.NotImplementedException;
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
            var dto = mapper.to(entityOpt.get());
            return ResponseEntity.ok(ControllerResult.getSuccessResult(dto));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/experience-reviews/tourist/{touristId}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<ControllerResult<List<ExperienceReviewDto>>> findAllByTouristId(@PathVariable Long touristId) {
        var entities = service.findAllByTouristId(touristId);
        var dtos = entities.stream().map(mapper::to).toList();
        return ResponseEntity.ok(ControllerResult.getSuccessResult(dtos));

    }

    @PostMapping("/experience-reviews")
    @CrossOrigin(origins = "*")
    public ResponseEntity<ControllerResult<ExperienceReviewDto>> create(@RequestBody ExperienceReviewDto experienceReviewDto) {
        var experienceReview = mapper.from(experienceReviewDto);
        var savedExperienceReview = service.save(experienceReview);
        var savedExperienceReviewDto = mapper.to(savedExperienceReview);
        return ResponseEntity.ok(ControllerResult.getSuccessResult(savedExperienceReviewDto));
    }

    @PutMapping("/experience-reviews")
    @CrossOrigin(origins = "*")
    public ResponseEntity<ControllerResult<ExperienceReviewDto>> update(@RequestBody ExperienceReviewDto experienceReviewDto) {
        throw new NotImplementedException("Update operation is not implemented yet");
    }

}
