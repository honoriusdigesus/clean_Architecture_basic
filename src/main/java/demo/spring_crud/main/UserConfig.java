package demo.spring_crud.main;

import demo.spring_crud.application.usecases.CreateUserInteractor;
import demo.spring_crud.application.usecases.gateways.UserGateway;
import demo.spring_crud.infrastructure.controller.UserDTOMapper;
import demo.spring_crud.infrastructure.gateways.UserEntityMapper;
import demo.spring_crud.infrastructure.gateways.UserRepositoryGateway;
import demo.spring_crud.infrastructure.percistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
