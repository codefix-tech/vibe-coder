package com.minor.project.vibe_coder.entity;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

 @FieldDefaults(level = AccessLevel.PRIVATE)
public class User {


     Long id;
     String name;
     String email;
     String passwordHash;
     String avtarUrl;

     Instant createdAt; // for date and time
     Instant updatedAt;
     Instant deletedAt;

}
