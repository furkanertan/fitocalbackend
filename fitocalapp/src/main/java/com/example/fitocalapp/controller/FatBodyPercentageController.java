package com.example.fitocalapp.controller;

import com.example.fitocalapp.domain.FatBodyPercentage;
import com.example.fitocalapp.dto.FatBodyPercentageDto;
import com.example.fitocalapp.service.FatBodyPercentageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/fatBodyPercentage")
public class FatBodyPercentageController {

    private final FatBodyPercentageService fatBodyPercentageService;

    public FatBodyPercentageController(FatBodyPercentageService fatBodyPercentageService) {
        this.fatBodyPercentageService = fatBodyPercentageService;
    }

    @GetMapping("/getFatBodyPercentage")
    public FatBodyPercentage getFatBodyPercentage(@RequestBody FatBodyPercentageDto fatBodyPercentageDto) {
        log.info("Calculating Fat Body Percentage");

        return fatBodyPercentageService.calculateFatBodyPercentage(fatBodyPercentageDto);
    }

}
