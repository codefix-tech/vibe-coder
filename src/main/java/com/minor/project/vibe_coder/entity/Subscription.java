package com.minor.project.vibe_coder.entity;

import com.minor.project.vibe_coder.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    Long id ;
    User user;

    Plan plan;

    SubscriptionStatus status;
    String StripSubscriptionId;
    String StripCustomerId;
    Instant CurrentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd;
    Instant createdAt;
    Instant updatedAt;



}
