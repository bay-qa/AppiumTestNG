package Tests.PackageOfTests;

import org.testng.annotations.Test;

/**
 * Created by abarabash on 7/27/16.
 */
public class Dependencies {

    @Test
    public void serverStartedOk() throws Exception {

        boolean serverStarted = true;

        Thread.sleep(2000);

        if (!serverStarted) throw new Exception();
    }

    @Test(dependsOnMethods = { "serverStartedOk" })
    public void method1() {

        System.out.println("Running tests.....");
    }

}
