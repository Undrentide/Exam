package ua.solvd.exam.core.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public enum HomePageStations {
    SUMY("Суми"),
    KYIV_PASSENGER("Київ-Пасажирський"),
    LVIV("Львів");

    private final String name;
}