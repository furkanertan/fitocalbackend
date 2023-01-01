package com.example.fitocalapp.assembler;

import com.example.fitocalapp.domain.IdealWeight;
import com.example.fitocalapp.domain.enums.IdealWeightFormula;
import com.example.fitocalapp.dto.request.RequestIdealWeightDto;
import org.springframework.stereotype.Component;

@Component
public class IdealWeightAssembler {

    public IdealWeight assembleIdealWeight(IdealWeightFormula formula, double idealWeightValue) {
        IdealWeight idealWeight = new IdealWeight();

        idealWeight.setIdealWeight(idealWeightValue);
        idealWeight.setFormula(formula.getName());

        return idealWeight;
    }

    public RequestIdealWeightDto assembleRequestDto(Integer age, double height, String gender){
        RequestIdealWeightDto requestIdealWeightDto = new RequestIdealWeightDto();

        requestIdealWeightDto.setAge(age);
        requestIdealWeightDto.setHeight(height);
        requestIdealWeightDto.setGender(gender);

        return requestIdealWeightDto;
    }
}
