package com.example.fitocalapp.controller;

import com.example.fitocalapp.domain.RecommendedExercises;
import com.example.fitocalapp.service.RecommendedExercisesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/recommendedExercises")
public class RecommendedExercisesController {

    private final RecommendedExercisesService recommendedExercisesService;

    public RecommendedExercisesController(RecommendedExercisesService recommendedExercisesService) {
        this.recommendedExercisesService = recommendedExercisesService;
    }

    @GetMapping("/getRecommendedExercises")
    public ResponseEntity<List<RecommendedExercises>> getRecommendedExercises(@RequestParam(name = "exerciseLevel") String level) {
        log.info("Getting recommended exercises!");

        return ResponseEntity.ok(recommendedExercisesService.getRecommendedExercises(level));
    }
}
