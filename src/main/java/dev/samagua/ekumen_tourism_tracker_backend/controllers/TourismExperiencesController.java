package dev.samagua.ekumen_tourism_tracker_backend.controllers;


import dev.samagua.ekumen_tourism_tracker_backend.dtos.AdministrativeDivisionDto;
import dev.samagua.ekumen_tourism_tracker_backend.dtos.TourismExperienceDto;
import dev.samagua.ekumen_tourism_tracker_backend.services.AdministrativeDivisionService;
import dev.samagua.ekumen_tourism_tracker_backend.services.TourismExperienceService;
import dev.samagua.ekumen_tourism_tracker_backend.utils.mappers.AdministrativeDivisionDtoMapper;
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
public class TourismExperiencesController {
    private final TourismExperienceService service;
    private final TourismExperienceDtoMapper mapper;

    @GetMapping("/tourism-experiences/{id}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<ControllerResult<TourismExperienceDto>> findById(@PathVariable Long id) {
        var entityOpt = service.findById(id);
        if (entityOpt.isPresent()) {
            var dto = mapper.entityToDto(entityOpt.get());
            return ResponseEntity.ok(ControllerResult.getSuccessResult(dto));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/tourism-experiences")
    @CrossOrigin(origins = "*")
    public ResponseEntity<ControllerResult<List<TourismExperienceDto>>> findAll() {
        var entities = service.findAll();
        var dtos = entities.stream().map(mapper::entityToDto).toList();
        return ResponseEntity.ok(ControllerResult.getSuccessResult(dtos));

    }
}
