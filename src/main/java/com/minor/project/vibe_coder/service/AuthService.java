package com.minor.project.vibe_coder.service;

import com.minor.project.vibe_coder.dto.auth.AuthResponse;
import com.minor.project.vibe_coder.dto.auth.LoginRequest;
import com.minor.project.vibe_coder.dto.auth.SignupRequest;


public interface AuthService  {

    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
