package Utils;

import java.io.IOException;

/**
 * Created by abarabash on 7/24/16.
 */
public class AppiumServer {

    public static void startAppiumServer() throws IOException, InterruptedException { //String mainAppiumPort, String bootstrapPort, String deviceId)  {

        Runtime.getRuntime().exec("appium -p 4723");// + mainAppiumPort + " -bp " + bootstrapPort + " -U " + deviceId + " -a 127.0.0.1");
        Thread.sleep(7000);
    }

    public static void stopAppiumServer() throws Exception {

        System.out.println("Stopping Appium");

        Runtime.getRuntime().exec("killall node");
        Thread.sleep(3000);

    }

}
