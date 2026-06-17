package com.minor.project.vibe_coder.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
