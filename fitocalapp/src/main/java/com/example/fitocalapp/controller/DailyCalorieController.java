package com.example.fitocalapp.controller;

import com.example.fitocalapp.domain.DailyCalorie;
import com.example.fitocalapp.dto.request.RequestDailyCalorieDto;
import com.example.fitocalapp.service.DailyCalorieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping("/dailyCalorie")
public class DailyCalorieController {

    private final DailyCalorieService dailyCalorieService;

    public DailyCalorieController(DailyCalorieService dailyCalorieService) {
        this.dailyCalorieService = dailyCalorieService;
    }

    @CrossOrigin
    @PostMapping("/calculateDailyCalorie")
    public ResponseEntity<DailyCalorie> calculateDailyCalorie(@RequestBody RequestDailyCalorieDto requestDailyCalorieDto) {
        log.info("Calculating daily calorie");

        return ResponseEntity.ok(dailyCalorieService.calculateDailyCalorie(requestDailyCalorieDto));
    }
}
