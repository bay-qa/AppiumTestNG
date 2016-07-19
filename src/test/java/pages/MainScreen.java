package pages;

import Tests.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by abarabash on 7/17/16.
 */
public class MainScreen extends TestBase {

    public MainScreen(){
        System.out.println("Initializing Main screen elements");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }



    @AndroidFindBy(id = "main_search_bar_text")
    public MobileElement searchBar;
}
