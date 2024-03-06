package demo.spring_crud.infrastructure.gateways;

import demo.spring_crud.application.usecases.gateways.UserGateway;
import demo.spring_crud.domain.entity.User;
import demo.spring_crud.infrastructure.percistence.UserEntity;
import demo.spring_crud.infrastructure.percistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }


    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity saveObj = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(saveObj);
    }
}
