package com.example.fitocalapp.domain;

import com.example.fitocalapp.domain.enums.BmiType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Bmi {
    private double height;
    private double weight;
    private double bmi;
    private BmiType bmiCategory;
    private String resultMessage;

    public void setBmiCategory(double bmi) {
        if (bmi < 16) {
            this.bmiCategory = BmiType.SEVERE_THINNESS;
            this.resultMessage = BmiType.SEVERE_THINNESS.getResultMessage();
        } else if (bmi >= 16 && bmi <= 17) {
            this.bmiCategory = BmiType.MODERATE_THINNESS;
            this.resultMessage = BmiType.MODERATE_THINNESS.getResultMessage();
        } else if (bmi > 17 && bmi <= 18.5) {
            this.bmiCategory = BmiType.MILD_THINNESS;
            this.resultMessage = BmiType.MILD_THINNESS.getResultMessage();
        } else if (bmi > 18.5 && bmi <= 25) {
            this.bmiCategory = BmiType.NORMAL;
            this.resultMessage = BmiType.NORMAL.getResultMessage();
        } else if (bmi > 25 && bmi <= 30) {
            this.bmiCategory = BmiType.OVERWEIGHT;
            this.resultMessage = BmiType.OVERWEIGHT.getResultMessage();
        } else if (bmi > 30 && bmi <= 35) {
            this.bmiCategory = BmiType.OBESE_CLASS_I;
            this.resultMessage = BmiType.OBESE_CLASS_I.getResultMessage();
        } else if (bmi > 35 && bmi <= 40) {
            this.bmiCategory = BmiType.OBESE_CLASS_II;
            this.resultMessage = BmiType.OBESE_CLASS_II.getResultMessage();
        } else if (bmi > 40) {
            this.bmiCategory = BmiType.OBESE_CLASS_III;
            this.resultMessage = BmiType.OBESE_CLASS_III.getResultMessage();
        }
    }
}
