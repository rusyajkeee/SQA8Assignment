package tests;

import base.BaseTest;
import pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Smoke tests for Tricentis Demo Web Shop.
 * 4+ automated Smoke UI tests.
 */
public class SmokeTests extends BaseTest {

    @Test
    public void SM01_homeLoads() {
        Assert.assertTrue(driver.getTitle().contains("Demo Web Shop"));
    }

    @Test
    public void SM02_searchProduct() {
        new HomePage(driver).search("computer");
        Assert.assertTrue(driver.getPageSource().contains("computer") || driver.getPageSource().contains("Computer"));
    }

    @Test
    public void SM03_addToCart() {
        driver.get(BaseTest.BASE_URL + "/blue-and-green-sneaker");
        ProductPage p = new ProductPage(driver);
        p.addToCart();
        Assert.assertTrue(p.isSuccess());
    }

    @Test
    public void SM04_openLogin() {
        new HomePage(driver).openLogin();
        Assert.assertTrue(driver.getTitle().contains("Login"));
    }

}
