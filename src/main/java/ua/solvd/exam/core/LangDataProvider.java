package ua.solvd.exam.core;

import org.testng.annotations.DataProvider;

public class LangDataProvider {

    @DataProvider(name = "languages")
    public static Object[][] getLanguageData() {
        return new Object[][]{
                {"en", "Search"},
                {"uk", "Знайти"}
        };
    }
}