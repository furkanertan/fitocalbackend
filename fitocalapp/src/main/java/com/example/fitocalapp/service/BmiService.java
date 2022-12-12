package com.example.fitocalapp.service;

import com.example.fitocalapp.assembler.BmiAssembler;
import com.example.fitocalapp.domain.Bmi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BmiService {

    private BmiAssembler bmiAssembler;

    public Bmi calculateBmi(double height, double weight) {
        return bmiAssembler.assembleBmi(height, weight);
    }
}
