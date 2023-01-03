package com.example.fitocalapp.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class RecommendedExercises {
    private String name;
    private String type;
    private String level;
    private Integer set;
    private Integer repeat;
    private String link;
}
