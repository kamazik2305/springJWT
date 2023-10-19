package ru.springJWT.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.springJWT.user.User;
import ru.springJWT.user.UserRepository;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/v1/demo-controller")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello");
    }

    @GetMapping("/users")
    public List<User> findUsers()
    {
        return userRepository.findAll();
    }
}
