package Tests;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.GoogleSearchStepsSerenityPO;

@RunWith(SerenityRunner.class)
public class TestSerenityWithSerenityPO {
    @Managed
    WebDriver driver;

    @Steps
    GoogleSearchStepsSerenityPO googleSearchStepsSerenityPO;

    @Test
    public void searchShouldUpdateTitle() {
        googleSearchStepsSerenityPO.navigateToGooglePage();
        googleSearchStepsSerenityPO.searchForKeyword("UTN Automation");
        googleSearchStepsSerenityPO.theUserShouldSeeTheKeywordAsTitle("UTN Automation");
    }
}
