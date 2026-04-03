package com.siti.sitiapi.gateway;

import com.siti.sitiapi.domain.entity.User;
import com.siti.sitiapi.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User user){
        return UserEntity.builder()
                .username(user.username())
                .password(user.password())
                .email(user.email())
                .build();
    }

    User toUser(UserEntity userEntity){
        return new User(
                userEntity.getUsername(),
                userEntity.getPassword(),
                userEntity.getEmail()
        );
    }
}
