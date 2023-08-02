package co.develhope.Calendar.repository;

import co.develhope.Calendar.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}