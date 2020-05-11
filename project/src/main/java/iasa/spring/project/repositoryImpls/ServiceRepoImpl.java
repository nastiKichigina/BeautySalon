package iasa.spring.project.repositoryImpls;


import iasa.spring.project.entity.Service;
import iasa.spring.project.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ServiceRepoImpl {

    @Autowired
    private ServiceRepository serviceRepository;

    @Transactional(readOnly = true)
    public List<Service> getAllService() {
        return serviceRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Service> getAllByPrice(Integer price) {
        return serviceRepository.findByPrice(price);
    }
}
