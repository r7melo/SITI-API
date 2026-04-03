package com.siti.sitiapi.application.usecases;


import com.siti.sitiapi.application.gateway.UserGateway;
import com.siti.sitiapi.domain.entity.User;

public class CreateUserInteractor {
    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user){
        return userGateway.createUser(user);
    }


}
