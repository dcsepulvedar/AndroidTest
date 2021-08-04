package main;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class BasePage {

    public static AndroidDriver<MobileElement> driver;
    protected static ThreadLocal<String> dateTime = new ThreadLocal<>();

    /**
     * Constructor
     *
     * @param pageDriver: AndroidDriver
     */
    public BasePage(AndroidDriver<MobileElement> pageDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(pageDriver), this);
        driver = pageDriver;
    }

    public static String getDateTime() {
        return dateTime.get();
    }


    public AndroidDriver<MobileElement> getDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("deviceName", "Galaxy S20 FE");
        caps.setCapability("udid", "RF8R4294GAK");
        caps.setCapability("appPackage", "com.android.vending");
        caps.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
        caps.setCapability("automationName", "UiAutomator2");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }


}


