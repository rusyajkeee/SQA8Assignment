package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

/**
 * Registration page for Tricentis Demo Web Shop.
 */
public class RegisterPage {
    WebDriver driver;
    WebDriverWait wait;

    By genderMale = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerBtn = By.id("register-button");
    By result = By.cssSelector(".result");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void register(String fn, String ln, String e, String p) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(genderMale));
        driver.findElement(genderMale).click();
        driver.findElement(firstName).sendKeys(fn);
        driver.findElement(lastName).sendKeys(ln);
        driver.findElement(email).sendKeys(e);
        driver.findElement(password).sendKeys(p);
        driver.findElement(confirmPassword).sendKeys(p);
        driver.findElement(registerBtn).click();
    }

    public boolean isRegistrationSuccess() {
        try {
            return driver.findElement(result).getText().contains("Your registration completed");
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
