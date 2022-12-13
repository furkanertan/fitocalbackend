package com.example.fitocalapp.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Activity {
    BASAL_METABOLIC_RATE("BMR", "Basal Metabolic Rate(BMR)", 1),
    SEDENTARY("SDN","Sedentary: little or no exercise", 1.2),
    LIGHTLY_ACTIVE("LGT","Lightly Active: exercise/sports 1-3 days/week", 1.375),
    MODERATELY_ACTIVE("MDR","Moderately Active: exercise 4-5 days/week", 1.55),
    ACTIVE("ACT","Active: daily exercise or exercise 3-4 days/week", 1.725),
    VERY_ACTIVE("VRY","Very Active: intense exercise/sports 6-7 days/week", 1.9),
    EXTRA_ACTIVE("EXT","Extra active: very intense exercise/sports & physical job", 2.0);

    private final String code;
    private final String description;
    private final double multiplier;

    public static Activity fromActivity(String activityCode) {
        for (Activity activity : Activity.values()) {
            if (activity.getCode().equals(activityCode)) {
                return activity;
            }
        }
        return null;
    }
}
