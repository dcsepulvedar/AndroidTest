package test.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import main.BasePage;

import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;


public class HomePage extends BasePage {


    TestUtils testUtils = new TestUtils();

    /**
     * Constructor
     * @param driver : AndroidDriver
     *
     */


    public HomePage(AndroidDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /**
     * Mobile Elements
     */

    // App button Id
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Apps']")
    private AndroidElement btnApps;


    /**
     * Action Methods
     */

    public void clickBtnApps()  {
        testUtils.clickElement(btnApps);
    }


}