package com.example.fitocalapp.dto.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RequestIdealWeightDto {
    private Integer age;
    private double height;
    private String gender;
    private String formula;
}
