package com.example.fitocalapp.service;

import com.example.fitocalapp.assembler.BmiAssembler;
import com.example.fitocalapp.domain.Bmi;
import org.springframework.stereotype.Service;

@Service
public class BmiService {

    private BmiAssembler bmiAssembler;

    public Bmi calculateBmi(double height, double weight) {
        bmiAssembler = new BmiAssembler();
        Bmi bmi = bmiAssembler.assembleBmi(height, weight);

        return bmi;
    }
}
