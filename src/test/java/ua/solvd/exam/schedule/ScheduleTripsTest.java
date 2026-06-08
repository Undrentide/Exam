package ua.solvd.exam.schedule;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;
import ua.solvd.exam.pages.common.HomePageBase;
import ua.solvd.exam.pages.common.SchedulePageBase;

import static org.testng.Assert.assertTrue;
import static ua.solvd.exam.core.enums.HomePageStations.SUMY;

public class ScheduleTripsTest extends BaseScheduleTripsTest {

    @Test
    @MethodOwner(owner = ICHELOMBITKO)
    public void testStationSchedule() {
        HomePageBase homePage = initPage(HomePageBase.class);
        homePage.open();
        assertTrue(homePage.isPageOpened(), "Home page was not opened :C");
        SchedulePageBase schedulePage = homePage.openScheduleMenu();
        assertTrue(schedulePage.isPageOpened(), "Schedule page wasn't opened :C");
        schedulePage.searchStation(SUMY.getName());
        assertTrue(schedulePage.isScheduleTableVisible(), "Schedule table wasn't opened :C");
        assertTrue(schedulePage.isStationPresentInSchedule(SUMY.getName()), "There is no such station in table :C");
    }
}