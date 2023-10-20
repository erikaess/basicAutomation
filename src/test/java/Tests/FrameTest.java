package Tests;

import ObjectData.FrameObject;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import PropertyUtility.PropertyUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;
import sharedData.SharedData;

public class FrameTest extends Hooks {

    @Test
    public void Scenario1() {
        FrameObject frameObject=new FrameObject(propertyUtility.getAllData());

        IndexPage indexPage=new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage=new RegisterPage(getDriver());
        registerPage.clickConsent();
        registerPage.navigateToFrames();

        FramePage framePage=new FramePage(getDriver());
        framePage.interactSingleFrame(frameObject);
        framePage.interactionMultipleFrame(frameObject);


    }
}
