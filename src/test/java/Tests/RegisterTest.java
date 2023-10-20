package Tests;

import ObjectData.LoginObject;
import ObjectData.RegisterObject;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;
import sharedData.Hooks;
import sharedData.SharedData;
import PropertyUtility.PropertyUtility;

import java.util.Arrays;
import java.util.List;

public class RegisterTest extends Hooks {

    @Test
    public void Scenario1() {
        RegisterObject registerObject=new RegisterObject(propertyUtility.getAllData());

        IndexPage indexPage=new IndexPage(getDriver());
        indexPage.clickSkipSignIn();
        List<String> languageValues= Arrays.asList("English","Japanese");
        List<String> checkBoxesValues= Arrays.asList("Hockey","Cricket");

        RegisterPage registerPage=new RegisterPage(getDriver());
        registerPage.clickConsent();
        registerPage.registerProcess(registerObject);
//        registerPage.registerProcess("Test","Whatever",checkBoxesValues,"secretPass","secretPass","C:\\Users\\eesslinger\\OneDrive - ENDAVA\\Desktop\\caine.jpg",
//                "Japan","C","1916","October","7",languageValues);
    }
}

