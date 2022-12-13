package com.example.fitocalapp.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class DailyCalorie {
    private double maintainWeight;
    private double mildWeightLoss;
    private double weightLoss;
    private double extremeWeightLoss;
    private double mildWeightGain;
    private double weightGain;
    private double fastWeightGain;
}
