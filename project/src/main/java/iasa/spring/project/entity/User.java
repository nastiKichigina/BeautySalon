package iasa.spring.project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class User implements Serializable{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String name;
    private String role;

    private String login;
    private String password;

    @OneToMany(mappedBy = "client")
    @JsonIgnore
    private List<Record> recordsList;

    @OneToMany(mappedBy = "master")
    @JsonIgnore
    private List<Service> masterServices;


    @OneToMany(mappedBy = "manager")
    @JsonIgnore
    private List<Service> managerServices;


    public User(String name,String role) {
        this.name = name;
        this.role = role;
    }

    public User(String name, String login, String password, String role) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + id +
                ", userName='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
