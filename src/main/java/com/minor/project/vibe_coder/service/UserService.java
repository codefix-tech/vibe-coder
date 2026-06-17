package com.minor.project.vibe_coder.service;

import com.minor.project.vibe_coder.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
     UserProfileResponse getProfile(Long userId);
}
