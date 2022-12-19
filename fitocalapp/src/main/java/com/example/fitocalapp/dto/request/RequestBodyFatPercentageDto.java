package com.example.fitocalapp.dto.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RequestBodyFatPercentageDto {
    private double height;
    private double weight;
    private Integer age;
    private String gender;
}
