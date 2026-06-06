package ua.solvd.exam.services;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ua.solvd.exam.enums.HomeOrderingServiceCard;
import ua.solvd.exam.pages.common.HomePageBase;

import java.util.Arrays;
import java.util.Iterator;

import static org.testng.Assert.*;

public class HomeOrderingServicesTest extends BaseHomeOrderingServiceTest {

    @DataProvider(name = "provideOrderingServiceCardContent")
    public Iterator<Object[]> provideOrderingServiceCardContent() {
        return Arrays.stream(HomeOrderingServiceCard.values())
                .filter(card -> !card.getTitle().isEmpty())
                .map(card -> new Object[]{card})
                .iterator();
    }

    @Test(dataProvider = "provideOrderingServiceCardContent")
    @MethodOwner(owner = OWNER)
    public void testOrderingServicesContent(HomeOrderingServiceCard card) {
        HomePageBase homePageBase = initPage(HomePageBase.class);
        homePageBase.open();
        assertTrue(homePageBase.isPageOpened(), "Home page was not opened :C");
        homePageBase.scrollToOrderingServicesSection();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePageBase.getOrderingServicesTitle(card), card.getTitle(), "Text content mismatch :C");
        softAssert.assertEquals(homePageBase.getOrderingServicesDescription(card), card.getDescription(), "Text content mismatch :C");
        softAssert.assertEquals(homePageBase.getOrderingServicesIconUrl(card), card.getIconUrl(), "Text content mismatch :C");
        softAssert.assertEquals(homePageBase.getOrderingServicesRedirectUrl(card), card.getRedirectUrl(), "Url redirect mismatch :C");
        softAssert.assertAll();
    }
}