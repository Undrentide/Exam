package ua.solvd.exam.core;

import org.testng.annotations.DataProvider;
import ua.solvd.exam.core.annotations.WithLanguage;
import ua.solvd.exam.core.enums.HomePageLocalization;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;

public class LangDataProvider {

    @DataProvider(name = "getLanguageData")
    public static Iterator<Object[]> getLanguageData(Method testMethod) {
        String requiredLocale = testMethod.isAnnotationPresent(WithLanguage.class)
                ? testMethod.getAnnotation(WithLanguage.class).value() : null;
        return Arrays.stream(HomePageLocalization.values())
                .filter(localization -> !localization.getLocale().isEmpty())
                .filter(localization -> requiredLocale == null || localization.getLocale()
                        .equalsIgnoreCase(requiredLocale))
                .map(localization -> new Object[]{localization})
                .iterator();
    }
}