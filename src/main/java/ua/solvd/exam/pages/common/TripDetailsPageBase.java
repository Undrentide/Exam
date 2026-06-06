package ua.solvd.exam.pages.common;

import org.openqa.selenium.WebDriver;
import ua.solvd.exam.pages.ParentPageBase;

public abstract class TripDetailsPageBase extends ParentPageBase {

    public TripDetailsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract Integer countLegendElements();
}
