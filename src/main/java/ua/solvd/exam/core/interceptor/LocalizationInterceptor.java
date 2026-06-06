package ua.solvd.exam.core.interceptor;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import ua.solvd.exam.core.LangDataProvider;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class LocalizationInterceptor implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        if (testMethod.getName().contains("Localization")) {
            annotation.setDataProvider("languages");
            annotation.setDataProviderClass(LangDataProvider.class);
        }
    }
}