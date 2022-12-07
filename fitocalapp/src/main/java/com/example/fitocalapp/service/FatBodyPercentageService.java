package com.example.fitocalapp.service;

import com.example.fitocalapp.assembler.FatBodyPercentageAssembler;
import com.example.fitocalapp.domain.FatBodyPercentage;
import com.example.fitocalapp.dto.FatBodyPercentageDto;
import org.springframework.stereotype.Service;

@Service
public class FatBodyPercentageService {

    private FatBodyPercentageAssembler fatBodyPercentageAssembler;

    public FatBodyPercentage calculateFatBodyPercentage(FatBodyPercentageDto fatBodyPercentageDto){
        fatBodyPercentageAssembler = new FatBodyPercentageAssembler();

        return fatBodyPercentageAssembler.assembleFatBodyPercentage(fatBodyPercentageDto);
    }
}