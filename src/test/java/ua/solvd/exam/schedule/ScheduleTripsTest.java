package ua.solvd.exam.schedule;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;
import ua.solvd.exam.pages.common.HomePageBase;
import ua.solvd.exam.pages.common.SchedulePageBase;

import static org.testng.Assert.assertTrue;

public class ScheduleTripsTest extends BaseScheduleTripsTest {

    @Test
    @MethodOwner(owner = OWNER)
    public void testStationSchedule() {
        HomePageBase homePage = initPage(HomePageBase.class);
        homePage.open();
        assertTrue(homePage.isPageOpened(), "Home page was not opened :C");
        SchedulePageBase schedulePage = homePage.openScheduleMenu();
        assertTrue(schedulePage.isPageOpened(), "Schedule page wasn't opened :C");
        schedulePage.searchStation(SUMY);
        assertTrue(schedulePage.isScheduleTableVisible(), "Schedule table wasn't opened :C");
        assertTrue(schedulePage.isStationPresentInSchedule(SUMY), "There is no such station in table :C");
    }
}