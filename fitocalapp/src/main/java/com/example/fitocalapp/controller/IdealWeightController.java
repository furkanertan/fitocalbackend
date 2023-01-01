package com.example.fitocalapp.controller;

import com.example.fitocalapp.assembler.IdealWeightAssembler;
import com.example.fitocalapp.domain.IdealWeight;
import com.example.fitocalapp.dto.request.RequestIdealWeightDto;
import com.example.fitocalapp.service.IdealWeightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/idealWeight")
public class IdealWeightController {

    private final IdealWeightService idealWeightService;
    private final IdealWeightAssembler idealWeightAssembler;

    public IdealWeightController(IdealWeightService idealWeightService, IdealWeightAssembler idealWeightAssembler) {
        this.idealWeightService = idealWeightService;
        this.idealWeightAssembler = idealWeightAssembler;
    }

    @GetMapping("/calculateIdealWeight")
    public List<IdealWeight> calculateIdealWeight(@RequestParam(name = "age") Integer age, @RequestParam(name = "height") double height, @RequestParam(name = "gender") String gender) {
        log.info("Calculating ideal weight!");

        RequestIdealWeightDto requestIdealWeightDto = idealWeightAssembler.assembleRequestDto(age, height, gender);

        return idealWeightService.calculateIdealWeight(requestIdealWeightDto);
    }
}
