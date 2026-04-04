package com.siti.sitiapi.domain.entity;

public record User (
        Long id,
        String username,
        String password,
        String email
) {}
