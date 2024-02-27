package ru.backend6itgirls.visitkrokhino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.backend6itgirls.visitkrokhino.model.entity.Booking;
import ru.backend6itgirls.visitkrokhino.model.entity.Timetable;

import java.util.Optional;

public interface TimetableRepository extends JpaRepository<Timetable, Long>, JpaSpecificationExecutor<Timetable> {
    Optional<Timetable> findById(Long id);
}
