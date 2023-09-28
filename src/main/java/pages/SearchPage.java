package pages;

import io.qameta.allure.Step;

import static locators.SearchPageLocators.FIRST_SEARCH_RESULT;
import static utils.ElementActions.*;

public class SearchPage {

    private SearchPage() {

    }

    public static SearchPage getSearchPage() {
        return new SearchPage();
    }

    @Step("get search result text")
    public String getSearchResultText() {
        waitUntilElementPresent(FIRST_SEARCH_RESULT.by());
        return findElement(FIRST_SEARCH_RESULT.by()).getText();
    }

    @Step("open search result")
    public SearchPage openSearchResult() {
        waitUntilElementPresent(FIRST_SEARCH_RESULT.by());
        clickElement(FIRST_SEARCH_RESULT.by());
        return this;
    }
}
