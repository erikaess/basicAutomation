package Tests;

import ObjectData.LoginObject;
import Pages.IndexPage;
import Pages.LoginPage;
import PropertyUtility.PropertyUtility;
import ReportUtility.ExtentUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;
import sharedData.SharedData;

public class LoginTest extends Hooks {

    @Test
    public void metodaLoginTest(){
        LoginObject loginObject=new LoginObject(propertyUtility.getAllData());

        IndexPage indexPage=new IndexPage(getDriver());
        indexPage.clickSignIn();
        ExtentUtility.attachTestLog("pass","I click on Sign In");

        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.loginInvalid(loginObject);
        ExtentUtility.attachTestLog("pass","I make login process with Invalid test data");
    }
}
