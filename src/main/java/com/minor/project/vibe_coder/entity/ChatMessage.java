package com.minor.project.vibe_coder.entity;

import com.minor.project.vibe_coder.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    Long id;

    ChatSession chatSession;

    String content;

    MessageRole messageRole;

    String toolsCalls;

    Instant tokenUsed;

    Instant createdAt;


}
