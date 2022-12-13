package com.example.fitocalapp.service;

import com.example.fitocalapp.assembler.DailyCalorieAssembler;
import com.example.fitocalapp.domain.DailyCalorie;
import com.example.fitocalapp.domain.enums.Activity;
import com.example.fitocalapp.domain.enums.DailyCalorieFormula;
import com.example.fitocalapp.domain.enums.Gender;
import com.example.fitocalapp.dto.request.RequestDailyCalorieDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.fitocalapp.domain.enums.DailyCalorieFormula.MIFFLIN;
import static com.example.fitocalapp.domain.enums.Gender.MALE;
import static com.example.fitocalapp.domain.enums.Gender.getGender;

@Service
@AllArgsConstructor
public class DailyCalorieService {

    private DailyCalorieAssembler dailyCalorieAssembler;

    public DailyCalorie calculateDailyCalorie(RequestDailyCalorieDto requestDailyCalorieDto) {
        double dailyCalorie = getDailyCalorie(requestDailyCalorieDto);

        return dailyCalorieAssembler.assembleDailyCalorie(dailyCalorie);
    }

    private double calculateBMRByMifflinEquation(RequestDailyCalorieDto requestDailyCalorieDto) {
        return 10 * requestDailyCalorieDto.getWeight() + 6.25 * requestDailyCalorieDto.getHeight() - 5 * requestDailyCalorieDto.getAge() + getGender(requestDailyCalorieDto.getGender()).getDailyCalorieMultiplierMifflin();
    }

    private double calculateBMRByHarrisBenedictEquation(RequestDailyCalorieDto requestDailyCalorieDto) {
        Gender gender = getGender(requestDailyCalorieDto.getGender());

        if (MALE.equals(gender)) {
            return (13.397 * requestDailyCalorieDto.getWeight()) + (4.799 * requestDailyCalorieDto.getHeight()) - (5.677 * requestDailyCalorieDto.getAge()) + gender.getDailyCalorieMultiplierHarrisBenedict();
        } else {
            return (9.247 * requestDailyCalorieDto.getWeight()) + (3.098 * requestDailyCalorieDto.getHeight()) - (4.330 * requestDailyCalorieDto.getAge()) + gender.getDailyCalorieMultiplierHarrisBenedict();
        }
    }

    private double getDailyCalorie(RequestDailyCalorieDto requestDailyCalorieDto) {
        DailyCalorieFormula formula = DailyCalorieFormula.fromFormula(requestDailyCalorieDto.getFormula());
        Activity activity = Activity.fromActivity(requestDailyCalorieDto.getActivity());

        assert activity != null;
        if (MIFFLIN.equals(formula)) {
            return calculateBMRByMifflinEquation(requestDailyCalorieDto) * activity.getMultiplier();
        } else {
            return calculateBMRByHarrisBenedictEquation(requestDailyCalorieDto) * activity.getMultiplier();
        }
    }
}