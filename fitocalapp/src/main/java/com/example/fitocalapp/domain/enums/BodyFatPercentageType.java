package com.example.fitocalapp.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BodyFatPercentageType {
    ESSENTIAL_FAT_MALE("M", "Essential Fat", 2, 5),
    ESSENTIAL_FAT_FEMALE("F", "Essential Fat", 10, 13),
    ATHLETES_MALE("M", "Athletes", 6, 13),
    ATHLETES_FEMALE("F", "Athletes", 14, 20),
    FIT_MALE("M", "Fit", 14, 17),
    FIT_FEMALE("F", "Fit", 21, 24),
    AVERAGE_MALE("M", "Average", 18, 24),
    AVERAGE_FEMALE("F", "Average", 25, 31),
    OBESE_MALE("M", "Obese", 25, Integer.MAX_VALUE),
    OBESE_FEMALE("F", "Obese", 32, Integer.MAX_VALUE);

    private final String gender;
    private final String bodyFatPercentageType;
    private final Integer minBodyFatPercentage;
    private final Integer maxBodyFatPercentage;

    public static BodyFatPercentageType getBodyFatPercentage(String gender, double bodyFatPercentage) {
        if ("M".equals(gender)) {
            if (bodyFatPercentage >= 2 && bodyFatPercentage <= 5) {
                return ESSENTIAL_FAT_MALE;
            } else if (bodyFatPercentage >= 6 && bodyFatPercentage <= 13) {
                return ATHLETES_MALE;
            } else if (bodyFatPercentage >= 14 && bodyFatPercentage <= 17) {
                return FIT_MALE;
            } else if (bodyFatPercentage >= 18 && bodyFatPercentage <= 24) {
                return AVERAGE_MALE;
            } else if (bodyFatPercentage >= 25) {
                return OBESE_MALE;
            } else {
                return null;
            }
        } else {
            if (bodyFatPercentage >= 10 && bodyFatPercentage <= 13) {
                return ESSENTIAL_FAT_FEMALE;
            } else if (bodyFatPercentage >= 14 && bodyFatPercentage <= 20) {
                return ATHLETES_FEMALE;
            } else if (bodyFatPercentage >= 21 && bodyFatPercentage <= 24) {
                return FIT_FEMALE;
            } else if (bodyFatPercentage >= 25 && bodyFatPercentage <= 31) {
                return AVERAGE_FEMALE;
            } else if (bodyFatPercentage >= 32) {
                return OBESE_FEMALE;
            } else {
                return null;
            }
        }
    }
}
