package locators;

import org.openqa.selenium.By;
import utils.Helper;

public enum SearchPageLocators {
    FIRST_SEARCH_RESULT(By.xpath("//h3[normalize-space()='" + Helper.getProperty("WebsiteSettings.properties", "firstSearchText") + "']"));

    private final By locator;

    SearchPageLocators(By locator) {
        this.locator = locator;
    }

    public By by() {
        return this.locator;
    }
}
