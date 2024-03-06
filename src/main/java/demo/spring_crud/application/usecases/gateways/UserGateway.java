package demo.spring_crud.application.usecases.gateways;


import demo.spring_crud.domain.entity.User;

public interface UserGateway {
    User createUser(User user); //Usuario del domain, i.e. el creado con el records
}

