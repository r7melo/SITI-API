package com.siti.sitiapi.infrastructure.controllers.mapper;


import com.siti.sitiapi.domain.entity.User;
import com.siti.sitiapi.infrastructure.controllers.dto.CreateUserRequest;
import com.siti.sitiapi.infrastructure.controllers.dto.CreateUserResponse;

public class UserDTOMapper {

    public User toUser(CreateUserRequest request){
        return new User(
                request.username(),
                request.password(),
                request.email()
        );
    }

    public CreateUserResponse toResponse(User user){
        return new CreateUserResponse(
                user.username(),
                user.email()
        );
    }

}
