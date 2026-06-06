package ua.solvd.exam.localization;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ua.solvd.exam.core.listener.LocalizationListener;
import ua.solvd.exam.pages.common.HomePageBase;

import static org.testng.Assert.*;


@Listeners({LocalizationListener.class})
public class LocalizationSwitchTest extends BaseLocalizationSwitchTest{

    @Test
    @MethodOwner(owner = OWNER)
    public void testLocalizationSwitch(String targetLang, String expectedButtonText) {
        HomePageBase homePage = initPage(HomePageBase.class);
        homePage.open();
        assertTrue(homePage.isPageOpened(), "Home page was not opened :C");
        homePage.switchLanguage(targetLang);
        assertEquals(homePage.getSearchButtonText(), expectedButtonText, "Button text wasn't translated :C");
    }

}