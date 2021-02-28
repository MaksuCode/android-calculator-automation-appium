package app;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class Calculator extends BaseApp{

    private final Numbers numbers;
    private final Operations operations;
    private final ResultScreen resultScreen;

    public Calculator(AppiumDriver driver) {
        super(driver);
        numbers = new Numbers(driver);
        operations = new Operations(driver);
        resultScreen = new ResultScreen(driver);
    }

    public Numbers numbers(){
        return numbers;
    }

    public Operations operations(){
        return operations;
    }

    public ResultScreen resultScreen(){
        return resultScreen;
    }




}
