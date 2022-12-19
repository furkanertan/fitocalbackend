package com.example.fitocalapp.assembler;

import com.example.fitocalapp.domain.Bmi;
import com.example.fitocalapp.domain.BodyFatPercentage;
import com.example.fitocalapp.domain.enums.BodyFatPercentageFormula;
import com.example.fitocalapp.domain.enums.BodyFatPercentageType;
import com.example.fitocalapp.dto.request.RequestBodyFatPercentageDto;
import org.springframework.stereotype.Component;

import static com.example.fitocalapp.domain.enums.Gender.getGender;

@Component
public class BodyFatPercentageAssembler {

    public BodyFatPercentage assembleBodyFatPercentage(RequestBodyFatPercentageDto requestBodyFatPercentageDto, BodyFatPercentageFormula bodyFatPercentageFormula, double bodyFatPercentageValue, Bmi bmi) {
        BodyFatPercentage bodyFatPercentage = new BodyFatPercentage();

        bodyFatPercentage.setAge(requestBodyFatPercentageDto.getAge());
        bodyFatPercentage.setGender(getGender(requestBodyFatPercentageDto.getGender()));
        bodyFatPercentage.setBodyFatPercentageFormula(bodyFatPercentageFormula);
        bodyFatPercentage.setBodyFatPercentage(bodyFatPercentageValue);
        bodyFatPercentage.setBodyFatPercentageType(BodyFatPercentageType.getBodyFatPercentage(requestBodyFatPercentageDto.getGender(), bodyFatPercentageValue));
        bodyFatPercentage.setBmi(bmi);

        return bodyFatPercentage;
    }
}
