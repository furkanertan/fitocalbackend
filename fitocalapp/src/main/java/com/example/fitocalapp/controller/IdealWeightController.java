package com.example.fitocalapp.controller;

import com.example.fitocalapp.domain.IdealWeight;
import com.example.fitocalapp.dto.request.RequestIdealWeightDto;
import com.example.fitocalapp.service.IdealWeightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/idealWeight")
public class IdealWeightController {

    private final IdealWeightService idealWeightService;

    public IdealWeightController(IdealWeightService idealWeightService) {
        this.idealWeightService = idealWeightService;
    }

    @GetMapping("/calculateIdealWeight")
    public IdealWeight calculateIdealWeight(@RequestBody RequestIdealWeightDto requestIdealWeightDto) {
        log.info("Calculating ideal weight");

        return idealWeightService.calculateIdealWeight(requestIdealWeightDto);
    }
}
