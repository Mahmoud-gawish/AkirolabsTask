package pages;

import io.qameta.allure.Step;
import utils.Helper;

import static locators.GoogleSearchPageLocators.*;
import static utils.ElementActions.*;

public class GoogleSearchPage {

    private GoogleSearchPage() {

    }

    public static GoogleSearchPage getGooglePage() {
        return new GoogleSearchPage();
    }

    @Step("search on google")
    public GoogleSearchPage searchOnGoogle(String SearchText) {
        sendKeysAndSubmit(SEARCH_BOX.by(), SearchText);
        return this;
    }

}
