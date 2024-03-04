package demo.spring_crud.service;

import demo.spring_crud.entity.User;

import java.util.Optional;
import java.util.UUID;

public interface UserService {
    User save(User user);
    Optional<User> findById(UUID id);
}
