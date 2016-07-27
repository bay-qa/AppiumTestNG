package Tests;

import Utils.FacebookTestUserAccount;
import Utils.FacebookTestUserStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by abarabash on 7/27/16.
 */
public class Day7 extends TestBase {

    private String accessToken;

    public String applicationID = "1350956204934362";
    public String applicationSecret =  "a8d1f6d7b13952e4c7f2b4d7ecf0df08";
    public String userEmail;
    public String userPass;

    @Test
    public void testFacebookLogin() {

        getUserCredentials();

        driver.navigate().to("http://m.facebook.com/");

        WebElement loginInput = (new WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"u_0_1\"]/div[1]/div/input"))
        ));

        loginInput.sendKeys(userEmail);

        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).sendKeys(userPass);

        driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();

    }

    public void getUserCredentials() {

        FacebookTestUserStore facebookStore = new FacebookTestUserStore(applicationID, applicationSecret);

        FacebookTestUserAccount testUser = facebookStore.createTestUser(true, "email,offline_access");

        userEmail = testUser.getEmail();
        userPass = testUser.getPassword();

    }
}
