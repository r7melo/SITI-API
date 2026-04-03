package com.siti.sitiapi.infrastructure.controllers.dto;

public record CreateUserRequest(
        String username,
        String password,
        String email
) {}
