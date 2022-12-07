package com.example.fitocalapp.domain;

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

    public void setBmiCategory(double bmi){
        if (bmi < 16) {
            this.bmiCategory = BmiType.SEVERE_THINNESS;
        } else if (bmi >= 16 && bmi < 17) {
            this.bmiCategory = BmiType.MODERATE_THINNESS;
        } else if (bmi >= 17 && bmi < 18.5) {
            this.bmiCategory = BmiType.MILD_THINNESS;
        } else if (bmi >= 18.5 && bmi < 25) {
            this.bmiCategory = BmiType.NORMAL;
        } else if (bmi >= 25 && bmi < 30) {
            this.bmiCategory = BmiType.OVERWEIGHT;
        } else if (bmi >= 30 && bmi < 35) {
            this.bmiCategory = BmiType.OBESE_CLASS_I;
        } else if (bmi >= 35 && bmi < 40) {
            this.bmiCategory = BmiType.OBESE_CLASS_II;
        } else if (bmi >= 40) {
            this.bmiCategory = BmiType.OBESE_CLASS_III;
        }
    }
}
