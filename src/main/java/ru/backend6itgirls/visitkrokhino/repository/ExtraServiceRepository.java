package ru.backend6itgirls.visitkrokhino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.backend6itgirls.visitkrokhino.model.entity.ExtraService;

public interface ExtraServiceRepository extends JpaRepository<ExtraService, Long>, JpaSpecificationExecutor<ExtraService> {
}

