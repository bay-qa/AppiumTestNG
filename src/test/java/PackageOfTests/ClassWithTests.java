package PackageOfTests;

import org.testng.annotations.Test;

/**
 * Created by abarabash on 7/28/16.
 */
public class ClassWithTests {

    @Test (priority = 2)//(groups = "slow")
    public void test002() throws InterruptedException {

        Thread.sleep(2000);

        System.out.println("Test test002 started");
    }

    @Test (priority = 1)//(groups = "fast")
    public void test003() throws InterruptedException {

        Thread.sleep(2000);

        System.out.println("Test test003 started");
    }

}
