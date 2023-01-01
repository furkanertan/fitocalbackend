package com.example.fitocalapp.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum IdealWeightFormula {
    ROBINSON("R", "Robinson (1983)"),
    MILLER("M", "Miller (1983)"),
    DEVINE("D", "Devine (1974)"),
    HAMWI("H", "Hamwi (1964)");

    private final String code;
    private final String name;
}
