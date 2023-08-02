package co.develhope.Calendar.repository;

import co.develhope.Calendar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}