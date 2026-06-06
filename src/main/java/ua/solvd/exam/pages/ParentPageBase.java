package ua.solvd.exam.pages;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ParentPageBase extends AbstractPage {

    public ParentPageBase(WebDriver driver) {
        super(driver);
    }
}
