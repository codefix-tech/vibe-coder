package com.minor.project.vibe_coder.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

     Long id;
     String name;
     String stripPriceId;
     Integer maxProject;
     Integer MaxTokensPerDay;
     Integer maxPreviews;
     Boolean unlimitedAi;
     Boolean active;

}
