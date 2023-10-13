package Tests;

import ObjectData.AlertObject;
import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import PropertyUtility.PropertyUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;
import sharedData.SharedData;

public class AlertTest extends Hooks {

    @Test
    public void Scenario1() {
        AlertObject alertObject=new AlertObject(propertyUtility.getAllData());

        IndexPage indexPage=new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage=new RegisterPage(getDriver());
        registerPage.navigateToAlert();

        AlertPage alertPage=new AlertPage(getDriver());
        alertPage.interactAlertOK();
        alertPage.interactAlertCancel();
        alertPage.interactAlertText(alertObject);
    }
}
