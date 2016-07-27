package Tests;

import Utils.FacebookTestUserAccount;
import Utils.FacebookTestUserStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by abarabash on 7/26/16.
 */
public class Day7 extends TestBase {

    private String accessToken;

    String applicationID = "1350956204934362";
    String applicationSecret = "a8d1f6d7b13952e4c7f2b4d7ecf0";
    String userEmail;
    String userPass;

    @Test
    public void testFacebookLogin() throws IOException, URISyntaxException {

        getUserCredentials();

        driver.navigate().to("https://m.facebook.com/");

        WebElement loginInput = (new WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"u_0_1\"]/div[1]/div/input"))));

        loginInput.sendKeys(userEmail);

        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).sendKeys(userPass);

        driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();
    }


    public void getUserCredentials(){
        FacebookTestUserStore facebookTestUserStore = new FacebookTestUserStore(applicationID, applicationSecret);

        FacebookTestUserAccount testUserAccount = facebookTestUserStore.createTestUser(true, "");

        userEmail = testUserAccount.getEmail();
        userPass = testUserAccount.getPassword();

    }








}
