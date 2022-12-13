package com.example.fitocalapp.service;

import com.example.fitocalapp.assembler.IdealWeightAssembler;
import com.example.fitocalapp.domain.IdealWeight;
import com.example.fitocalapp.dto.request.RequestIdealWeightDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.fitocalapp.domain.enums.IdealWeightFormula.*;

@Service
@AllArgsConstructor
public class IdealWeightService {

    private static final double INC_CONVERT_VALUE = 0.3937007874;

    private IdealWeightAssembler idealWeightAssembler;

    public IdealWeight calculateIdealWeight(RequestIdealWeightDto requestIdealWeightDto) {
        double idealWeight = getIdealWeight(requestIdealWeightDto);
        return idealWeightAssembler.assembleIdealWeight(requestIdealWeightDto, idealWeight);
    }

    private double getIdealWeight(RequestIdealWeightDto requestIdealWeightDto) {
        if (ROBINSON.getCode().equals(requestIdealWeightDto.getFormula())) {
            return "M".equals(requestIdealWeightDto.getGender()) ? 52 + (1.9 * ((requestIdealWeightDto.getHeight() - 152.4) * INC_CONVERT_VALUE)) :
                    49 + (1.7 * ((requestIdealWeightDto.getHeight() - 152.4) * INC_CONVERT_VALUE));
        } else if (MILLER.getCode().equals(requestIdealWeightDto.getFormula())) {
            return "M".equals(requestIdealWeightDto.getGender()) ? 50 + (2.3 * ((requestIdealWeightDto.getHeight() - 152.4) * INC_CONVERT_VALUE)) :
                    45.5 + (2.3 * ((requestIdealWeightDto.getHeight() - 152.4) * INC_CONVERT_VALUE));
        } else if (DEVINE.getCode().equals(requestIdealWeightDto.getFormula())) {
            return "M".equals(requestIdealWeightDto.getGender()) ? 56.2 + (1.41 * ((requestIdealWeightDto.getHeight() - 152.4) * INC_CONVERT_VALUE)) :
                    53.1 + (1.36 * ((requestIdealWeightDto.getHeight() - 152.4) * INC_CONVERT_VALUE));
        } else if (HAMWI.getCode().equals(requestIdealWeightDto.getFormula())) {
            return "M".equals(requestIdealWeightDto.getGender()) ? 48 + (2.7 * ((requestIdealWeightDto.getHeight() - 152.4) * INC_CONVERT_VALUE)) :
                    45.5 + (2.2 * ((requestIdealWeightDto.getHeight() - 152.4) * INC_CONVERT_VALUE));
        } else {
            return 0.0;
        }
    }
}
