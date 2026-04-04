package com.siti.sitiapi.infrastructure.controllers.mapper;


import com.siti.sitiapi.domain.entity.User;
import com.siti.sitiapi.infrastructure.controllers.dto.UserRequest;
import com.siti.sitiapi.infrastructure.controllers.dto.UserResponse;

public class UserDTOMapper {

    public User toUser(UserRequest request){
        return new User(
                null,
                request.username(),
                request.password(),
                request.email()
        );
    }

    public UserResponse toResponse(User user){
        return new UserResponse(
                user.id(),
                user.username(),
                user.email()
        );
    }

}
