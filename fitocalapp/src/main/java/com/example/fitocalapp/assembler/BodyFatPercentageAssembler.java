package com.example.fitocalapp.assembler;

import com.example.fitocalapp.domain.Bmi;
import com.example.fitocalapp.domain.BodyFatPercentage;
import com.example.fitocalapp.domain.enums.BodyFatPercentageFormula;
import com.example.fitocalapp.domain.enums.BodyFatPercentageType;
import com.example.fitocalapp.dto.request.RequestBodyFatPercentageDto;
import org.springframework.stereotype.Component;

@Component
public class BodyFatPercentageAssembler {

    public BodyFatPercentage assembleBodyFatPercentage(RequestBodyFatPercentageDto requestBodyFatPercentageDto, BodyFatPercentageFormula bodyFatPercentageFormula, double bodyFatPercentageValue, Bmi bmi) {
        BodyFatPercentage bodyFatPercentage = new BodyFatPercentage();

        bodyFatPercentage.setFormula(bodyFatPercentageFormula);
        bodyFatPercentage.setBodyFatPercentageRate(bodyFatPercentageValue);
        bodyFatPercentage.setType(BodyFatPercentageType.getBodyFatPercentage(requestBodyFatPercentageDto.getGender(), bodyFatPercentageValue));
        bodyFatPercentage.setBmi(bmi.getBmi());
        bodyFatPercentage.setBodyFatMass(bmi.getBmi() * bodyFatPercentageValue / 100);
        bodyFatPercentage.setLeanBodyMass(bmi.getBmi() - bodyFatPercentage.getBodyFatMass());

        return bodyFatPercentage;
    }
}
