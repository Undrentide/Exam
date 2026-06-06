package ua.solvd.exam.pages.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.exam.pages.common.SearchTripsPageBase;
import ua.solvd.exam.pages.common.TripDetailsPageBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SearchTripsPageBase.class)
public class SearchTripsPage extends SearchTripsPageBase {

    @FindBy(xpath = "//div[contains(@class, 'TripUnit')]")
    private ExtendedWebElement tripUnitContainer;

    public SearchTripsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public boolean isPageOpened() {
        return tripUnitContainer.isElementPresent();
    }

    @Override
    public TripDetailsPageBase clickTripUnit() {
        tripUnitContainer.click();
        return initPage(TripDetailsPageBase.class);
    }
}
