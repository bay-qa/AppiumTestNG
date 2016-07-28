package AnotherPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by abarabash on 7/28/16.
 */
public class ClassWithMoreTests {

    @Test
    public void test001() throws InterruptedException {

        Thread.sleep(2000);

        System.out.println("Test test001 started");
    }

    @Parameters("parameterForTest")
    @Test
    public void test002(String parameterValue) throws InterruptedException {

        Thread.sleep(2000);

        System.out.println("Test test001 started " + parameterValue);
    }



}
