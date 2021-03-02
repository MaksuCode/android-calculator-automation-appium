package app;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

import java.net.PortUnreachableException;

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

    public int add(int[] values){
        return operation("add",values);
    }

    public int sub(int[] values){
        return operation("sub", values);
    }

    public int mul(int[] values){
        return operation("mul" , values);
    }

    public int add(int a , int b){
        int[] values = {a , b};
        return operation("add" , values);
    }

    public int sub(int a , int b){
        int[] values = {a , b};
        return operation("sub" , values);
    }

    public int mul(int a , int b){
        int[] values = {a , b};
        return operation("mul" , values);
    }

    public int div(int a , int b){
        int[] values = {a , b};
        return operation("div" , values);
    }

    private int operation(String operation , int[] values){
        for (int i = 0; i < values.length ; i++){
            numbers.number(values[i]).click();
            if (i != values.length-1){
                switch (operation){
                    case "add":
                        operations.plus().click();
                        break;
                    case "sub":
                        operations.sub().click();
                        break;
                    case "mul":
                        operations.mul().click();
                        break;
                    case "div":
                        operations.div().click();
                        break;
                }
            }
        }
        operations.equals().click();
        String result = resultScreen.getResult() ;
        try {
            return Integer.parseInt(result);
        }catch (NumberFormatException nfe){
            return Integer.parseInt(result.substring(1)) * -1;
        }
    }






}
