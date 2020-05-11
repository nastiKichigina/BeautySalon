package iasa.spring.project.controlers;


import iasa.spring.project.entity.Record;
import iasa.spring.project.repositoryImpls.RecordRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class RecordsServiceController {
    @Autowired
    private RecordRepoImpl recordsService;


    @GetMapping(value = "/get-records")
    public ResponseEntity<Record> getRecords(){
        return new ResponseEntity(recordsService.getAllRecords(), HttpStatus.OK);
    }
}
