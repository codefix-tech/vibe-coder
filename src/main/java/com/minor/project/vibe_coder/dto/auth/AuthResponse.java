package com.minor.project.vibe_coder.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user){


}
