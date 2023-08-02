package co.develhope.Calendar.repository;

import co.develhope.Calendar.model.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarRepository extends JpaRepository<Calendar, Integer> {
}