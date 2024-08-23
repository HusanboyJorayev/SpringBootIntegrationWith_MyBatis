package org.example.springbootintegrationmybatis.batis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;

    public ResponseEntity<?> createUser(User user) {
        userMapper.createUser(user);
        return ResponseEntity.ok().body("User created successfully");
    }

    public ResponseEntity<?> getUser(Integer id) {
        return ResponseEntity.ok(this.userMapper.getUserById(id));
    }

    public ResponseEntity<?> updateUser(Integer id, User user) {
        user.setId(id);
        userMapper.updateUser(user);
        return ResponseEntity.ok().body("User updated successfully");
    }

    public ResponseEntity<?> deleteUser(Integer id) {
        userMapper.deleteUserById(id);
        return ResponseEntity.ok().body("User deleted successfully");
    }

    public List<User> findAll() {
        return this.userMapper.getAllUsers();
    }
}
