package app;


import com.sun.xml.internal.rngom.parse.host.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseApp {

    protected WebDriver driver ;

    public BaseApp(AppiumDriver driver){
        this.driver = driver ;
    }

    protected void click(MobileElement mobileElement){
        try {
            WebDriverWait wait = new WebDriverWait(driver , 5);
            wait.until(ExpectedConditions.elementToBeClickable(mobileElement));
        }catch (Exception e){
            e.printStackTrace();
        }
        mobileElement.click();
    }

    protected void wait(MobileElement mobileElement){
        try {
            WebDriverWait wait = new WebDriverWait(driver , 5);
            wait.until(ExpectedConditions.elementToBeClickable(mobileElement));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected MobileElement findElementById(String id){
        return  (MobileElement) driver.findElement(By.id(id));
    }
}
