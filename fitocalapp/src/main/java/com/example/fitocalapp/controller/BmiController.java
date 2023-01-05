package com.example.fitocalapp.controller;

import com.example.fitocalapp.domain.Bmi;
import com.example.fitocalapp.service.BmiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/bmi")
public class BmiController {

    private final BmiService bmiService;

    public BmiController(BmiService bmiService) {
        this.bmiService = bmiService;
    }

    @GetMapping("/getBmi")
    public Bmi getBmi(@RequestParam(name = "height") double height, @RequestParam(name = "weight") double weight) {
        log.info("Calculating BMI!");

        return bmiService.calculateBmi(height, weight);
    }

}
