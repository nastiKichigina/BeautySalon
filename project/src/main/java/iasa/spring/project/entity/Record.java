package iasa.spring.project.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "record")
@NoArgsConstructor
public class Record {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Timestamp date;

    private String type;

    @ManyToOne
    private Service services;

    @ManyToOne
    private User client;

}
