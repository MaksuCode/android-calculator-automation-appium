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

    public int add(int[] values){
        for (int i = 0; i < values.length ; i++){
            numbers.number(values[i]).click();
            if (i != values.length-1){
                operations.plus().click();
            }
        }
        operations.equals().click();
        return Integer.parseInt(resultScreen.getResult());
    }

    public int add(int a , int b){
        numbers.number(a).click();
        operations.plus().click();
        numbers.number(b).click();
        operations.equals().click();
        return Integer.parseInt(resultScreen.getResult());
    }

    public void sub(int a , int b){
        numbers.number(a).click();
        operations.sub().click();
        numbers.number(b).click();
        operations.equals().click();
    }

    public void mul(int a , int b){
        numbers.number(a).click();
        operations.mul().click();
        numbers.number(b).click();
        operations.equals().click();
    }

    public void div(int a , int b){
        numbers.number(a).click();
        operations.div().click();
        numbers.number(b).click();
        operations.equals().click();
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
