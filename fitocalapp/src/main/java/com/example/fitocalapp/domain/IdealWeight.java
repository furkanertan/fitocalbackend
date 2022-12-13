package com.example.fitocalapp.domain;

import com.example.fitocalapp.domain.enums.IdealWeightFormula;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class IdealWeight {
    private Integer age;
    private double height;
    private String gender;
    private double idealWeight;
    private IdealWeightFormula formula;
}
