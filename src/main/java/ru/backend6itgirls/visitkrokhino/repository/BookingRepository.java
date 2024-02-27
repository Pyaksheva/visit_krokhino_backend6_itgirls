package ru.backend6itgirls.visitkrokhino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.backend6itgirls.visitkrokhino.model.entity.Booking;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long>, JpaSpecificationExecutor<Booking> {
    Optional<Booking> findById(Long id);
}
