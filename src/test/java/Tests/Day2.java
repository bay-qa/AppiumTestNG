package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by abarabash on 7/19/16.
 */
public class Day2 extends TestBase {

    @Test
    public void test001(){

        Assert.assertTrue(scr.mainScreen.searchBar.isDisplayed());

        scr.mainScreen.searchBar.click();

        driver.findElement(By.id("search_src_text")).sendKeys("Metallica");

        driver.hideKeyboard();

        List<WebElement> elements = driver.findElements(By.id("page_list_item_title"));

        Assert.assertTrue(elements.get(0).getText().contains("Metallica"));

        elements.get(0).click();

    }


}
