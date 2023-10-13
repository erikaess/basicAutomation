package Tests;

import ObjectData.LoginObject;
import Pages.IndexPage;
import Pages.LoginPage;
import PropertyUtility.PropertyUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;
import sharedData.SharedData;

public class LoginTest extends Hooks {

    @Test
    public void metodaLoginTest(){
        LoginObject loginObject=new LoginObject(propertyUtility.getAllData());

        IndexPage indexPage=new IndexPage(getDriver());
        indexPage.clickSignIn();

        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.loginInvalid(loginObject);
    }
}
