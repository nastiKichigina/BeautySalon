package iasa.spring.project.services;

import iasa.spring.project.entity.User;
import iasa.spring.project.repositoryImpls.UserRepoImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UserService {


    private final UserRepoImpl userRepo;


    public List<User> findByRole(String status) {
        return userRepo.getUser(status);
    }

    public User findById(Long id) {
        return userRepo.getUser(id);
    }


    public void deleteById(Long id) {
        userRepo.deleteUser(id);
    }

    public void save(User user) {
        userRepo.setUser(user);
    }

}