package com.example.fitocalapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FatBodyPercentageType {
    ESSENTIAL_FAT_MALE("M", "Essential Fat","2-5%"),
    ESSENTIAL_FAT_FEMALE("F","Essential Fat","10-13%"),
    ATHLETES_MALE("M","Athletes","6-13%"),
    ATHLETES_FEMALE("F","Athletes","14-20%"),
    FIT_MALE("Fit","","14-17%"),
    FIT_FEMALE("Fit","","21-24%"),
    AVERAGE_MALE("Average","","18-24%"),
    AVERAGE_FEMALE("Average","","25-31%"),
    OBESE_MALE("Obese","","25% and above"),
    OBESE_FEMALE("Obese","","32% and above");

    private final String gender;
    private final String fatBodyPercentageType;
    private final String fatBodyPercentageRate;
}
