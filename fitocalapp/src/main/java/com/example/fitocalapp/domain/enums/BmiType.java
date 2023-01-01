package com.example.fitocalapp.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BmiType {
    SEVERE_THINNESS("Severe Thinness", "You are severely underweight. You should see a doctor to gain weight!"),
    MODERATE_THINNESS("Moderate Thinness", "You are moderately underweight. You might see a doctor to gain some weight!"),
    MILD_THINNESS("Mild Thinness", "You are mildly underweight. Try to gain a bit weight to get in healthy range!"),
    NORMAL("Normal", "You are in healthy BMI range. Keep it up!"),
    OVERWEIGHT("Overweight", "You are overweight. Try to loose a bit weight to get in healthy range!"),
    OBESE_CLASS_I("Obese Class I", "You are obese. You might see a doctor to loose weight!"),
    OBESE_CLASS_II("Obese Class II", "You are severely obese. You should see a doctor to loose weight!"),
    OBESE_CLASS_III("Obese Class III", "You are morbidly obese. You should see a doctor to loose weight!");

    private final String bmiCategory;
    private final String resultMessage;
}
