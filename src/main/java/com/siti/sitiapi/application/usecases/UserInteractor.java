package com.siti.sitiapi.application.usecases;


import com.siti.sitiapi.application.gateway.UserGateway;
import com.siti.sitiapi.domain.entity.User;

import java.util.List;

public class UserInteractor {
    private final UserGateway userGateway;

    public UserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user){
        return userGateway.createUser(user);
    }
    public List<User> findAll() { return userGateway.listUsers(); }
    public void deleteUser(Long id) { userGateway.deleteUser(id); }
}
