package com.example.fitocalapp.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum Exercises {

    JUMPING_JACKS("Jumping Jacks", "Cardio", "Beginner", 3, 15, "Jumping Jacks"),
    PUSH_UP("Push Up", "Cardio", "Beginner", 3, 15, "Push Up"),
    ABDOMINAL_CRUNCH("Abdominal Crunch", "Cardio", "Beginner", 3, 15, "Abdominal Crunch"),
    SQUAT("Squat", "Leg", "Beginner", 3, 12, "Squat"),
    LEG_EXTENSION("Leg Extension", "Leg", "Beginner", 3, 12, "Leg Extension"),
    LEG_CURL("Leg Curl", "Leg", "Beginner", 3, 12, ""),
    LATERAL_RAISE("Lateral Raise", "Shoulder", "Beginner", 3, 12, "Lateral Raise"),
    FRONT_RAISE("Front Raise", "Shoulder", "Beginner", 3, 12, "Front Raise"),
    SHOULDER_PRESS("Shoulder Press", "Shoulder", "Beginner", 3, 12, "Shoulder Press"),
    BENCH_PRESS("Bench Press", "Chest", "Beginner", 3, 12, "Bench Press"),
    INCLINE_BENCH_PRESS("Incline Bench Press", "Chest", "Beginner", 3, 12, "Incline Bench Press"),
    DUMBBELL_FLY("Dumbbell Fly", "Chest", "Beginner", 3, 12, "Dumbbell Fly"),
    DUMBBELL_CURL("Dumbbell Curl", "Biceps", "Beginner", 3, 12, "Dumbbell Curl"),
    BARBELL_CURL("Barbell Curl", "Biceps", "Beginner", 3, 12, "Barbell Curl"),
    HAMMER_CURL("Hammer Curl", "Biceps", "Beginner", 3, 12, "Hammer Curl"),
    OVERHEAD_TRICEPS_EXTENSION("Overhead Triceps Extension", "Triceps", "Beginner", 3, 12, "Overhead Triceps Extension"),
    TRICEPS_EXTENSION("Triceps Extension", "Triceps", "Beginner", 3, 12, "Triceps Extension"),
    TRICEPS_KICKBACK("Triceps Kickback", "Triceps", "Beginner", 3, 12, "Triceps Kickback"),
    LATERAL_PULL_DOWN("Lateral Pull Down", "Back", "Beginner", 3, 12, "Lateral Pull Down"),
    SEATED_ROW("Seated Row", "Back", "Beginner", 3, 12, "Seated Row"),
    PULL_UP("Pull Up", "Back", "Beginner", 3, 12, "Pull Up"),

    MOUNTAIN_CLIMBER("Mountain Climber", "Cardio", "Intermediate", 3, 20, "Mountain Climber"),
    STEP_UP("Step Up", "Cardio", "Intermediate", 3, 20, "Step Up"),
    PLANK("Plank", "Cardio", "Intermediate", 3, 20, "Plank"),
    SIDE_PLANK("Side Plank", "Cardio", "Intermediate", 3, 20, "Side Plank"),
    SQUAT_JUMP("Squat Jump", "Leg", "Intermediate", 3, 15, "Squat Jump"),
    LUNGE("Lunge", "Leg", "Intermediate", 3, 15, "Lunge"),
    CALF_RAISE("Calf Raise", "Leg", "Intermediate", 3, 15, "Calf Raise"),
    UPRIGHT_ROW("Upright Row", "Shoulder", "Intermediate", 3, 15, "Upright Row"),
    REVERSE_FLY("Reverse Fly", "Shoulder", "Intermediate", 3, 15, "Reverse Fly"),
    DUMBBELL_PRESS("Dumbbell Press", "Shoulder", "Intermediate", 3, 15, "Dumbbell Press"),
    DUMBBELL_HAMMER_CURL("Dumbbell Hammer Curl", "Biceps", "Intermediate", 3, 15, "Dumbbell Hammer Curl"),
    DUMBBELL_PREACHER_CURL("Dumbbell Preacher Curl", "Biceps", "Intermediate", 3, 15, "Dumbbell Preacher Curl"),
    DUMBBELL_INCLINE_CURL("Dumbbell Incline Curl", "Biceps", "Intermediate", 3, 15, "Dumbbell Incline Curl"),
    DUMBBELL_OVERHEAD_EXTENSION("Dumbbell Overhead Extension", "Triceps", "Intermediate", 3, 15, "Dumbbell Overhead Extension"),
    DUMBBELL_OVERHEAD_KICKBACK("Dumbbell Overhead Kickback", "Triceps", "Intermediate", 3, 15, "Dumbbell Overhead Kickback"),
    BENCH_PRESS_INTERMEDIATE("Bench Press", "Chest", "Intermediate", 3, 15, "Bench Press"),
    INCLINE_BENCH_PRESS_INTERMEDIATE("Incline Bench Press", "Chest", "Intermediate", 3, 15, "Incline Bench Press"),
    DECLINE_BENCH_PRESS_INTERMEDIATE("Decline Bench Press", "Chest", "Intermediate", 3, 15, "Decline Bench Press"),
    DUMBBELL_FLY_INTERMEDIATE("Dumbbell Fly", "Chest", "Intermediate", 3, 15, "Dumbbell Fly"),
    DUMBBELL_ROW("Dumbbell Row", "Back", "Intermediate", 3, 15, "Dumbbell Row"),
    PULL_UP_INTERMEDIATE("Pull Up", "Back", "Intermediate", 3, 15, "Pull Up"),
    LAT_PULL_DOWN_INTERMEDIATE("Lat Pull Down", "Back", "Intermediate", 3, 15, "Lat Pull Down"),

    BURPEE("Burpee", "Cardio", "Advanced", 3, 25, "Burpee"),
    LUNGES("Lunges", "Cardio", "Advanced", 3, 25, "Lunges");

    private final String name;
    private final String type;
    private final String level;
    private final Integer set;
    private final Integer repeat;
    private final String link;

    public static List<Exercises> getExercisesByLevel(String level) {
        return Stream.of(Exercises.values()).filter(exercise -> exercise.getLevel().equals(level)).toList();
    }
}
