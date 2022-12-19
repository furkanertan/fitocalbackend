package com.example.fitocalapp.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BodyFatPercentageFormula {
    DEURENBERG_FORMULA("Deurenberg Formula"),
    DEURENBERG_FORMULA_2("Deurenberg Formula 2"),
    GALLAGHER_FORMULA("Gallagher Formula"),
    JACKSON_POLLOCK_FORMULA("Jackson Pollock Formula"),
    JACKSON_AS_FORMULA("Jackson As Formula");

    private final String bodyFatPercentageFormula;
}
