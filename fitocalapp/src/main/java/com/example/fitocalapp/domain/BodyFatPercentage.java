package com.example.fitocalapp.domain;

import com.example.fitocalapp.domain.enums.BodyFatPercentageFormula;
import com.example.fitocalapp.domain.enums.BodyFatPercentageType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class BodyFatPercentage {
    private int id;
    private double bodyFatPercentageRate;
    private BodyFatPercentageFormula formula;
    private BodyFatPercentageType type;
    private double bodyFatMass;
    private double leanBodyMass;
    private double bmi;
}
