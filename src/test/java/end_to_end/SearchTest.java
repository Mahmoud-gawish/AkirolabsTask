package end_to_end;

import base.TestBase;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AkirolabsPage;
import pages.GoogleSearchPage;
import pages.SearchPage;
import utils.Helper;

import static pages.AkirolabsPage.getAkirolabsPage;
import static pages.GoogleSearchPage.getGooglePage;
import static pages.SearchPage.getSearchPage;

public class SearchTest extends TestBase {

    GoogleSearchPage googleSearchPage = getGooglePage();
    SearchPage searchPage = getSearchPage();
    AkirolabsPage akirolabsPage = getAkirolabsPage();

    @Description("Check search results for akirolabs ")
    @Test
    public void testSearchOnWebsite() {
        googleSearchPage.searchOnGoogle(Helper.getProperty("WebsiteSettings.properties", "SearchText"));

        String textResult = searchPage.getSearchResultText();
        Assert.assertEquals(textResult, Helper.getProperty("WebsiteSettings.properties", "firstSearchText"));

        searchPage.openSearchResult();
        String pageTitle = akirolabsPage.acceptCookies().getSearchPageTitle();
        Assert.assertEquals(pageTitle, Helper.getProperty("WebsiteSettings.properties", "pageTitle"));
    }
}
