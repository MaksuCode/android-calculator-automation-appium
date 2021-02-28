package app;


import io.appium.java_client.AppiumDriver;

public class ResultScreen extends BaseApp {

    private final String result = "com.sec.android.app.popupcalculator:id/calc_edt_formula";

    public ResultScreen(AppiumDriver driver) {
        super(driver);
    }

    public String getResult(){
        return findElementById(result).getText();
    }
}
