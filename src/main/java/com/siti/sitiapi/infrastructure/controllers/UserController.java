package com.siti.sitiapi.infrastructure.controllers;

import com.siti.sitiapi.application.usecases.CreateUserInteractor;
import com.siti.sitiapi.domain.entity.User;
import com.siti.sitiapi.infrastructure.controllers.dto.CreateUserRequest;
import com.siti.sitiapi.infrastructure.controllers.dto.CreateUserResponse;
import com.siti.sitiapi.infrastructure.controllers.mapper.UserDTOMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    private final CreateUserInteractor createUserInteractor;
    private final UserDTOMapper userDTOMapper;

    public UserController(CreateUserInteractor createUserInteractor, UserDTOMapper userDTOMapper) {
        this.createUserInteractor = createUserInteractor;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping
    CreateUserResponse create(@RequestBody CreateUserRequest reponse){
        User user = userDTOMapper.toUser(reponse);
        return userDTOMapper.toResponse(createUserInteractor.createUser(user));
    }
}

