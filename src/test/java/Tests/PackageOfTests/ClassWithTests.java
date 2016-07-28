package Tests.PackageOfTests;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by abarabash on 7/27/16.
 */
public class ClassWithTests {

    @Test (groups = "broken", priority = 2)
    public void test002() throws Exception {

        Thread.sleep(2000);
        System.out.println("Test test002 started");
       // throw new Exception();
    }


    @Parameters("parameterName")
    @Test (groups = "working", priority = 1)
    public void test003() throws InterruptedException {

        Thread.sleep(2000);

        System.out.println("sdas");
    }

}
