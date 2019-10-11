package pageObjects.Google;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DefaultUrl("http://www.google.com")
public class GoogleSearchPageObjectSerenity extends PageObject {

    @FindBy(name = "q")
    WebElement search;

    public void searchFor(String keywords) {
        search.sendKeys(keywords, Keys.ENTER);
        waitForCondition().until(ExpectedConditions.titleContains(keywords));
    }
}
