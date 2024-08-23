package org.example.springbootintegrationmybatis.batis;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userService;


    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return this.userService.createUser(user);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable("id") Integer id) {
        return this.userService.updateUser(id, user);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") Integer id) {
        return this.userService.getUser(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable("id") Integer id) {
        return this.userService.deleteUser(id);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return this.userService.findAll();
    }
}
