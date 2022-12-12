package com.example.fitocalapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GenderMultipliers {
    MALE("M", 0.01),
    FEMALE("F", 0.00);

    private final String gender;
    private final double multiplier;
}
