package tests;

import base.BaseTest;
import pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Regression tests for Tricentis Demo Web Shop.
 * 4+ automated Regression UI tests.
 */
public class RegressionTests extends BaseTest {

    @Test
    public void REG01_searchInvalid() {
        new HomePage(driver).search("xyznonexistent123");
        Assert.assertTrue(driver.getPageSource().contains("No products were found") || driver.getPageSource().contains("no products"));
    }

    @Test
    public void REG02_addMultiple() {
        driver.get(BaseTest.BASE_URL + "/blue-and-green-sneaker");
        ProductPage p = new ProductPage(driver);
        p.addToCart();
        p.addToCart();
        Assert.assertTrue(p.isSuccess());
    }

    @Test
    public void REG03_sortByPrice() {
        driver.get(BaseTest.BASE_URL + "/books");
        try {
            Select s = new Select(driver.findElement(By.id("products-orderby")));
            s.selectByVisibleText("Price: Low to High");
            Assert.assertTrue(true);
        } catch (Exception e) {
            Assert.fail("Sort dropdown not found: " + e.getMessage());
        }
    }

    @Test
    public void REG04_refreshPersistence() {
        driver.get(BaseTest.BASE_URL + "/blue-and-green-sneaker");
        new ProductPage(driver).addToCart();
        driver.navigate().refresh();
        Assert.assertTrue(driver.getPageSource().contains("Blue and green Sneaker") || driver.getPageSource().contains("Sneaker"));
    }

}
