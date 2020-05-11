package iasa.spring.project.controlers;

import iasa.spring.project.entity.User;
import iasa.spring.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserServiceController {
    @Autowired
    private UserService userService;


    @GetMapping(value = "/user")
    public ResponseEntity<User> getUser(@RequestBody Long id){

        return new ResponseEntity(userService.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/user/byStatus/{role}")
    public ResponseEntity<User> getUser(@PathVariable String role){
        return new ResponseEntity(userService.findByRole(role), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/user/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteById(id);
    }

    @PostMapping(value = "/user/save")
    public ResponseEntity<Object> setUser(@RequestBody User users){
        userService.save(users);
        return new ResponseEntity<>("Add", HttpStatus.CREATED);
    }

    @PutMapping(value = "/user/save")
    public ResponseEntity<Object> updateUser(@RequestBody User users){
        userService.save(users);
        return new ResponseEntity<>("Update", HttpStatus.OK);
    }




}