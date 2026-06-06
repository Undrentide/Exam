package ua.solvd.exam.pages.common;

import org.openqa.selenium.WebDriver;
import ua.solvd.exam.pages.ParentPageBase;

public abstract class SearchTripsPageBase extends ParentPageBase {

    public SearchTripsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract TripDetailsPageBase clickTripUnit();
}
