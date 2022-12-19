package com.example.fitocalapp.service;

import com.example.fitocalapp.assembler.BodyFatPercentageAssembler;
import com.example.fitocalapp.domain.Bmi;
import com.example.fitocalapp.domain.BodyFatPercentage;
import com.example.fitocalapp.dto.request.RequestBodyFatPercentageDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.fitocalapp.domain.enums.BodyFatPercentageFormula.DEURENBERG_FORMULA;
import static com.example.fitocalapp.domain.enums.Gender.FEMALE;
import static com.example.fitocalapp.domain.enums.Gender.MALE;

@Service
@AllArgsConstructor
public class BodyFatPercentageService {

    private BodyFatPercentageAssembler bodyFatPercentageAssembler;
    private BmiService bmiService;

    public BodyFatPercentage calculateBodyFatPercentageByDeurenbergFormula(RequestBodyFatPercentageDto requestBodyFatPercentageDto) {
        Bmi bmi = bmiService.calculateBmi(requestBodyFatPercentageDto.getHeight(), requestBodyFatPercentageDto.getWeight());
        double bodyFatPercentage = calculateDeurenbergFormula(requestBodyFatPercentageDto, bmi);
        return bodyFatPercentageAssembler.assembleBodyFatPercentage(requestBodyFatPercentageDto, DEURENBERG_FORMULA, bodyFatPercentage, bmi);
    }

    public BodyFatPercentage calculateBodyFatPercentageByDeurenbergFormula2(RequestBodyFatPercentageDto requestBodyFatPercentageDto) {
        Bmi bmi = bmiService.calculateBmi(requestBodyFatPercentageDto.getHeight(), requestBodyFatPercentageDto.getWeight());
        double bodyFatPercentage = calculateDeurenbergFormula2(requestBodyFatPercentageDto, bmi);
        return bodyFatPercentageAssembler.assembleBodyFatPercentage(requestBodyFatPercentageDto, DEURENBERG_FORMULA, bodyFatPercentage, bmi);
    }

    public BodyFatPercentage calculateBodyFatPercentageByGallagherFormula(RequestBodyFatPercentageDto requestBodyFatPercentageDto) {
        Bmi bmi = bmiService.calculateBmi(requestBodyFatPercentageDto.getHeight(), requestBodyFatPercentageDto.getWeight());
        double bodyFatPercentage = calculateGallagherFormula(requestBodyFatPercentageDto, bmi);
        return bodyFatPercentageAssembler.assembleBodyFatPercentage(requestBodyFatPercentageDto, DEURENBERG_FORMULA, bodyFatPercentage, bmi);
    }

    public BodyFatPercentage calculateBodyFatPercentageByJacksonPollockFormula(RequestBodyFatPercentageDto requestBodyFatPercentageDto) {
        Bmi bmi = bmiService.calculateBmi(requestBodyFatPercentageDto.getHeight(), requestBodyFatPercentageDto.getWeight());
        double bodyFatPercentage = calculateJacksonPollockFormula(requestBodyFatPercentageDto, bmi);
        return bodyFatPercentageAssembler.assembleBodyFatPercentage(requestBodyFatPercentageDto, DEURENBERG_FORMULA, bodyFatPercentage, bmi);
    }

    public BodyFatPercentage calculateBodyFatPercentageByJacksonAsFormula(RequestBodyFatPercentageDto requestBodyFatPercentageDto) {
        Bmi bmi = bmiService.calculateBmi(requestBodyFatPercentageDto.getHeight(), requestBodyFatPercentageDto.getWeight());
        double bodyFatPercentage = calculateJacksonAsFormula(requestBodyFatPercentageDto, bmi);
        return bodyFatPercentageAssembler.assembleBodyFatPercentage(requestBodyFatPercentageDto, DEURENBERG_FORMULA, bodyFatPercentage, bmi);
    }

    private double calculateDeurenbergFormula(RequestBodyFatPercentageDto requestBodyFatPercentageDto, Bmi bmi) {
        return 1.20 * bmi.getBmi() + 0.23 * requestBodyFatPercentageDto.getAge() - 10.8 * getGenderMultiplier(requestBodyFatPercentageDto.getGender()) - 5.4;
    }

    private double calculateDeurenbergFormula2(RequestBodyFatPercentageDto requestBodyFatPercentageDto, Bmi bmi) {
        return 1.29 * bmi.getBmi() + 0.20 * requestBodyFatPercentageDto.getAge() - 11.4 * getGenderMultiplier(requestBodyFatPercentageDto.getGender()) - 8.0;
    }

    private double calculateGallagherFormula(RequestBodyFatPercentageDto requestBodyFatPercentageDto, Bmi bmi) {
        return 1.46 * bmi.getBmi() + 0.14 * requestBodyFatPercentageDto.getAge() - 11.6 * getGenderMultiplier(requestBodyFatPercentageDto.getGender()) - 10.0;
    }

    private double calculateJacksonPollockFormula(RequestBodyFatPercentageDto requestBodyFatPercentageDto, Bmi bmi) {
        return 1.61 * bmi.getBmi() + 0.13 * requestBodyFatPercentageDto.getAge() - 12.1 * getGenderMultiplier(requestBodyFatPercentageDto.getGender()) - 13.9;
    }

    private double calculateJacksonAsFormula(RequestBodyFatPercentageDto requestBodyFatPercentageDto, Bmi bmi) {
        return 1.39 * bmi.getBmi() + 0.16 * requestBodyFatPercentageDto.getAge() - 10.34 * getGenderMultiplier(requestBodyFatPercentageDto.getGender()) - 9.0;
    }

    private double getGenderMultiplier(String gender) {
        return MALE.getGender().equals(gender) ? MALE.getBodyFatPercentageMultiplier() : FEMALE.getBodyFatPercentageMultiplier();
    }
}