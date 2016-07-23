package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by abarabash on 7/22/16.
 */
public class Day5 extends TestBase {

    @Test
    public void test001() {

        driver.get("https://en.m.wikipedia.org");

        driver.findElement(By.id("searchInput")).click();

        driver.findElement(By.xpath("//*[@id=\"mw-mf-viewport\"]/div[2]/div[1]/div/div/form/input")).sendKeys("Metallica");

        driver.findElement(By.xpath("//*[@id=\"mw-mf-viewport\"]/div[2]/div[2]/div[3]/ul/li[1]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/p[1]/a[2]")).click();

    }


    @Test
    public void test002() {

        driver.get("http://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-middle");

        assertEquals(driver.findElement((By.id("content"))).getText(), "MIDDLE");

    }



}
