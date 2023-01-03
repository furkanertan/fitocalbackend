package com.example.fitocalapp.service;

import com.example.fitocalapp.assembler.RecommendedExercisesAssembler;
import com.example.fitocalapp.domain.RecommendedExercises;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RecommendedExercisesService {

    private final RecommendedExercisesAssembler recommendedExercisesAssembler;

    public List<RecommendedExercises> getRecommendedExercises(String level) {
        return recommendedExercisesAssembler.assembleRecommendedExercises(level);
    }
}
