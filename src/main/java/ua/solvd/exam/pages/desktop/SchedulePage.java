package ua.solvd.exam.pages.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.exam.pages.common.SchedulePageBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SchedulePageBase.class)
public class SchedulePage extends SchedulePageBase {

    @FindBy(xpath = "//div//span[contains(@class, 'animate-pulse')]/parent::h4")
    private ExtendedWebElement scheduleClock;

    @FindBy(xpath = "//div//span[contains(@class, 'animate-pulse')]/parent::h4/preceding-sibling::*//button")
    private ExtendedWebElement changeStationButton;

    @FindBy(xpath = "//input[contains(@placeholder, 'Пошук станції')]")
    private ExtendedWebElement stationInput;

    @FindBy(xpath = "//div//ul[@role='listbox']//li")
    private ExtendedWebElement stationDropDownItem;

    @FindBy(xpath = "//table[contains(@class, 'ScheduleTable')]")
    private ExtendedWebElement scheduleTable;

    @FindBy(xpath = "//tr[contains(@class, 'StationBoardTableRow')]//span[starts-with(., '%s')]")
    private ExtendedWebElement stationRowInTable;

    public SchedulePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return scheduleClock.isElementPresent();
    }

    @Override
    public void searchStation(String stationName) {
        changeStationButton.click();
        stationInput.type(stationName);
        stationDropDownItem.click();
    }

    @Override
    public boolean isScheduleTableVisible() {
        return scheduleTable.isElementPresent();
    }

    @Override
    public boolean isStationPresentInSchedule(String station) {
        return stationRowInTable.format(station).isElementPresent();
    }
}