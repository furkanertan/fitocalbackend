package com.example.fitocalapp.controller;

import com.example.fitocalapp.domain.BodyFatPercentage;
import com.example.fitocalapp.dto.request.RequestBodyFatPercentageDto;
import com.example.fitocalapp.service.BodyFatPercentageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/bodyFatPercentage")
public class BodyFatPercentageController {

    private final BodyFatPercentageService bodyFatPercentageService;

    public BodyFatPercentageController(BodyFatPercentageService bodyFatPercentageService) {
        this.bodyFatPercentageService = bodyFatPercentageService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/getBodyFatPercentage")
    public ResponseEntity<BodyFatPercentage> getBodyFatPercentage(@RequestBody RequestBodyFatPercentageDto requestBodyFatPercentageDto) {
        log.info("Calculating Body Fat Percentage");

        return ResponseEntity.ok(bodyFatPercentageService.calculateBodyFatPercentageByDeurenbergFormula(requestBodyFatPercentageDto));
    }

    @GetMapping("/calculateBodyFatPercentageByDeurenberg")
    public BodyFatPercentage getBodyFatPercentageByDeurenberg(@RequestBody RequestBodyFatPercentageDto requestBodyFatPercentageDto) {
        log.info("Calculating Body Fat Percentage by Deurenberg");

        return bodyFatPercentageService.calculateBodyFatPercentageByDeurenbergFormula(requestBodyFatPercentageDto);
    }

    @GetMapping("/calculateBodyFatPercentageByDeurenberg2")
    public BodyFatPercentage getBodyFatPercentageByDeurenberg2(@RequestBody RequestBodyFatPercentageDto requestBodyFatPercentageDto) {
        log.info("Calculating Body Fat Percentage by Deurenberg2");

        return bodyFatPercentageService.calculateBodyFatPercentageByDeurenbergFormula2(requestBodyFatPercentageDto);
    }

    @GetMapping("/calculateBodyFatPercentageByGallagher")
    public BodyFatPercentage getBodyFatPercentageByGallagher(@RequestBody RequestBodyFatPercentageDto requestBodyFatPercentageDto) {
        log.info("Calculating Body Fat Percentage by Gallagher");

        return bodyFatPercentageService.calculateBodyFatPercentageByGallagherFormula(requestBodyFatPercentageDto);
    }

    @GetMapping("/calculateBodyFatPercentageByJacksonPollock")
    public BodyFatPercentage getBodyFatPercentageByJacksonPollock(@RequestBody RequestBodyFatPercentageDto requestBodyFatPercentageDto) {
        log.info("Calculating Body Fat Percentage by Jackson Pollock");

        return bodyFatPercentageService.calculateBodyFatPercentageByJacksonPollockFormula(requestBodyFatPercentageDto);
    }

    @GetMapping("/calculateBodyFatPercentageByJacksonAs")
    public BodyFatPercentage getBodyFatPercentageByJacksonAs(@RequestBody RequestBodyFatPercentageDto requestBodyFatPercentageDto) {
        log.info("Calculating Body Fat Percentage by Jackson As");

        return bodyFatPercentageService.calculateBodyFatPercentageByJacksonAsFormula(requestBodyFatPercentageDto);
    }
}
