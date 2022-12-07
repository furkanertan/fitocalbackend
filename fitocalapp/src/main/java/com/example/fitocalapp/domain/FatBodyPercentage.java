package com.example.fitocalapp.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class FatBodyPercentage {
    private double height;
    private double weight;
    private Integer age;
    private String gender;
}
