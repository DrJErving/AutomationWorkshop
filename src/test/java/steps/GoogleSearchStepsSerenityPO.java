package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pageObjects.Google.GoogleSearchPageObjectSerenity;

public class GoogleSearchStepsSerenityPO {
    GoogleSearchPageObjectSerenity googleSearchPageObjectSerenity;

    @Step("Given that the user navigates to Google search page")
    public void navigateToGooglePage() {
        googleSearchPageObjectSerenity.open();
    }

    @Step("When the user searches for the keyword: {1}")
    public void searchForKeyword(String keyword) {
        googleSearchPageObjectSerenity.searchFor(keyword);
    }

    @Step("Then the user should see the keyword searched {1} as title")
    public void theUserShouldSeeTheKeywordAsTitle(String keyword) {
        Assert.assertEquals(googleSearchPageObjectSerenity.getTitle(), keyword + " - Google Search");
    }
}
