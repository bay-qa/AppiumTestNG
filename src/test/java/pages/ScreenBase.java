package pages;

/**
 * Created by abarabash on 2/16/16.
 */
public class ScreenBase {

    public MainScreen mainScreen;
    public RightFrame rightFrame;
    public LeftFrame leftFrame;

    public ScreenBase(){

    }

    public void initialize(){

        mainScreen = new MainScreen();
        rightFrame = new RightFrame();
        leftFrame = new LeftFrame();

    }

}
