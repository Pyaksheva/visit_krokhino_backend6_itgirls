package ru.backend6itgirls.visitkrokhino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.backend6itgirls.visitkrokhino.model.entity.Booking;
import ru.backend6itgirls.visitkrokhino.model.entity.Service;

import java.util.Optional;

public interface ServiceRepository extends JpaRepository<Service, Long>, JpaSpecificationExecutor<Service> {
    Optional<Service> findById(Long id);
}
