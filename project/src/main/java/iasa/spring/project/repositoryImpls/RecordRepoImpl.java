package iasa.spring.project.repositoryImpls;


import iasa.spring.project.entity.Record;
import iasa.spring.project.repository.RecordsRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Service

public class RecordRepoImpl {

    @Autowired
    private RecordsRepository recordsRepository;

    @Transactional(readOnly = true)
    public List<Record> getAllRecords() {
        return recordsRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Record> getAllRecordsByDate(Timestamp date) {
        return recordsRepository.findByDate(date);
    }
}
