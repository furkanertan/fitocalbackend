package com.example.fitocalapp.dto.response;

import com.example.fitocalapp.domain.Bmi;
import com.example.fitocalapp.domain.FatBodyPercentageFormula;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ResponseFatBodyPercentageDto {
    private Integer age;
    private String gender;
    private double fatBodyPercentageValue;
    private Bmi bmi;
    private FatBodyPercentageFormula fatBodyPercentageFormula;
}
