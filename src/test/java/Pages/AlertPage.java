package Pages;

import Logger.LoggerUtility;
import ObjectData.AlertObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasePage{
    public AlertPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(className = "analystic")
    private List<WebElement> alertOptions;
    @FindBy(css=".btn-danger")
    private WebElement buttonAlert;
    @FindBy(css=".btn-primary")
    private WebElement buttonAlert2;
    @FindBy(css=".btn-info")
    private WebElement buttonAlert3;

    public void interactAlertOK(){
        elementMethods.clickElement(alertOptions.get(0));
        elementMethods.clickElement(buttonAlert);
        alertMethods.alertOk();
        LoggerUtility.infoTest("The user interacts with alert ok");

    }
    public void interactAlertCancel(){
        elementMethods.clickElement(alertOptions.get(1));
        elementMethods.clickElement(buttonAlert2);
        alertMethods.alertCancel();
        LoggerUtility.infoTest("The user interacts with alert cancel");
    }
    public void interactAlertText(AlertObject alertObject){
        elementMethods.clickElement(alertOptions.get(2));
        elementMethods.clickElement(buttonAlert3);
        alertMethods.alertText(alertObject.getAlertText());
        LoggerUtility.infoTest("The user interacts with alert text");
        }
}
