package com.example.fitocalapp.assembler;

import com.example.fitocalapp.domain.DailyCalorie;
import org.springframework.stereotype.Component;

@Component
public class DailyCalorieAssembler {

    public DailyCalorie assembleDailyCalorie(double dailyCalorieValue) {
        DailyCalorie dailyCalorie = new DailyCalorie();

        dailyCalorie.setMaintainWeight(dailyCalorieValue);
        dailyCalorie.setMildWeightLoss(dailyCalorieValue - 250);
        dailyCalorie.setWeightLoss(dailyCalorieValue - 500);
        dailyCalorie.setExtremeWeightLoss(dailyCalorieValue - 750);
        dailyCalorie.setMildWeightGain(dailyCalorieValue + 250);
        dailyCalorie.setWeightGain(dailyCalorieValue + 500);
        dailyCalorie.setFastWeightGain(dailyCalorieValue + 750);

        return dailyCalorie;
    }
}
