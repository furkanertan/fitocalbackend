package com.example.fitocalapp.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DailyCalorieFormula {
    MIFFLIN("Mifflin", "Mifflin-St Jeor"),
    HARRIS_BENEDICT("Harris", "Harris-Benedict");

    private final String code;
    private final String name;

    public static DailyCalorieFormula fromFormula(String formulaCode) {
        for (DailyCalorieFormula dailyCalorieFormula : DailyCalorieFormula.values()) {
            if (dailyCalorieFormula.getCode().equals(formulaCode)) {
                return dailyCalorieFormula;
            }
        }
        return null;
    }
}
