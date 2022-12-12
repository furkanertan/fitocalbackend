package com.example.fitocalapp.assembler;

import com.example.fitocalapp.domain.Bmi;
import com.example.fitocalapp.dto.request.RequestFatBodyPercentageDto;
import com.example.fitocalapp.dto.response.ResponseFatBodyPercentageDto;

public class FatBodyPercentageAssembler {

    public ResponseFatBodyPercentageDto assembleFatBodyPercentage(RequestFatBodyPercentageDto requestFatBodyPercentageDto, Bmi bmi, double fatBodyPercentageValue) {
        ResponseFatBodyPercentageDto responseFatBodyPercentageDto = new ResponseFatBodyPercentageDto();

        responseFatBodyPercentageDto.setAge(requestFatBodyPercentageDto.getAge());
        responseFatBodyPercentageDto.setGender(requestFatBodyPercentageDto.getGender());
        responseFatBodyPercentageDto.setBmi(bmi);
        responseFatBodyPercentageDto.setFatBodyPercentageFormula(null);
        responseFatBodyPercentageDto.setFatBodyPercentageValue(fatBodyPercentageValue);

        return responseFatBodyPercentageDto;
    }
}
