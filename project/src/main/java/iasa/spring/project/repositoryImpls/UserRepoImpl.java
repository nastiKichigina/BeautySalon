package iasa.spring.project.repositoryImpls;


import iasa.spring.project.entity.User;
import iasa.spring.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class UserRepoImpl {

    @Autowired
    private UserRepository userRepository;


    @Transactional(readOnly = true)
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<User> getUser(String role) {
        return userRepository.findByRole(role);
    }

    @Transactional(readOnly = true)
    public User getUser(Long id) {
        if (userRepository.findById(id).isPresent())
            return userRepository.findById(id).get();
        else return new User();
    }

    public void setUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}