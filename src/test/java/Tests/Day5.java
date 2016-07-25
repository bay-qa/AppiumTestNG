package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utils.Helpers.*;

/**
 * Created by abarabash on 7/25/16.
 */
public class Day5 extends TestBase {

    @Test
    public void test001() {

        driver.get("https://en.m.wikipedia.org");


        waitForClickable(driver.findElement(By.id("searchInput")));

        driver.findElement(By.id("searchInput")).click();


        waitForElement(By.xpath("//*[@id=\"mw-mf-viewport\"]/div[2]/div[1]/div/div/form/input"));

        driver.findElement(By.xpath("//*[@id=\"mw-mf-viewport\"]/div[2]/div[1]/div/div/form/input")).sendKeys("Metallica");


        waitForClickable(driver.findElement(By.xpath("//*[@id=\"mw-mf-viewport\"]/div[2]/div[2]/div[3]/ul/li[1]/a")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"mw-mf-viewport\"]/div[2]/div[2]/div[3]/ul/li[1]/a")).getText().contains("Metallica"));
        driver.findElement(By.xpath("//*[@id=\"mw-mf-viewport\"]/div[2]/div[2]/div[3]/ul/li[1]/a")).click();


        waitForClickable(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/p[1]/a[2]")));
        driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/p[1]/a[2]")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"section_0\"]")).getText().contains("Los Angeles"));


    }




}
