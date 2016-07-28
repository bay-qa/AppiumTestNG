package Tests.AnotherPackage;

import org.testng.annotations.Test;

/**
 * Created by abarabash on 7/27/16.
 */
public class ClassWithMoreTests {


    @Test
    public void test001() throws InterruptedException {

        Thread.sleep(2000);

        System.out.println("Test test001 started");
    }

}
