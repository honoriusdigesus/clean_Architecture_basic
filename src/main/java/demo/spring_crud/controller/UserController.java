package demo.spring_crud.controller;

import demo.spring_crud.entity.User;
import demo.spring_crud.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user){
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<Optional<User>> getById(@PathVariable UUID uuid){
        return ResponseEntity.ok(userService.findById(uuid));
    }

    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user){
        return ResponseEntity.ok(userService.save(user));
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<Optional<String>> delete(@PathVariable UUID uuid){
        return ResponseEntity.ok(userService.deleteUser(uuid));
    }
}
