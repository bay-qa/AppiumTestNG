package Utils;

/**
 * Created by abarabash on 7/24/16.
 */
public class AppiumServer {

    public static void startAppiumServer(String mainAppiumPort, String bootstrapPort, String deviceId) throws Exception {

        //Runtime.getRuntime().exec("cd /Users/abarabash/node_modules/appium");

        Runtime.getRuntime().exec("appium -p " + mainAppiumPort + " -bp " + bootstrapPort + " -U " + deviceId + " -a 127.0.0.1");
        Thread.sleep(7000);

    }

    public static void stopAppiumServer() throws Exception {

        System.out.println("Stopping Appium");

        Runtime.getRuntime().exec("killall node");

    }

}
