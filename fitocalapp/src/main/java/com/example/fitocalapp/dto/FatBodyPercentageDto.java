package com.example.fitocalapp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class FatBodyPercentageDto {
    public double height;
    public double weight;
    public Integer age;
    public String gender;
}
