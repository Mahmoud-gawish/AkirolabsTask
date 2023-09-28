package pages;

import io.qameta.allure.Step;
import utils.DriverFactory;

import static locators.AkirolabsPageLocators.ACCEPT_COOKIE_BUTTON;
import static locators.SearchPageLocators.FIRST_SEARCH_RESULT;
import static utils.ElementActions.*;

public class AkirolabsPage {
    private AkirolabsPage() {

    }

    public static AkirolabsPage getAkirolabsPage() {
        return new AkirolabsPage();
    }

    public AkirolabsPage acceptCookies() {
        waitUntilElementPresent(ACCEPT_COOKIE_BUTTON.by());
        clickElement(ACCEPT_COOKIE_BUTTON.by());
        return this;
    }

    @Step("get Page phrase")
    public String getPageText() {
        waitUntilElementPresent(FIRST_SEARCH_RESULT.by());
        return findElement(FIRST_SEARCH_RESULT.by()).getText();
    }

    @Step("get page title")
    public String getSearchPageTitle() {
        return DriverFactory.getPageTitle();
    }
}
