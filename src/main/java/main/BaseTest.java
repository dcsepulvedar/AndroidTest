package main;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public AndroidDriver<MobileElement> driver;
    public BasePage basePage;



    @BeforeClass(alwaysRun = true)
    public void beforeSuite() {
        this.basePage = new BasePage(driver);
    }



    @AfterMethod(alwaysRun = true)
    public void closeApp() {
        BasePage.driver.closeApp();



    }
}
