package com.example.fitocalapp.assembler;

import com.example.fitocalapp.domain.FatBodyPercentage;
import com.example.fitocalapp.dto.FatBodyPercentageDto;

public class FatBodyPercentageAssembler {

    public FatBodyPercentage assembleFatBodyPercentage(FatBodyPercentageDto fatBodyPercentageDto){
        FatBodyPercentage fatBodyPercentage = new FatBodyPercentage();

        fatBodyPercentage.setHeight(fatBodyPercentageDto.getHeight());
        fatBodyPercentage.setWeight(fatBodyPercentageDto.getWeight());
        fatBodyPercentage.setAge(fatBodyPercentageDto.getAge());
        fatBodyPercentage.setGender(fatBodyPercentageDto.getGender());

        return fatBodyPercentage;
    }
}
