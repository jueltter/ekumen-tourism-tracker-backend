package tech.samagua.ekumen_tourism_tracker_backend.controllers;

import ec.dev.samagua.commons_models.controllers_models.ControllerResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.samagua.ekumen_tourism_tracker_backend.dtos.AchievementDto;
import tech.samagua.ekumen_tourism_tracker_backend.services.AchievementService;
import tech.samagua.ekumen_tourism_tracker_backend.utils.mappers.AchievementDtoMapper;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class AchievementsController {

    private final AchievementService achievementService;
    private final AchievementDtoMapper achievementDtoMapper;

    @GetMapping("/achievements")
    @CrossOrigin(origins = "*")
    public ResponseEntity<ControllerResult<List<AchievementDto>>> findByAdministrativeDivisionId(@RequestParam(value = "administrative-division", required = false) Long administrativeDivisionId) {
        if  (administrativeDivisionId == null) {
            var items = achievementService.findAll();
            var dtos = items.stream().map(achievementDtoMapper::entityToDto).toList();
            return ResponseEntity.ok(ControllerResult.getSuccessResult(dtos));
        } else {
            var items = achievementService.findByAdministrativeDivisionId(administrativeDivisionId);
            var dtos = items.stream().map(achievementDtoMapper::entityToDto).toList();
            return ResponseEntity.ok(ControllerResult.getSuccessResult(dtos));
        }
    }

    @GetMapping("/achievements/{id}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<ControllerResult<AchievementDto>> findById(@PathVariable Long id) {
        var entityOpt = achievementService.findById(id);
        if (entityOpt.isPresent()) {
            var dto = achievementDtoMapper.entityToDto(entityOpt.get());
            return ResponseEntity.ok(ControllerResult.getSuccessResult(dto));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
