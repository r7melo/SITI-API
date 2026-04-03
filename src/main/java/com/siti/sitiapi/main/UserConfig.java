package com.siti.sitiapi.main;

import com.siti.sitiapi.application.gateway.UserGateway;
import com.siti.sitiapi.application.usecases.CreateUserInteractor;
import com.siti.sitiapi.gateway.UserEntityMapper;
import com.siti.sitiapi.gateway.UserRepositoryGateway;
import com.siti.sitiapi.infrastructure.controllers.mapper.UserDTOMapper;
import com.siti.sitiapi.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway){
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper){
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper(){
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper(){
        return new UserDTOMapper();
    }

}
