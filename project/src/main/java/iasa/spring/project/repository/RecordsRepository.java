package iasa.spring.project.repository;

import iasa.spring.project.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface RecordsRepository extends JpaRepository<Record, Long> {
    List<Record> findByDate(Timestamp date);
}
