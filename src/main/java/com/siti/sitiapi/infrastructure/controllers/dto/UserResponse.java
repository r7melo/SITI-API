package com.siti.sitiapi.infrastructure.controllers.dto;

public record UserResponse(
        Long id,
        String username,
        String email
) {}

