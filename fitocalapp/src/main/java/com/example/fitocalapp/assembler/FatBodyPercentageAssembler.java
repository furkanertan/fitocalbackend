package com.example.fitocalapp.assembler;

import com.example.fitocalapp.domain.Bmi;
import com.example.fitocalapp.domain.FatBodyPercentage;
import com.example.fitocalapp.domain.FatBodyPercentageFormula;
import com.example.fitocalapp.domain.FatBodyPercentageType;
import com.example.fitocalapp.dto.request.RequestFatBodyPercentageDto;
import org.springframework.stereotype.Component;

import static com.example.fitocalapp.domain.Gender.getGender;

@Component
public class FatBodyPercentageAssembler {

    public FatBodyPercentage assembleFatBodyPercentage(RequestFatBodyPercentageDto requestFatBodyPercentageDto, FatBodyPercentageFormula fatBodyPercentageFormula, double fatBodyPercentageValue, Bmi bmi) {
        FatBodyPercentage fatBodyPercentage = new FatBodyPercentage();

        fatBodyPercentage.setAge(requestFatBodyPercentageDto.getAge());
        fatBodyPercentage.setGender(getGender(requestFatBodyPercentageDto.getGender()));
        fatBodyPercentage.setFatBodyPercentageFormula(fatBodyPercentageFormula);
        fatBodyPercentage.setFatBodyPercentage(fatBodyPercentageValue);
        fatBodyPercentage.setFatBodyPercentageType(FatBodyPercentageType.getFatBodyPercentage(requestFatBodyPercentageDto.getGender(), fatBodyPercentageValue));
        fatBodyPercentage.setBmi(bmi);

        return fatBodyPercentage;
    }
}
