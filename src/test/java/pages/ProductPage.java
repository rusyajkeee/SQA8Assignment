package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

/**
 * Product page for Tricentis Demo Web Shop.
 * Handles add-to-cart for products. Uses add-to-cart-button-* or input[value='Add to cart'].
 */
public class ProductPage {
    WebDriver driver;
    WebDriverWait wait;

    By addToCartBtn = By.cssSelector("input[value='Add to cart']");
    By successMessage = By.cssSelector(".content");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn));
        driver.findElement(addToCartBtn).click();
    }

    public boolean isSuccess() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'The product has been added')]")));
            return true;
        } catch (TimeoutException | NoSuchElementException e) {
            return driver.getPageSource().contains("The product has been added");
        }
    }
}
