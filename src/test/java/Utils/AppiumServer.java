package Utils;

import java.io.IOException;

/**
 * Created by abarabash on 7/27/16.
 */
public class AppiumServer {

    public static void startAppiumServer() throws IOException, InterruptedException {

        Runtime.getRuntime().exec("appium -p 4723");

        Thread.sleep(7000);
    }

    public static void stopAppiumServer() throws InterruptedException, IOException {

        Runtime.getRuntime().exec("killall node");

        Thread.sleep(3000);

    }
}
