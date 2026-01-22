package tech.samagua.ekumen_tourism_tracker_backend.repositories.impl;

import ec.dev.samagua.commons_models.controllers_exceptions.RepositoryException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import tech.samagua.ekumen_tourism_tracker_backend.entities.Achievement;
import tech.samagua.ekumen_tourism_tracker_backend.repositories.AchievementJpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AchievementRepository {

    private final AchievementJpaRepository repository;

    public Achievement save(Achievement entity) {
        try {
            return repository.save(entity);
        } catch (Exception ex) {
            throw RepositoryException.getCreateException(ex);
        }
    }

    public List<Achievement> findAll(){
        try {
            return repository.findAll();
        } catch (Exception ex) {
            throw RepositoryException.getReadException(ex);
        }
    }

    public List<Achievement> findByAdministrativeDivisionId(long administrativeDivisionId){
        try {
            return repository.findByAdministrativeDivisionId(administrativeDivisionId);
        } catch (Exception ex) {
            throw RepositoryException.getReadException(ex);
        }
    }

    public Optional<Achievement> findById(Long id) {
        try {
            return repository.findById(id);
        } catch (Exception ex) {
            throw RepositoryException.getReadException(ex);
        }
    }

}
