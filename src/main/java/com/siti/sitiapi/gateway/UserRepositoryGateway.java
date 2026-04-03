package com.siti.sitiapi.gateway;

import com.siti.sitiapi.application.gateway.UserGateway;
import com.siti.sitiapi.domain.entity.User;
import com.siti.sitiapi.infrastructure.persistence.UserEntity;
import com.siti.sitiapi.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User user) {
        UserEntity userEntity = userEntityMapper.toEntity(user);
        return userEntityMapper.toUser(userRepository.save(userEntity));
    }

}
