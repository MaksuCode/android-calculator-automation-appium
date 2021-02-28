package app;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

public class Operations extends BaseApp{

    private final String plus = "com.sec.android.app.popupcalculator:id/calc_keypad_btn_add";
    private final String equals = "com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal";

    public Operations(AppiumDriver driver) {
        super(driver);
    }

    public MobileElement plus(){
        return findElementById(plus);
    }

    public MobileElement equals(){
        return findElementById(equals);
    }


}
