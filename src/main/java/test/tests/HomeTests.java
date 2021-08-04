package test.tests;

import main.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.screens.HomePage;

import java.net.MalformedURLException;



public class HomeTests extends BaseTest {

    protected HomePage homePage;


    @Test (priority = 0, alwaysRun = true)
    public void tc001_clickOnAppsButton() throws MalformedURLException {
        this.homePage = new HomePage(basePage.getDriver());
        this.homePage.clickBtnApps();
    }

}
