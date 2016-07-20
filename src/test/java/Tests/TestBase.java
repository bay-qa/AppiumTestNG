package Tests;import Settings.CapabilitiesSettings;import io.appium.java_client.AppiumDriver;import org.testng.annotations.AfterMethod;import org.testng.annotations.AfterSuite;import org.testng.annotations.BeforeSuite;import pages.ScreenBase;import java.io.FileInputStream;import java.util.Properties;public class TestBase {	public static AppiumDriver driver;	public static ScreenBase scr;	@BeforeSuite	public void setUp() throws Exception {		scr = new ScreenBase();		System.out.println("Starting Appium driver.....");		startDriver();	}	@AfterMethod	public void afterTest(){		driver.resetApp();	}	@AfterSuite	public void tearDown(){		System.out.println(".......Stopping Appium driver");		driver.quit();	}	public void startDriver() throws Exception {		Properties prop = new Properties();		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/platform.properties");		prop.load(file);		String platform = prop.getProperty("platform");		if (driver == null) {			if (platform.equals("iOS")) {				CapabilitiesSettings.setIOSCapabilities();				driver = CapabilitiesSettings.createIOSDriver();			}			if (platform.equals("Android")) {				CapabilitiesSettings.setAndroidCapabilities();				driver = CapabilitiesSettings.createAndroidDriver();			}			scr.initialize();		}		else {			driver.resetApp();		}	}}