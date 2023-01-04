package com.example.fitocalapp.assembler;

import com.example.fitocalapp.domain.RecommendedExercises;
import com.example.fitocalapp.domain.enums.Exercises;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RecommendedExercisesAssembler {

    public List<RecommendedExercises> assembleRecommendedExercises(String level) {
        List<RecommendedExercises> recommendedExercises = new ArrayList<>();
        List<Exercises> exerciseList = Exercises.getExercisesByLevel(level);

        for (Exercises exercise : exerciseList) {
            RecommendedExercises recommendedExercise = new RecommendedExercises();
            recommendedExercise.setId(exercise.getId());
            recommendedExercise.setName(exercise.getName());
            recommendedExercise.setType(exercise.getType());
            recommendedExercise.setLevel(exercise.getLevel());
            recommendedExercise.setSet(exercise.getSet());
            recommendedExercise.setRepeat(exercise.getRepeat());
            recommendedExercise.setLink(exercise.getLink());
            recommendedExercises.add(recommendedExercise);
        }

        return recommendedExercises;
    }
}
