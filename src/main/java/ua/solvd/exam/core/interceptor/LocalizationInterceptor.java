package ua.solvd.exam.core.interceptor;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import ua.solvd.exam.core.LangDataProvider;
import ua.solvd.exam.core.annotations.WithLanguage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class LocalizationInterceptor implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        if (testMethod != null) {
            boolean isNameMatch = testMethod.getName().contains("Localization");
            boolean hasAnnotation = testMethod.isAnnotationPresent(WithLanguage.class);
            if (isNameMatch || hasAnnotation) {
                annotation.setDataProvider("getLanguageData");
                annotation.setDataProviderClass(LangDataProvider.class);
            }
        }
    }
}