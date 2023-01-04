package com.example.fitocalapp.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum Exercises {

    JUMPING_JACKS(1, "Jumping Jacks", "Cardio", "Beginner", 3, 15, "Jumping Jacks"),
    PUSH_UP(2, "Push Up", "Cardio", "Beginner", 3, 15, "Push Up"),
    ABDOMINAL_CRUNCH(3, "Abdominal Crunch", "Cardio", "Beginner", 3, 15, "Abdominal Crunch"),
    SQUAT(4, "Squat", "Leg", "Beginner", 3, 12, "Squat"),
    LEG_EXTENSION(5, "Leg Extension", "Leg", "Beginner", 3, 12, "Leg Extension"),
    LEG_CURL(6, "Leg Curl", "Leg", "Beginner", 3, 12, ""),
    LATERAL_RAISE(7, "Lateral Raise", "Shoulder", "Beginner", 3, 12, "Lateral Raise"),
    FRONT_RAISE(8, "Front Raise", "Shoulder", "Beginner", 3, 12, "Front Raise"),
    SHOULDER_PRESS(9, "Shoulder Press", "Shoulder", "Beginner", 3, 12, "Shoulder Press"),
    BENCH_PRESS(10, "Bench Press", "Chest", "Beginner", 3, 12, "Bench Press"),
    INCLINE_BENCH_PRESS(11, "Incline Bench Press", "Chest", "Beginner", 3, 12, "Incline Bench Press"),
    DUMBBELL_FLY(12, "Dumbbell Fly", "Chest", "Beginner", 3, 12, "Dumbbell Fly"),
    DUMBBELL_CURL(13, "Dumbbell Curl", "Biceps", "Beginner", 3, 12, "Dumbbell Curl"),
    BARBELL_CURL(14, "Barbell Curl", "Biceps", "Beginner", 3, 12, "Barbell Curl"),
    HAMMER_CURL(15, "Hammer Curl", "Biceps", "Beginner", 3, 12, "Hammer Curl"),
    OVERHEAD_TRICEPS_EXTENSION(16, "Overhead Triceps Extension", "Triceps", "Beginner", 3, 12, "Overhead Triceps Extension"),
    TRICEPS_EXTENSION(17, "Triceps Extension", "Triceps", "Beginner", 3, 12, "Triceps Extension"),
    TRICEPS_KICKBACK(18, "Triceps Kickback", "Triceps", "Beginner", 3, 12, "Triceps Kickback"),
    LATERAL_PULL_DOWN(19, "Lateral Pull Down", "Back", "Beginner", 3, 12, "Lateral Pull Down"),
    SEATED_ROW(20, "Seated Row", "Back", "Beginner", 3, 12, "Seated Row"),
    PULL_UP(21, "Pull Up", "Back", "Beginner", 3, 12, "Pull Up"),

    MOUNTAIN_CLIMBER(22, "Mountain Climber", "Cardio", "Intermediate", 3, 20, "Mountain Climber"),
    STEP_UP(23, "Step Up", "Cardio", "Intermediate", 3, 20, "Step Up"),
    PLANK(24, "Plank", "Cardio", "Intermediate", 3, 20, "Plank"),
    SIDE_PLANK(25, "Side Plank", "Cardio", "Intermediate", 3, 20, "Side Plank"),
    SQUAT_JUMP(26, "Squat Jump", "Leg", "Intermediate", 3, 15, "Squat Jump"),
    LUNGE(27, "Lunge", "Leg", "Intermediate", 3, 15, "Lunge"),
    CALF_RAISE(28, "Calf Raise", "Leg", "Intermediate", 3, 15, "Calf Raise"),
    UPRIGHT_ROW(29, "Upright Row", "Shoulder", "Intermediate", 3, 15, "Upright Row"),
    REVERSE_FLY(30, "Reverse Fly", "Shoulder", "Intermediate", 3, 15, "Reverse Fly"),
    DUMBBELL_PRESS(31, "Dumbbell Press", "Shoulder", "Intermediate", 3, 15, "Dumbbell Press"),
    DUMBBELL_HAMMER_CURL(32, "Dumbbell Hammer Curl", "Biceps", "Intermediate", 3, 15, "Dumbbell Hammer Curl"),
    DUMBBELL_PREACHER_CURL(33, "Dumbbell Preacher Curl", "Biceps", "Intermediate", 3, 15, "Dumbbell Preacher Curl"),
    DUMBBELL_INCLINE_CURL(34, "Dumbbell Incline Curl", "Biceps", "Intermediate", 3, 15, "Dumbbell Incline Curl"),
    DUMBBELL_OVERHEAD_EXTENSION(35, "Dumbbell Overhead Extension", "Triceps", "Intermediate", 3, 15, "Dumbbell Overhead Extension"),
    DUMBBELL_OVERHEAD_KICKBACK(36, "Dumbbell Overhead Kickback", "Triceps", "Intermediate", 3, 15, "Dumbbell Overhead Kickback"),
    BENCH_PRESS_INTERMEDIATE(37, "Bench Press", "Chest", "Intermediate", 3, 15, "Bench Press"),
    INCLINE_BENCH_PRESS_INTERMEDIATE(38, "Incline Bench Press", "Chest", "Intermediate", 3, 15, "Incline Bench Press"),
    DECLINE_BENCH_PRESS_INTERMEDIATE(39, "Decline Bench Press", "Chest", "Intermediate", 3, 15, "Decline Bench Press"),
    DUMBBELL_FLY_INTERMEDIATE(40, "Dumbbell Fly", "Chest", "Intermediate", 3, 15, "Dumbbell Fly"),
    DUMBBELL_ROW(41, "Dumbbell Row", "Back", "Intermediate", 3, 15, "Dumbbell Row"),
    PULL_UP_INTERMEDIATE(42, "Pull Up", "Back", "Intermediate", 3, 15, "Pull Up"),
    LAT_PULL_DOWN_INTERMEDIATE(43, "Lat Pull Down", "Back", "Intermediate", 3, 15, "Lat Pull Down"),

    BURPEE(44, "Burpee", "Cardio", "Advanced", 3, 25, "Burpee"),
    LUNGES(45, "Lunges", "Cardio", "Advanced", 3, 25, "Lunges");

    private final int id;
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
