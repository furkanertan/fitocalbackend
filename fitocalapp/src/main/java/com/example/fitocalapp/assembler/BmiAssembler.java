package com.example.fitocalapp.assembler;

import com.example.fitocalapp.domain.Bmi;

public class BmiAssembler {

    public Bmi assembleBmi(double height, double weight) {
        Bmi bmi = new Bmi();

        bmi.setHeight(height);
        bmi.setWeight(weight);
        double bmiValue = (weight / (height * height)) * 10000;
        bmi.setBmi(bmiValue);
        bmi.setBmiCategory(bmiValue);

        return bmi;
    }
}
