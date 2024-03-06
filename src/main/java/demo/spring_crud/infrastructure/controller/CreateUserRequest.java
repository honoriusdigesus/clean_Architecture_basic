package demo.spring_crud.infrastructure.controller;

public record CreateUserRequest(String name, String email, String password) {
}
