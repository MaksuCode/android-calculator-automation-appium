package app;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class Numbers extends BaseApp {


    public Numbers(AppiumDriver driver) {
        super(driver);
    }

    public MobileElement number(int number){
        String id = "com.sec.android.app.popupcalculator:id/calc_keypad_btn_0".concat(String.valueOf(number));
        return findElementById(id);
    }

}
