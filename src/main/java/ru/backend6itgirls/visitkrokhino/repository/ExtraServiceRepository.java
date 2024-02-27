package ru.backend6itgirls.visitkrokhino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.backend6itgirls.visitkrokhino.model.entity.Booking;
import ru.backend6itgirls.visitkrokhino.model.entity.ExtraService;

import java.util.Optional;

public interface ExtraServiceRepository extends JpaRepository<ExtraService, Long>, JpaSpecificationExecutor<ExtraService>{
    Optional<ExtraService> findById(Long id);
}
