package ua.solvd.exam.trips;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;
import ua.solvd.exam.pages.common.HomePageBase;
import ua.solvd.exam.pages.common.SearchTripsPageBase;
import ua.solvd.exam.pages.common.TripDetailsPageBase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TripsNavigationTest extends BaseTripsTest {

    @Test
    @MethodOwner(owner = OWNER)
    public void tripDetailsE2ENavigationTest() {
        HomePageBase homePage = initPage(HomePageBase.class);
        homePage.open();
        assertTrue(homePage.isPageOpened(), "Home page was not opened :C");
        homePage.fillStationDepartureInput(KYIV_PASSENGER);
        homePage.fillStationDestinationInput(LVIV);
        homePage.clickDatePicker();
        homePage.selectDatePickerElement();
        SearchTripsPageBase searchTripsPage = homePage.clickFindButton();
        assertTrue(searchTripsPage.isPageOpened(), "Search trips page was not opened :C");
        TripDetailsPageBase tripDetailsPage = searchTripsPage.clickTripUnit();
        assertTrue(tripDetailsPage.isPageOpened(), "Trip details page  was not opened :C");
        assertEquals(tripDetailsPage.countLegendElements(), 14, "Mismatch detected with trips details count.");
    }
}