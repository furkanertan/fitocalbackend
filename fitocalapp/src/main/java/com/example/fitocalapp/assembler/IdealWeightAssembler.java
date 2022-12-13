package com.example.fitocalapp.assembler;

import com.example.fitocalapp.domain.IdealWeight;
import com.example.fitocalapp.domain.enums.IdealWeightFormula;
import com.example.fitocalapp.dto.request.RequestIdealWeightDto;
import org.springframework.stereotype.Component;

@Component
public class IdealWeightAssembler {

    public IdealWeight assembleIdealWeight(RequestIdealWeightDto requestIdealWeightDto, double idealWeightValue) {
        IdealWeight idealWeight = new IdealWeight();

        idealWeight.setAge(requestIdealWeightDto.getAge());
        idealWeight.setHeight(requestIdealWeightDto.getHeight());
        idealWeight.setGender(requestIdealWeightDto.getGender());
        idealWeight.setIdealWeight(idealWeightValue);
        idealWeight.setFormula(IdealWeightFormula.fromCode(requestIdealWeightDto.getFormula()));

        return idealWeight;
    }
}
