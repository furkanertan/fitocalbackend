package com.example.fitocalapp.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class GeneralBodyReport {
    private int id;
    private Integer age;
    private String gender;
    private double height;
    private double weight;
    private double bmi;
    private String bodyType;
    private double idealWeight;
    private double bodyFatPercentageRate;
    private double bodyFatMass;
    private double leanBodyMass;
    private double calorieToLoseWeight;
    private double calorieToStaySame;
    private double calorieToGainWeight;
}
