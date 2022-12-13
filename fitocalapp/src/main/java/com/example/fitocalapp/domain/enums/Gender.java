package com.example.fitocalapp.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Gender {
    MALE("M", 0.01, 5, 88.362),
    FEMALE("F", 0.00, -161, 447.593);

    private final String gender;
    private final double fatBodyPercentageMultiplier;
    private final double dailyCalorieMultiplierMifflin;
    private final double dailyCalorieMultiplierHarrisBenedict;

    public static Gender getGender(String gender) {
        if (MALE.gender.equals(gender)) {
            return MALE;
        } else {
            return FEMALE;
        }
    }
}
