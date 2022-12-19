package com.example.fitocalapp.domain;

import com.example.fitocalapp.domain.enums.BodyFatPercentageFormula;
import com.example.fitocalapp.domain.enums.BodyFatPercentageType;
import com.example.fitocalapp.domain.enums.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class BodyFatPercentage {
    private Integer age;
    private Gender gender;
    private double bodyFatPercentage;
    private BodyFatPercentageFormula bodyFatPercentageFormula;
    private BodyFatPercentageType bodyFatPercentageType;
    private Bmi bmi;
}
