package ua.solvd.exam.pages.common;

import org.openqa.selenium.WebDriver;
import ua.solvd.exam.enums.HomeOrderingServiceCard;
import ua.solvd.exam.pages.ParentPageBase;

public abstract class HomePageBase extends ParentPageBase {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract SchedulePageBase openScheduleMenu();

    public abstract void fillStationDepartureInput(String value);

    public abstract void fillStationDestinationInput(String value);

    public abstract void clickDatePicker();

    public abstract void selectDatePickerElement();

    public abstract SearchTripsPageBase clickFindButton();

    public abstract void scrollToOrderingServicesSection();

    public abstract String getOrderingServicesTitle(HomeOrderingServiceCard card);

    public abstract String getOrderingServicesDescription(HomeOrderingServiceCard card);

    public abstract String getOrderingServicesIconUrl(HomeOrderingServiceCard card);

    public abstract String getOrderingServicesRedirectUrl(HomeOrderingServiceCard card);

    public abstract void switchLanguage(String lang);

    public abstract String getSearchButtonText();
}