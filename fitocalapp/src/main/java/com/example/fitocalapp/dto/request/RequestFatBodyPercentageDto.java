package com.example.fitocalapp.dto.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RequestFatBodyPercentageDto {
    private double height;
    private double weight;
    private Integer age;
    private String gender;
}
