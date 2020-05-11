package iasa.spring.project.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@Table(name = "service")
@NoArgsConstructor
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer price;
    private String name;

    @ManyToOne
    @JoinColumn(name = "master_id", referencedColumnName = "id")
    private User master;


    @ManyToOne
    @JoinColumn(name = "manager_id", referencedColumnName = "id")
    private User manager;


    @OneToMany
    private List<Record> service;


}
