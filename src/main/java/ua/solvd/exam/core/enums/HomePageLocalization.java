package ua.solvd.exam.core.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public enum HomePageLocalization {
    ENGLISH("en", "Search"),
    UKRAINIAN("uk", "Знайти");

    private final String locale;
    private final String name;
}
