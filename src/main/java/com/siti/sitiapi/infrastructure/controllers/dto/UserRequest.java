package com.siti.sitiapi.infrastructure.controllers.dto;

public record UserRequest(
        String username,
        String password,
        String email
) {}
