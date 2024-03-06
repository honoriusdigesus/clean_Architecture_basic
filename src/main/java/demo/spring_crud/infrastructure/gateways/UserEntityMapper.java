package demo.spring_crud.infrastructure.gateways;

import demo.spring_crud.domain.entity.User;
import demo.spring_crud.infrastructure.percistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj){
        return new UserEntity(userDomainObj.userName(), userDomainObj.password(), userDomainObj.email());
    }

    User toDomainObj(UserEntity userEntity){
        return new User(userEntity.getName(), userEntity.getEmail(), userEntity.getPassword());
    }
}
