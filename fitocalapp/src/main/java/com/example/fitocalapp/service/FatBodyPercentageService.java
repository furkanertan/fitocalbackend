package com.example.fitocalapp.service;

import com.example.fitocalapp.assembler.FatBodyPercentageAssembler;
import com.example.fitocalapp.domain.Bmi;
import com.example.fitocalapp.domain.FatBodyPercentage;
import com.example.fitocalapp.dto.request.RequestFatBodyPercentageDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.fitocalapp.domain.FatBodyPercentageFormula.DEURENBERG_FORMULA;
import static com.example.fitocalapp.domain.Gender.FEMALE;
import static com.example.fitocalapp.domain.Gender.MALE;

@Service
@AllArgsConstructor
public class FatBodyPercentageService {

    private FatBodyPercentageAssembler fatBodyPercentageAssembler;
    private BmiService bmiService;

    public FatBodyPercentage calculateFatBodyPercentageByDeurenbergFormula(RequestFatBodyPercentageDto requestFatBodyPercentageDto) {
        Bmi bmi = bmiService.calculateBmi(requestFatBodyPercentageDto.getHeight(), requestFatBodyPercentageDto.getWeight());
        double fatBodyPercentage = calculateDeurenbergFormula(requestFatBodyPercentageDto, bmi);
        return fatBodyPercentageAssembler.assembleFatBodyPercentage(requestFatBodyPercentageDto, DEURENBERG_FORMULA, fatBodyPercentage, bmi);
    }

    public FatBodyPercentage calculateFatBodyPercentageByDeurenbergFormula2(RequestFatBodyPercentageDto requestFatBodyPercentageDto) {
        Bmi bmi = bmiService.calculateBmi(requestFatBodyPercentageDto.getHeight(), requestFatBodyPercentageDto.getWeight());
        double fatBodyPercentage = calculateDeurenbergFormula2(requestFatBodyPercentageDto, bmi);
        return fatBodyPercentageAssembler.assembleFatBodyPercentage(requestFatBodyPercentageDto, DEURENBERG_FORMULA, fatBodyPercentage, bmi);
    }

    public FatBodyPercentage calculateFatBodyPercentageByGallagherFormula(RequestFatBodyPercentageDto requestFatBodyPercentageDto) {
        Bmi bmi = bmiService.calculateBmi(requestFatBodyPercentageDto.getHeight(), requestFatBodyPercentageDto.getWeight());
        double fatBodyPercentage = calculateGallagherFormula(requestFatBodyPercentageDto, bmi);
        return fatBodyPercentageAssembler.assembleFatBodyPercentage(requestFatBodyPercentageDto, DEURENBERG_FORMULA, fatBodyPercentage, bmi);
    }

    public FatBodyPercentage calculateFatBodyPercentageByJacksonPollockFormula(RequestFatBodyPercentageDto requestFatBodyPercentageDto) {
        Bmi bmi = bmiService.calculateBmi(requestFatBodyPercentageDto.getHeight(), requestFatBodyPercentageDto.getWeight());
        double fatBodyPercentage = calculateJacksonPollockFormula(requestFatBodyPercentageDto, bmi);
        return fatBodyPercentageAssembler.assembleFatBodyPercentage(requestFatBodyPercentageDto, DEURENBERG_FORMULA, fatBodyPercentage, bmi);
    }

    public FatBodyPercentage calculateFatBodyPercentageByJacksonAsFormula(RequestFatBodyPercentageDto requestFatBodyPercentageDto) {
        Bmi bmi = bmiService.calculateBmi(requestFatBodyPercentageDto.getHeight(), requestFatBodyPercentageDto.getWeight());
        double fatBodyPercentage = calculateJacksonAsFormula(requestFatBodyPercentageDto, bmi);
        return fatBodyPercentageAssembler.assembleFatBodyPercentage(requestFatBodyPercentageDto, DEURENBERG_FORMULA, fatBodyPercentage, bmi);
    }

    private double calculateDeurenbergFormula(RequestFatBodyPercentageDto requestFatBodyPercentageDto, Bmi bmi) {
        return 1.20 * bmi.getBmi() + 0.23 * requestFatBodyPercentageDto.getAge() - 10.8 * getGenderMultiplier(requestFatBodyPercentageDto.getGender()) - 5.4;
    }

    private double calculateDeurenbergFormula2(RequestFatBodyPercentageDto requestFatBodyPercentageDto, Bmi bmi) {
        return 1.29 * bmi.getBmi() + 0.20 * requestFatBodyPercentageDto.getAge() - 11.4 * getGenderMultiplier(requestFatBodyPercentageDto.getGender()) - 8.0;
    }

    private double calculateGallagherFormula(RequestFatBodyPercentageDto requestFatBodyPercentageDto, Bmi bmi) {
        return 1.46 * bmi.getBmi() + 0.14 * requestFatBodyPercentageDto.getAge() - 11.6 * getGenderMultiplier(requestFatBodyPercentageDto.getGender()) - 10.0;
    }

    private double calculateJacksonPollockFormula(RequestFatBodyPercentageDto requestFatBodyPercentageDto, Bmi bmi) {
        return 1.61 * bmi.getBmi() + 0.13 * requestFatBodyPercentageDto.getAge() - 12.1 * getGenderMultiplier(requestFatBodyPercentageDto.getGender()) - 13.9;
    }

    private double calculateJacksonAsFormula(RequestFatBodyPercentageDto requestFatBodyPercentageDto, Bmi bmi) {
        return 1.39 * bmi.getBmi() + 0.16 * requestFatBodyPercentageDto.getAge() - 10.34 * getGenderMultiplier(requestFatBodyPercentageDto.getGender()) - 9.0;
    }

    private double getGenderMultiplier(String gender) {
        return MALE.getGender().equals(gender) ? MALE.getMultiplier() : FEMALE.getMultiplier();
    }
}