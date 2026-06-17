package com.minor.project.vibe_coder.service;

import com.minor.project.vibe_coder.dto.auth.AuthResponse;
import com.minor.project.vibe_coder.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService  {

    AuthResponse signup(SignupRequest request);
}
