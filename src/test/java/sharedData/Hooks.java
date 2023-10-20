package sharedData;

import Logger.LoggerUtility;
import PropertyUtility.PropertyUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Hooks extends SharedData {

    public PropertyUtility propertyUtility;

    @BeforeMethod
    public void prepareEnvironment(){
        initiateDriver();
        String testName = this.getClass().getSimpleName();
        propertyUtility = new PropertyUtility(testName);
        LoggerUtility.startTestCase(testName);
    }

    @AfterMethod
    public void clearEnvironment(){
        closeDriver();
        String testName = this.getClass().getSimpleName();
        LoggerUtility.endTestCase(testName);
    }
    @AfterSuite
    public void finishSuite(){
        LoggerUtility.mergeFilesIntoOne();
    }

}
