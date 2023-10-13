package Tests;

import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;
import org.testng.annotations.Test;
import sharedData.Hooks;
import sharedData.SharedData;

public class WindowTest extends Hooks {

    @Test //->annotation is started with @
    public void Scenario1() {
        IndexPage indexPage=new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage=new RegisterPage(getDriver());
        registerPage.navigateToWindows();

        WindowPage windowPage=new WindowPage(getDriver());
        windowPage.openNewTabbedOptions();
        windowPage.openNewSeperateWindows();
        windowPage.openSeperateMultipleWindows();

    }
    }
