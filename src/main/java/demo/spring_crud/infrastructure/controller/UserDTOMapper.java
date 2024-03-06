package demo.spring_crud.infrastructure.controller;

import demo.spring_crud.domain.entity.User;

public class UserDTOMapper {
  CreateUserResponse toResponse(User user) {
    return new CreateUserResponse(user.userName(), user.email());
  }

  public User toUser(CreateUserRequest request) {
    return new User(request.name(), request.password(), request.email());
  }
}
