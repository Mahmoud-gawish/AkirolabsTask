package locators;

import org.openqa.selenium.By;

public enum AkirolabsPageLocators {
    ACCEPT_COOKIE_BUTTON(By.id("CookieBoxSaveButton"));

    private final By locator;

    AkirolabsPageLocators(By locator) {
        this.locator = locator;
    }

    public By by(){return this.locator;}
}
