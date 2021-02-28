package app;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class Numbers extends BaseApp {

    private final String one = "com.sec.android.app.popupcalculator:id/calc_keypad_btn_01";

    private final String two = "com.sec.android.app.popupcalculator:id/calc_keypad_btn_02" ;


    public Numbers(AppiumDriver driver) {
        super(driver);
    }


    public MobileElement one(){
        return findElementById(one);
    }

    public MobileElement two() {
        return findElementById(two);
    }
}
