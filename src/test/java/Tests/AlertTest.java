package Tests;

import ObjectData.AlertObject;
import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import PropertyUtility.PropertyUtility;
import ReportUtility.ExtentUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;
import sharedData.SharedData;

public class AlertTest extends Hooks {

    @Test
    public void Scenario1() {
        AlertObject alertObject=new AlertObject(propertyUtility.getAllData());

        IndexPage indexPage=new IndexPage(getDriver());
        indexPage.clickSkipSignIn();
        ExtentUtility.attachTestLog("pass","I click on skip sign in");

        RegisterPage registerPage=new RegisterPage(getDriver());
        registerPage.clickConsent();
        ExtentUtility.attachTestLog("pass","I click on consent button");
        registerPage.navigateToAlert();
        ExtentUtility.attachTestLog("pass","I navigate to alert page");

        AlertPage alertPage=new AlertPage(getDriver());
        alertPage.interactAlertOK();
        ExtentUtility.attachTestLog("pass","I interact with Alert Ok");
        alertPage.interactAlertCancel();
        ExtentUtility.attachTestLog("pass","I interact with Alert Cancel");
        alertPage.interactAlertText(alertObject);
        ExtentUtility.attachTestLog("pass","I interact with Alert Text");
    }
}
