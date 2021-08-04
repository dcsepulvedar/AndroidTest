package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import main.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtils{

    public AndroidDriver<MobileElement> appiumDriver;
    protected static ThreadLocal <AppiumDriver> driver = new ThreadLocal<>();
    public static final long WAIT = 10;




    public AndroidDriver<MobileElement> getDriver() {
        return (AndroidDriver<MobileElement>) driver.get();
    }

    public boolean waitElement(AndroidElement element){
        try{

            WebDriverWait wait = new WebDriverWait(getDriver(), TestUtils.WAIT);

            ExpectedCondition<WebElement> cond1 = ExpectedConditions.elementToBeClickable(element);
            ExpectedCondition<WebElement> cond2 = ExpectedConditions.visibilityOf(element);
            ExpectedCondition<Boolean> cond = ExpectedConditions.and(cond1, cond2);

            wait.until(cond1);
            return true;
        }catch(Exception e){
            return false;
        }
    }


    public void waitElement(By element){
        WebDriverWait wait = new WebDriverWait(BasePage.driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void clickElement(AndroidElement element)   {
        waitElement(element);
        element.click();
    }

}


