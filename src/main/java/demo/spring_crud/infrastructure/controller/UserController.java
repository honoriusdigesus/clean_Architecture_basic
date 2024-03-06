package demo.spring_crud.infrastructure.controller;


import demo.spring_crud.application.usecases.CreateUserInteractor;
import demo.spring_crud.domain.entity.User;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("user")
    public class UserController {
        private final CreateUserInteractor createUserInteractor;
        private final UserDTOMapper userDTOMapper;

        public UserController(CreateUserInteractor createUserInteractor, UserDTOMapper userDTOMapper) {
            this.createUserInteractor = createUserInteractor;
            this.userDTOMapper = userDTOMapper;
        }


        @PostMapping
        CreateUserResponse createUser(@RequestBody CreateUserRequest request) {
            User userBusinessObj = userDTOMapper.toUser(request);
            User user = createUserInteractor.createUser(userBusinessObj);
            return userDTOMapper.toResponse(user);
        }
    }

