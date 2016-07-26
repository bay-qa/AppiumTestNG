package Tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by abarabash on 7/26/16.
 */
public class Day6 {

    DesiredCapabilities capabilities = new DesiredCapabilities();
    AppiumDriver driver;
    String URL;

    @Parameters("Device_ID")
    @BeforeTest
    public void startDriver(String deviceId) throws MalformedURLException {

        setCapabilities(deviceId);

        URL = "http://127.0.0.1:4444/wd/hub";

        driver = new AndroidDriver(new URL(URL), capabilities);

        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

    }


    public void setCapabilities(String device) {

        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,
                "Chrome");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
                device);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
                "Android");
        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,
                "com.android.chrome");
        capabilities.setCapability(MobileCapabilityType.UDID, device);
    }

    @Test
    public void testForParallel() {

        driver.get("http://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-middle");

        assertEquals(driver.findElement(By.id("content")).getText(), "MIDDLE");

    }

}
