package tests;

import base.BaseTest;
import pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Negative / validation tests for Tricentis Demo Web Shop.
 * 2+ automated Negative tests.
 */
public class NegativeTests extends BaseTest {

    @Test
    public void NEG01_invalidLogin() {
        new HomePage(driver).openLogin();
        LoginPage l = new LoginPage(driver);
        l.login("invalid@test.com", "wrongpassword123");
        Assert.assertTrue(l.hasError(), "Expected login error message for invalid credentials");
    }

    @Test
    public void NEG02_emptySearch() {
        new HomePage(driver).search("");
        // Tricentis shows JS alert "Please enter some search keyword" for empty search - validation works
        try {
            org.openqa.selenium.Alert alert = driver.switchTo().alert();
            String text = alert.getText();
            alert.accept();
            Assert.assertTrue(text.contains("search") || text.contains("keyword"), 
                "Expected validation alert for empty search, got: " + text);
        } catch (org.openqa.selenium.NoAlertPresentException e) {
            Assert.assertTrue(driver.getPageSource().contains("No products") || driver.getCurrentUrl().contains("search"));
        }
    }

}
