package Tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utils.Helpers.*;

/**
 * Created by abarabash on 7/20/16.
 */
public class Day3 extends TestBase {

    @Test
    public void test001(){

        waitForElement(By.id("main_search_bar_text"));

        swipeToDirection("left");

        Assert.assertTrue(scr.rightFrame.pageTocItemText.isDisplayed());

    }

    @Test
    public void test002(){

        waitForElement(By.id("main_search_bar_text"));

        swipeToDirection("right");

        MobileElement accoutEl = scr.leftFrame.accountText;

        Assert.assertTrue(scr.leftFrame.accountText.isDisplayed());



    }




}
