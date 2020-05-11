package iasa.spring.project.controlers;

import iasa.spring.project.entity.Service;
import iasa.spring.project.services.ServiceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class ServicesServiceController {
    @Autowired
    private ServiceService serviceService;


    @GetMapping(value = "/getServices")
    public ResponseEntity<Service> getServices(){
        return new ResponseEntity(serviceService.findAll(), HttpStatus.OK);
    }

}
