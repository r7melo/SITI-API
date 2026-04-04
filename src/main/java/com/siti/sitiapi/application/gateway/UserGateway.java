package com.siti.sitiapi.application.gateway;

import com.siti.sitiapi.domain.entity.User;

import java.util.List;

public interface UserGateway {
    User createUser(User user);
    List<User> listUsers();
    void deleteUser(Long id);
}

