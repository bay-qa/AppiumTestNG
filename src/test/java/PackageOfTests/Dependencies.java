package PackageOfTests;

import org.testng.annotations.Test;

/**
 * Created by abarabash on 7/28/16.
 */
public class Dependencies {


    @Test
    public void serverStartedOK() throws Exception {

        boolean serverStarted = true;

        Thread.sleep(2000);

        if(!serverStarted) throw new Exception();
    }

    @Test(dependsOnMethods = { "serverStartedOK"})
    public void method1() {

        System.out.printf("Running UI test");
    }

}
