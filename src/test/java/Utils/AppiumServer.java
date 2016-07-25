package Utils;

/**
 * Created by abarabash on 7/24/16.
 */
public class AppiumServer {

    public static void startAppiumServer(String port) throws Exception {


//
//        CommandLine command = new CommandLine("/Applications/Appium.app/Contents/Resources/node/bin/node");
//
//        //command.addArgument("/Applications/Appium.app/Contents/Resources/node_modules/appium/bin/ios-webkit-debug-proxy-launcher.js", false);
//
//        command.addArgument("--ADDRESS", false);
//
//        command.addArgument("0.0.0.0");
//
//        command.addArgument("--PORT", false);
//
//        command.addArgument(port);
//
//        command.addArgument("--no-reset", false);
//
//        DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
//
//        DefaultExecutor executor = new DefaultExecutor();
//
//        executor.setExitValue(1);
//
//        executor.execute(command, resultHandler);
//
//

        Runtime.getRuntime().exec("appium -p 4723 -a 127.0.0.1");
        Thread.sleep(7000);

    }

    public static void stopAppiumServer() throws Exception {

        System.out.println("Stopping Appium");

        Runtime.getRuntime().exec("killall node");

    }

}
