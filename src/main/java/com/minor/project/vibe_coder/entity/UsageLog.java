package com.minor.project.vibe_coder.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsageLog {
  Long id;
  User user;

  Project project;
  String action;

  Instant tokenUsed;
  Instant durationMs;

  String metaData;

  Instant createdAt;



}
