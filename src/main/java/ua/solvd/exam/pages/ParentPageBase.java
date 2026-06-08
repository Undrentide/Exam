package ua.solvd.exam.pages;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ParentPageBase extends AbstractPage {
    protected static final long IS_OPENED_DEFAULT_TIMEOUT = 10;
    protected static final String SRC = "src";
    protected static final String HREF = "href";
    protected static final String LANG = "lang";

    public ParentPageBase(WebDriver driver) {
        super(driver);
    }
}
