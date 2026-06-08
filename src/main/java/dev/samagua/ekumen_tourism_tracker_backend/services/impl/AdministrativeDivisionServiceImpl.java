package dev.samagua.ekumen_tourism_tracker_backend.services.impl;

import dev.samagua.ekumen_tourism_tracker_backend.entities.AdministrativeDivision;
import dev.samagua.ekumen_tourism_tracker_backend.repositories.impl.AdministrativeDivisionRepository;
import dev.samagua.ekumen_tourism_tracker_backend.services.AdministrativeDivisionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdministrativeDivisionServiceImpl implements AdministrativeDivisionService {

    private final AdministrativeDivisionRepository administrativeDivisionRepository;

    @Override
    public List<AdministrativeDivision> findAll() {
        return administrativeDivisionRepository.findAll();
    }


    @Override
    public Optional<AdministrativeDivision> findById(Long id) {
        return administrativeDivisionRepository.findById(id);
    }
}
