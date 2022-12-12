package com.example.fitocalapp.service;

import com.example.fitocalapp.assembler.FatBodyPercentageAssembler;
import com.example.fitocalapp.domain.Bmi;
import com.example.fitocalapp.dto.request.RequestFatBodyPercentageDto;
import com.example.fitocalapp.dto.response.ResponseFatBodyPercentageDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.fitocalapp.domain.GenderMultipliers.FEMALE;
import static com.example.fitocalapp.domain.GenderMultipliers.MALE;

@Service
@AllArgsConstructor
public class FatBodyPercentageService {

    private FatBodyPercentageAssembler fatBodyPercentageAssembler;
    private BmiService bmiService;

    public ResponseFatBodyPercentageDto calculateFatBodyPercentage(RequestFatBodyPercentageDto requestFatBodyPercentageDto) {
        Bmi bmi = bmiService.calculateBmi(requestFatBodyPercentageDto.getHeight(), requestFatBodyPercentageDto.getWeight());
        double fatBodyPercentage = calculateDeurenbergFormula(requestFatBodyPercentageDto,bmi);
        return fatBodyPercentageAssembler.assembleFatBodyPercentage(requestFatBodyPercentageDto, bmi, fatBodyPercentage);
    }

    private double calculateDeurenbergFormula(RequestFatBodyPercentageDto requestFatBodyPercentageDto, Bmi bmi){
        return 1.20 * bmi.getBmi() + 0.23 * requestFatBodyPercentageDto.getAge() - 10.8 * getGenderMultiplier(requestFatBodyPercentageDto.getGender()) - 5.4;
    }

    private double calculateDeurenbergFormula2(RequestFatBodyPercentageDto requestFatBodyPercentageDto, Bmi bmi){
        return 1.29 * bmi.getBmi() + 0.20 * requestFatBodyPercentageDto.getAge() - 11.4 * getGenderMultiplier(requestFatBodyPercentageDto.getGender()) - 8.0;
    }

    private double calculateGallagherFormula(RequestFatBodyPercentageDto requestFatBodyPercentageDto, Bmi bmi){
        return 1.46 * bmi.getBmi() + 0.14 * requestFatBodyPercentageDto.getAge() - 11.6 * getGenderMultiplier(requestFatBodyPercentageDto.getGender()) - 10.0;
    }

    private double calculateJacksonPollockFormula(RequestFatBodyPercentageDto requestFatBodyPercentageDto, Bmi bmi){
        return 1.61 * bmi.getBmi() + 0.13 * requestFatBodyPercentageDto.getAge() - 12.1 * getGenderMultiplier(requestFatBodyPercentageDto.getGender()) - 13.9;
    }

    private double calculateJacksonAsFormula(RequestFatBodyPercentageDto requestFatBodyPercentageDto, Bmi bmi){
        return 1.39 * bmi.getBmi() + 0.16 * requestFatBodyPercentageDto.getAge() - 10.34 * getGenderMultiplier(requestFatBodyPercentageDto.getGender()) - 9.0;
    }

    private double getGenderMultiplier(String gender){
        return MALE.getGender().equals(gender) ? MALE.getMultiplier() : FEMALE.getMultiplier();
    }
}