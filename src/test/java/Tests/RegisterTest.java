package Tests;

import ObjectData.RegisterObject;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;
import sharedData.Hooks;

public class RegisterTest extends Hooks {

    @Test
    public void Scenario1() {
        RegisterObject registerObject=new RegisterObject(propertyUtility.getAllData());

        IndexPage indexPage=new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage=new RegisterPage(getDriver());
        registerPage.clickConsent();
        registerPage.registerProcess(registerObject);
    }
}

