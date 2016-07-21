package Tests;

import Utils.Helpers;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static Utils.Helpers.swipeToDirection;
import static Utils.Helpers.waitForClickable;

/**
 * Created by abarabash on 7/20/16.
 */
public class Day4 extends TestBase {

    @Test
    public void test001(){

        waitForClickable(scr.mainScreen.searchBar);

        scr.mainScreen.searchBar.click();

        driver.findElement(By.id("search_src_text")).sendKeys("Metallica");

        List<WebElement> listResult = driver.findElements(By.id("page_list_item_title"));

        Assert.assertTrue(listResult.get(0).getText().contains("Metallica"));

        listResult.get(0).click();

        Assert.assertTrue(driver.findElement(By.id("page_title_text")).getText().contains("Metallica"));

        Helpers.switchToWebView();

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        for(WebElement eachLink : allLinks){

            if (eachLink.getAttribute("href") != null && eachLink.getAttribute("href").contains("Los_Angeles")){
                waitForClickable(eachLink);
                eachLink.click();
                break;
            }
        }

        Helpers.switchToNative();

        Assert.assertTrue(driver.findElement(By.id("link_preview_title")).getText().contains("Los Angeles"));

    }


    @Test
    public void test002(){

        waitForClickable(scr.mainScreen.searchBar);

        scr.mainScreen.searchBar.click();

        driver.findElement(By.id("search_src_text")).sendKeys("Metallica");

        MobileElement result = null;

        while (result == null) {

            List<MobileElement> results = driver.findElements(By.id("page_list_item_title"));

            for (MobileElement each : results){
                if(each.getText().contains("Load")){
                    result = each;
                    break;
                }
            }

            if(result == null) swipeToDirection("up");
        }

        result.click();




    }









}
