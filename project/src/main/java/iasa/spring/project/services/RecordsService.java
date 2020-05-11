package iasa.spring.project.services;

import iasa.spring.project.entity.Record;
import iasa.spring.project.repositoryImpls.RecordRepoImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

@Repository
@Transactional
@AllArgsConstructor
public class RecordsService {

    private final RecordRepoImpl recordRepo;

    public List<Record> findAllByDate(Timestamp date) {
        return recordRepo.getAllRecordsByDate(date);
    }

    public List<Record> findAll() {
        return recordRepo.getAllRecords();
    }
}
