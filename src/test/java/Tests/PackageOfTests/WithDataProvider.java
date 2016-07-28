package Tests.PackageOfTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by abarabash on 7/27/16.
 */
public class WithDataProvider {

    @DataProvider(name = "forTest001")
    public Object[][] createDataForTest() {
        return new Object[][] {
                { "Data1", new Integer(111111) },
                { "Data2", new Integer(222222)},
        };
    }

    @Test (dataProvider = "forTest001")
    public void test001(String n1, Integer n2) throws InterruptedException {

        Thread.sleep(2000);

        System.out.println(n1 + "   "  + n2);
    }

}
