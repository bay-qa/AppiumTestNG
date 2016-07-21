package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by abarabash on 7/19/16.
 */
public class Day2 extends TestBase{

    @Test
    public void test001() {

        Assert.assertTrue(scr.mainScreen.searchBar.isDisplayed());

        scr.mainScreen.searchBar.click();

        driver.findElement(By.id("search_src_text")).sendKeys("Metallica");

        List<WebElement> listResult = driver.findElements(By.id("page_list_item_title"));

        Assert.assertTrue(listResult.get(0).getText().contains("Metallica"));

        listResult.get(0).click();

        Assert.assertTrue(driver.findElement(By.id("page_title_text")).getText().contains("Metallica"));

    }



}
