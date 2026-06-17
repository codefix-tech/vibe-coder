package com.minor.project.vibe_coder.controller;


import com.minor.project.vibe_coder.dto.auth.AuthResponse;
import com.minor.project.vibe_coder.dto.auth.SignupRequest;
import com.minor.project.vibe_coder.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    public ResponseEntity<AuthResponse> signup(SignupRequest request){
        return ResponseEntity.ok(authService.signup(request));
    }
}
