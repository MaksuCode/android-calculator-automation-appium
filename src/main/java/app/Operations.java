package app;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

public class Operations extends BaseApp{

    private final String baseId = "com.sec.android.app.popupcalculator:id/calc_keypad_btn_";

    public Operations(AppiumDriver driver) {
        super(driver);
    }

    public MobileElement plus(){
        return findElementById(baseId.concat("add"));
    }

    public MobileElement equals(){
        return findElementById(baseId.concat("equal"));
    }

    public MobileElement sub(){
        return findElementById(baseId.concat("sub"));
    }

    public MobileElement mul(){
        return findElementById(baseId.concat("mul"));
    }

    public MobileElement div(){
        return findElementById(baseId.concat("div"));
    }

    public MobileElement percentage(){
        return findElementById(baseId.concat("percentage"));
    }





}
