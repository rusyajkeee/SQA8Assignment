package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

/**
 * Login page for Tricentis Demo Web Shop.
 * nopCommerce uses Email and Password as field IDs.
 */
public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By email = By.id("Email");
    By password = By.id("Password");
    By loginBtn = By.cssSelector("input[value='Log in']");
    By warning = By.cssSelector(".validation-summary-errors");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void login(String e, String p) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(email));
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(e);
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(p);
        driver.findElement(loginBtn).click();
    }

    public boolean hasError() {
        try {
            return driver.findElement(warning).isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
