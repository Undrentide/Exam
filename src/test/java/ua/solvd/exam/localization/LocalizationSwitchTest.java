package ua.solvd.exam.localization;

import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ua.solvd.exam.core.annotations.WithLanguage;
import ua.solvd.exam.core.enums.HomePageLocalization;
import ua.solvd.exam.core.listener.LocalizationListener;
import ua.solvd.exam.pages.common.HomePageBase;

import static org.testng.Assert.*;

@Listeners({LocalizationListener.class})
public class LocalizationSwitchTest extends BaseLocalizationSwitchTest{

    @Test
    @WithLanguage(value = "en")
    @MethodOwner(owner = ICHELOMBITKO)
    public void testLocalizationSwitch(HomePageLocalization localization) {
        String targetLang = localization.getLocale();
        String expectedButtonText = localization.getName();
        HomePageBase homePage = initPage(HomePageBase.class);
        homePage.open();
        assertTrue(homePage.isPageOpened(), "Home page was not opened :C");
        homePage.switchLanguage(targetLang);
        assertEquals(homePage.getSearchButtonText(), expectedButtonText, "Button text wasn't translated :C");
    }
}