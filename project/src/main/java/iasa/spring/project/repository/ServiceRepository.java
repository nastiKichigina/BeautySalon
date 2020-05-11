package iasa.spring.project.repository;

import iasa.spring.project.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findByPrice(Integer price);
}
