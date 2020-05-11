package iasa.spring.project.services;

import iasa.spring.project.entity.Service;
import iasa.spring.project.repository.ServiceRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Log4j2
@org.springframework.stereotype.Service
@Transactional
@AllArgsConstructor

public class ServiceService {
    private final ServiceRepository serviceRepository;

    public List<Service> findAllByPrice(Integer id) {
        log.info("get list of services by price");
        return serviceRepository.findByPrice(id);
    }

    public List<Service> findAll() {
        log.info("get list of all services");
        return serviceRepository.findAll();
    }
}
