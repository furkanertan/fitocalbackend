package com.example.fitocalapp.dto.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RequestDailyCalorieDto {
    private Integer age;
    private String gender;
    private double height;
    private double weight;
    private String activity;
    private String formula;
}
