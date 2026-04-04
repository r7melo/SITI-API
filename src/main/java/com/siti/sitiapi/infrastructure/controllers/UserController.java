package com.siti.sitiapi.infrastructure.controllers;

import com.siti.sitiapi.application.usecases.UserInteractor;
import com.siti.sitiapi.domain.entity.User;
import com.siti.sitiapi.infrastructure.controllers.dto.UserRequest;
import com.siti.sitiapi.infrastructure.controllers.dto.UserResponse;
import com.siti.sitiapi.infrastructure.controllers.mapper.UserDTOMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("users")
public class UserController {
    private final UserInteractor userInteractor;
    private final UserDTOMapper userDTOMapper;

    public UserController(UserInteractor userInteractor, UserDTOMapper userDTOMapper) {
        this.userInteractor = userInteractor;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping
    UserResponse create(@RequestBody UserRequest reponse){
        User user = userDTOMapper.toUser(reponse);
        return userDTOMapper.toResponse(userInteractor.createUser(user));
    }

    @GetMapping
    List<UserResponse> getAll() {
        List<User> users = userInteractor.findAll();
        return users.stream()
                .map(userDTOMapper::toResponse)
                .toList();
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id){
        userInteractor.deleteUser(id);
    }

}

