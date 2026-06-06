package ua.solvd.exam.pages.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.exam.pages.common.TripDetailsPageBase;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = TripDetailsPageBase.class)
public class TripDetailsPage extends TripDetailsPageBase {

    @FindBy(xpath = "//*[text()='Деталі маршруту']")
    private ExtendedWebElement tripDetailsButton;

    @FindBy(xpath = "//h4[text()='Умовні позначки']/following-sibling::*//li")
    private List<ExtendedWebElement> legendList;

    @FindBy(xpath = "//h4[text()='Умовні позначки']/following-sibling::*//li")
    private ExtendedWebElement legendElement;

    public TripDetailsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public boolean isPageOpened() {
        return tripDetailsButton.isElementPresent();
    }

    @Override
    public Integer countLegendElements() {
        legendElement.scrollTo();
        return legendList.size();
    }
}
