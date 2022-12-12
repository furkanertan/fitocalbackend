package com.example.fitocalapp.controller;

import com.example.fitocalapp.dto.request.RequestFatBodyPercentageDto;
import com.example.fitocalapp.dto.response.ResponseFatBodyPercentageDto;
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
    public ResponseFatBodyPercentageDto getFatBodyPercentage(@RequestBody RequestFatBodyPercentageDto requestFatBodyPercentageDto) {
        log.info("Calculating Fat Body Percentage");

        return fatBodyPercentageService.calculateFatBodyPercentage(requestFatBodyPercentageDto);
    }

}
