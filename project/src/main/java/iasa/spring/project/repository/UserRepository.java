package iasa.spring.project.repository;

import iasa.spring.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByRole(String role);
}

