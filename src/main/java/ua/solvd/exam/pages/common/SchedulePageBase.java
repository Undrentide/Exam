package ua.solvd.exam.pages.common;

import org.openqa.selenium.WebDriver;
import ua.solvd.exam.pages.ParentPageBase;

public abstract class SchedulePageBase extends ParentPageBase {

    public SchedulePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void searchStation(String stationName);

    public abstract boolean isScheduleTableVisible();

    public abstract boolean isStationPresentInSchedule(String station);
}