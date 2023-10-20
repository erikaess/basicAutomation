package Tests;

import ObjectData.FrameObject;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import PropertyUtility.PropertyUtility;
import ReportUtility.ExtentUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;
import sharedData.SharedData;

public class FrameTest extends Hooks {

    @Test
    public void Scenario1() {
        FrameObject frameObject=new FrameObject(propertyUtility.getAllData());

        IndexPage indexPage=new IndexPage(getDriver());
        indexPage.clickSkipSignIn();
        ExtentUtility.attachTestLog("pass","I click on skip sign in");


        RegisterPage registerPage=new RegisterPage(getDriver());
        registerPage.clickConsent();
        ExtentUtility.attachTestLog("pass","I click on consent button");
        registerPage.navigateToFrames();
        ExtentUtility.attachTestLog("pass","I navigate to Frames page");

        FramePage framePage=new FramePage(getDriver());
        framePage.interactSingleFrame(frameObject);
        ExtentUtility.attachTestLog("pass","I interact with single frame");

        framePage.interactionMultipleFrame(frameObject);
        ExtentUtility.attachTestLog("pass","I interact with multiple frame");



    }
}
