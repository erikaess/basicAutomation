package sharedData;

import PropertyUtility.PropertyUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends SharedData {

    public PropertyUtility propertyUtility;

    @BeforeMethod
    public void prepareEnvironment(){
        initiateDriver();
        String testName = this.getClass().getSimpleName();
        propertyUtility = new PropertyUtility(testName);
    }

    @AfterMethod
    public void clearEnvironment(){
        closeDriver();
    }

}
