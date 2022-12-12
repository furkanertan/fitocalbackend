package com.example.fitocalapp.controller;

import com.example.fitocalapp.domain.FatBodyPercentage;
import com.example.fitocalapp.dto.request.RequestFatBodyPercentageDto;
import com.example.fitocalapp.service.FatBodyPercentageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/fatBodyPercentage")
public class FatBodyPercentageController {

    private final FatBodyPercentageService fatBodyPercentageService;

    public FatBodyPercentageController(FatBodyPercentageService fatBodyPercentageService) {
        this.fatBodyPercentageService = fatBodyPercentageService;
    }

    @GetMapping("/getFatBodyPercentage")
    public FatBodyPercentage getFatBodyPercentage(@RequestBody RequestFatBodyPercentageDto requestFatBodyPercentageDto) {
        log.info("Calculating Fat Body Percentage");

        return fatBodyPercentageService.calculateFatBodyPercentageByDeurenbergFormula(requestFatBodyPercentageDto);
    }

    @GetMapping("/calculateFatBodyPercentageByDeurenberg")
    public FatBodyPercentage getFatBodyPercentageByDeurenberg(@RequestBody RequestFatBodyPercentageDto requestFatBodyPercentageDto) {
        log.info("Calculating Fat Body Percentage by Deurenberg");

        return fatBodyPercentageService.calculateFatBodyPercentageByDeurenbergFormula(requestFatBodyPercentageDto);
    }

    @GetMapping("/calculateFatBodyPercentageByDeurenberg2")
    public FatBodyPercentage getFatBodyPercentageByDeurenberg2(@RequestBody RequestFatBodyPercentageDto requestFatBodyPercentageDto) {
        log.info("Calculating Fat Body Percentage by Deurenberg2");

        return fatBodyPercentageService.calculateFatBodyPercentageByDeurenbergFormula2(requestFatBodyPercentageDto);
    }

    @GetMapping("/calculateFatBodyPercentageByGallagher")
    public FatBodyPercentage getFatBodyPercentageByGallagher(@RequestBody RequestFatBodyPercentageDto requestFatBodyPercentageDto) {
        log.info("Calculating Fat Body Percentage by Gallagher");

        return fatBodyPercentageService.calculateFatBodyPercentageByGallagherFormula(requestFatBodyPercentageDto);
    }

    @GetMapping("/calculateFatBodyPercentageByJacksonPollock")
    public FatBodyPercentage getFatBodyPercentageByJacksonPollock(@RequestBody RequestFatBodyPercentageDto requestFatBodyPercentageDto) {
        log.info("Calculating Fat Body Percentage by Jackson Pollock");

        return fatBodyPercentageService.calculateFatBodyPercentageByJacksonPollockFormula(requestFatBodyPercentageDto);
    }

    @GetMapping("/calculateFatBodyPercentageByJacksonAs")
    public FatBodyPercentage getFatBodyPercentageByJacksonAs(@RequestBody RequestFatBodyPercentageDto requestFatBodyPercentageDto) {
        log.info("Calculating Fat Body Percentage by Jackson As");

        return fatBodyPercentageService.calculateFatBodyPercentageByJacksonAsFormula(requestFatBodyPercentageDto);
    }
}
