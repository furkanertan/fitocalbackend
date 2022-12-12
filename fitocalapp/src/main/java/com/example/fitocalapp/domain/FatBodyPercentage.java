package com.example.fitocalapp.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class FatBodyPercentage {
    private Integer age;
    private Gender gender;
    private double fatBodyPercentage;
    private FatBodyPercentageFormula fatBodyPercentageFormula;
    private FatBodyPercentageType fatBodyPercentageType;
    private Bmi bmi;
}
