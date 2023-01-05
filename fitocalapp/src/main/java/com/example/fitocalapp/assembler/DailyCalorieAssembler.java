package com.example.fitocalapp.assembler;

import com.example.fitocalapp.domain.DailyCalorie;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

@Component
public class DailyCalorieAssembler {

    public DailyCalorie assembleDailyCalorie(double dailyCalorieValue) {
        DailyCalorie dailyCalorie = new DailyCalorie();

        dailyCalorie.setMaintainWeight(Double.parseDouble(new DecimalFormat("##.#").format(dailyCalorieValue)));
        dailyCalorie.setMildWeightLoss(Double.parseDouble(new DecimalFormat("##.#").format(dailyCalorieValue - 250)));
        dailyCalorie.setWeightLoss(Double.parseDouble(new DecimalFormat("##.#").format(dailyCalorieValue - 500)));
        dailyCalorie.setExtremeWeightLoss(Double.parseDouble(new DecimalFormat("##.#").format(dailyCalorieValue - 750)));
        dailyCalorie.setMildWeightGain(Double.parseDouble(new DecimalFormat("##.#").format(dailyCalorieValue + 250)));
        dailyCalorie.setWeightGain(Double.parseDouble(new DecimalFormat("##.#").format(dailyCalorieValue + 500)));
        dailyCalorie.setFastWeightGain(Double.parseDouble(new DecimalFormat("##.#").format(dailyCalorieValue + 750)));

        return dailyCalorie;
    }
}
