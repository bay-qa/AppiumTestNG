package Utils;

import Tests.TestBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by abarabash on 7/20/16.
 */
public class Helpers extends TestBase{

    private static WebDriverWait driverWait;


    public static void init (AppiumDriver webDriver){
        int timeoutInSeconds = 60;

        driverWait = new WebDriverWait(webDriver, timeoutInSeconds);

    }


    public static WebElement waitForElement(By locator) {

        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void swipeToDirection(String direction) {

        sleep(1500);

        int screenHeight = driver.manage().window().getSize().getHeight();
        int screenWidth =  driver.manage().window().getSize().getWidth();

        int startx;
        int starty;
        int endx;
        int endy;

        if(direction.equals("left")){

            startx = (int) (screenWidth * 0.98);
            starty = (int) (screenHeight * 0.5);

            endx = (int) (screenWidth * 0.2);
            endy = starty;

            driver.swipe(startx, starty, endx, endy, 1000);

        } else if(direction.equals("right")){

            startx = (int) (screenWidth * 0.02);
            starty = (int) (screenHeight * 0.5);
            endx = (int) (screenWidth * 0.9);
            endy = starty;

            driver.swipe(startx, starty, endx, endy, 1000);

        }


    }

    private static void sleep(long time){

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
