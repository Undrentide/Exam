package ua.solvd.exam.core.listener;

import org.apache.logging.log4j.LogManager;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LocalizationListener implements ITestListener {
    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(LocalizationListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        Object[] params = result.getParameters();
        if (params.length > 0) {
            LOGGER.info("Starting localization checking for language...{}", params[0]);
        }
    }
}