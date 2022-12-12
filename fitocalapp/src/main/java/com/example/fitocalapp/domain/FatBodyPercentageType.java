package com.example.fitocalapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FatBodyPercentageType {
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
    private final String fatBodyPercentageType;
    private final Integer minFatBodyPercentage;
    private final Integer maxFatBodyPercentage;

    public static FatBodyPercentageType getFatBodyPercentage(String gender, double fatBodyPercentage) {
        if ("M".equals(gender)) {
            if (fatBodyPercentage >= 2 && fatBodyPercentage <= 5) {
                return ESSENTIAL_FAT_MALE;
            } else if (fatBodyPercentage >= 6 && fatBodyPercentage <= 13) {
                return ATHLETES_MALE;
            } else if (fatBodyPercentage >= 14 && fatBodyPercentage <= 17) {
                return FIT_MALE;
            } else if (fatBodyPercentage >= 18 && fatBodyPercentage <= 24) {
                return AVERAGE_MALE;
            } else if (fatBodyPercentage >= 25) {
                return OBESE_MALE;
            } else {
                return null;
            }
        } else {
            if (fatBodyPercentage >= 10 && fatBodyPercentage <= 13) {
                return ESSENTIAL_FAT_FEMALE;
            } else if (fatBodyPercentage >= 14 && fatBodyPercentage <= 20) {
                return ATHLETES_FEMALE;
            } else if (fatBodyPercentage >= 21 && fatBodyPercentage <= 24) {
                return FIT_FEMALE;
            } else if (fatBodyPercentage >= 25 && fatBodyPercentage <= 31) {
                return AVERAGE_FEMALE;
            } else if (fatBodyPercentage >= 32) {
                return OBESE_FEMALE;
            } else {
                return null;
            }
        }
    }
}
