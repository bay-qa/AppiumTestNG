package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static Utils.Helpers.*;
import static org.testng.Assert.*;

/**
 * Created by abarabash on 7/19/16.
 */
public class Day3 extends TestBase{

    @Test
    public void test001()  {

        waitForElement(By.id("main_search_bar_text"));

        swipeToDirection("left");

        assertTrue(scr.rightFrame.pageTocItemText.isDisplayed());

    }

    @Test
    public void test002()  {

        waitForElement(By.id("main_search_bar_text"));

        swipeToDirection("right");

        assertTrue(scr.leftFrame.accountText.isDisplayed());



    }



}
