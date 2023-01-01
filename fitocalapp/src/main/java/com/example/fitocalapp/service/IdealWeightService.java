package com.example.fitocalapp.service;

import com.example.fitocalapp.assembler.IdealWeightAssembler;
import com.example.fitocalapp.domain.IdealWeight;
import com.example.fitocalapp.dto.request.RequestIdealWeightDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.fitocalapp.domain.enums.IdealWeightFormula.*;

@Service
@AllArgsConstructor
public class IdealWeightService {

    private static final double INC_CONVERT_VALUE = 0.3937007874;

    private IdealWeightAssembler idealWeightAssembler;

    public List<IdealWeight> calculateIdealWeight(RequestIdealWeightDto requestIdealWeightDto) {
        List<IdealWeight> idealWeightList = new ArrayList<>();
        IdealWeight idealWeightByRobinson = idealWeightAssembler.assembleIdealWeight(ROBINSON, getByRobinson(requestIdealWeightDto.getGender(), requestIdealWeightDto.getHeight()));
        idealWeightList.add(idealWeightByRobinson);

        IdealWeight idealWeightByMiller = idealWeightAssembler.assembleIdealWeight(MILLER, getByMiller(requestIdealWeightDto.getGender(), requestIdealWeightDto.getHeight()));
        idealWeightList.add(idealWeightByMiller);

        IdealWeight idealWeightByDevine = idealWeightAssembler.assembleIdealWeight(DEVINE, getByDevine(requestIdealWeightDto.getGender(), requestIdealWeightDto.getHeight()));
        idealWeightList.add(idealWeightByDevine);

        IdealWeight idealWeightByHamwi = idealWeightAssembler.assembleIdealWeight(HAMWI, getByHamwi(requestIdealWeightDto.getGender(), requestIdealWeightDto.getHeight()));
        idealWeightList.add(idealWeightByHamwi);

        return idealWeightList;
    }

    private double getByRobinson(String gender, double height) {
        return "M".equals(gender) ? 52 + (1.9 * ((height - 152.4) * INC_CONVERT_VALUE)) :
                49 + (1.7 * ((height - 152.4) * INC_CONVERT_VALUE));
    }

    private double getByMiller(String gender, double height) {
        return "M".equals(gender) ? 50 + (2.3 * ((height - 152.4) * INC_CONVERT_VALUE)) :
                45.5 + (2.3 * ((height - 152.4) * INC_CONVERT_VALUE));
    }

    private double getByDevine(String gender, double height) {
        return "M".equals(gender) ? 56.2 + (1.41 * ((height - 152.4) * INC_CONVERT_VALUE)) :
                53.1 + (1.36 * ((height - 152.4) * INC_CONVERT_VALUE));
    }

    private double getByHamwi(String gender, double height) {
        return "M".equals(gender) ? 48 + (2.7 * ((height - 152.4) * INC_CONVERT_VALUE)) :
                45.5 + (2.2 * ((height - 152.4) * INC_CONVERT_VALUE));
    }
}
