package demo.spring_crud.application.usecases;

import demo.spring_crud.application.usecases.gateways.UserGateway;
import demo.spring_crud.domain.entity.User;


public class CreateUserInteractor {
    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) { //Usuario del domain, i.e, el creado con el records
        return userGateway.createUser(user);
    }
}
