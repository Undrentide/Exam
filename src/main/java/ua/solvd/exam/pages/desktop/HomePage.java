package ua.solvd.exam.pages.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.exam.enums.HomeOrderingServiceCard;
import ua.solvd.exam.pages.common.HomePageBase;
import ua.solvd.exam.pages.common.SchedulePageBase;
import ua.solvd.exam.pages.common.SearchTripsPageBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//a[contains(@href, '/schedule')]")
    private ExtendedWebElement scheduleMenuButton;

    @FindBy(id = "tripsForm")
    private ExtendedWebElement tripsForm;

    @FindBy(xpath = "//input[@placeholder='Звідки']")
    private ExtendedWebElement stationDepartureInput;

    @FindBy(xpath = "//label[text()='Звідки']/following-sibling::input")
    private ExtendedWebElement stationDepartureField;

    @FindBy(xpath = "//input[@placeholder='Куди']")
    private ExtendedWebElement stationDestinationInput;

    @FindBy(xpath = "//label[text()='Куди']/following-sibling::input")
    private ExtendedWebElement stationDestinationField;

    @FindBy(xpath = "//label[text()='Звідки']/following-sibling::ul/li")
    private ExtendedWebElement stationDepartureDropDownItem;

    @FindBy(xpath = "//label[text()='Куди']/following-sibling::ul/li")
    private ExtendedWebElement stationDestinationDropDownItem;

    @FindBy(id = "startDate")
    private ExtendedWebElement datePicker;

    @FindBy(xpath = "//div[@class='dp__calendar_item'][@aria-pressed='true']/following-sibling::div")
    private ExtendedWebElement datePickerElement;

    @FindBy(xpath = "//button[@type='submit']")
    private ExtendedWebElement findButton;

    @FindBy(xpath = "//section[@id='serviceOrders']")
    private ExtendedWebElement orderingServiceSection;

    private static final String SRC = "src";

    private static final String CARD_ELEMENT_XPATH = "//a[contains(@class, 'HomeServicesCard')][.//h2[text()='%s']]";

    @FindBy(xpath = CARD_ELEMENT_XPATH)
    private ExtendedWebElement cardS;

    @FindBy(xpath = CARD_ELEMENT_XPATH + "/h2")
    private ExtendedWebElement cardTitleS;

    @FindBy(xpath = CARD_ELEMENT_XPATH + "/p")
    private ExtendedWebElement cardDescriptionS;

    private static final String HREF = "href";

    @FindBy(xpath = CARD_ELEMENT_XPATH + "/img")
    private ExtendedWebElement cardIconS;

    private static final String LANG = "lang";

    @FindBy(xpath = "/html")
    private ExtendedWebElement htmlTag;

    @FindBy(xpath = "//div[@class='LanguageSwitcher']//button")
    private ExtendedWebElement localizationButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public boolean isPageOpened() {
        return isPageOpened(10);
    }

    @Override
    public boolean isPageOpened(long timeOut) {
        return tripsForm.isElementPresent(timeOut);
    }

    @Override
    public SchedulePageBase openScheduleMenu() {
        scheduleMenuButton.click();
        return initPage(SchedulePageBase.class);
    }

    @Override
    public void fillStationDepartureInput(String value) {
        stationDepartureInput.click();
        stationDepartureField.type(value);
        stationDepartureDropDownItem.isElementPresent(3);
        stationDepartureDropDownItem.click();
    }

    @Override
    public void fillStationDestinationInput(String value) {
        if (stationDestinationInput.isElementPresent(1)) {
            stationDestinationInput.click();
        }
        stationDestinationField.type(value);
        stationDestinationDropDownItem.isElementPresent(3);
        stationDestinationDropDownItem.click();
    }

    @Override
    public void clickDatePicker() {
        datePicker.click();
    }

    @Override
    public void selectDatePickerElement() {
        datePickerElement.click();
    }

    @Override
    public SearchTripsPageBase clickFindButton() {
        findButton.click();
        return initPage(SearchTripsPageBase.class);
    }

    @Override
    public void scrollToOrderingServicesSection() {
        orderingServiceSection.scrollTo();
    }

    @Override
    public String getOrderingServicesTitle(HomeOrderingServiceCard card) {
        return cardTitleS.format(card.getTitle()).getText();
    }

    @Override
    public String getOrderingServicesDescription(HomeOrderingServiceCard card) {
        return cardDescriptionS.format(card.getTitle()).getText();
    }

    @Override
    public String getOrderingServicesIconUrl(HomeOrderingServiceCard card) {
        return cardIconS.format(card.getTitle()).getAttribute(SRC);
    }

    @Override
    public String getOrderingServicesRedirectUrl(HomeOrderingServiceCard card) {
        return cardS.format(card.getTitle()).getAttribute(HREF);
    }

    @Override
    public void switchLanguage(String targetLangCode) {
        if (htmlTag.getAttribute(LANG) != null && !htmlTag.getAttribute(LANG).toLowerCase()
                .contains(targetLangCode.toLowerCase())) {
            localizationButton.click();
        }
    }

    @Override
    public String getSearchButtonText() {
        return findButton.getText();
    }
}