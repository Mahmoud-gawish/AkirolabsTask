package locators;

import org.openqa.selenium.By;

public enum GoogleSearchPageLocators {
   SEARCH_BOX(By.id("APjFqb"));
    private final By locator;

    GoogleSearchPageLocators(By locator) {
        this.locator = locator;
    }

    public By by(){ return this.locator; }
}
