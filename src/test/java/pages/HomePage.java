package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

/**
 * Home page for Tricentis Demo Web Shop (demowebshop.tricentis.com).
 * Uses small-searchterms (header search) and search at /search page.
 */
public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    // Header search (nopCommerce DefaultClean) or /search page
    By searchBoxHeader = By.id("small-searchterms");
    By searchBoxSearchPage = By.id("q");
    By searchButton = By.cssSelector("input[type='submit'][value='Search']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void search(String text) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxHeader));
            driver.findElement(searchBoxHeader).clear();
            driver.findElement(searchBoxHeader).sendKeys(text);
            driver.findElement(searchButton).click();
        } catch (Exception e) {
            driver.get("https://demowebshop.tricentis.com/search");
            wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxSearchPage));
            driver.findElement(searchBoxSearchPage).clear();
            driver.findElement(searchBoxSearchPage).sendKeys(text);
            driver.findElement(searchButton).click();
        }
    }

    public void openLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
        driver.findElement(By.linkText("Log in")).click();
    }

    public void openRegister() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register")));
        driver.findElement(By.linkText("Register")).click();
    }

    public void openCart() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Shopping cart")));
        driver.findElement(By.linkText("Shopping cart")).click();
    }
}
