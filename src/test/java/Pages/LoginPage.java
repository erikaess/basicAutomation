package Pages;

import Logger.LoggerUtility;
import ObjectData.LoginObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input[placeholder='E mail']")
    private WebElement emailFieldElement;
    @FindBy(css="input[placeholder='Password']")
    private WebElement passwordFieldElement;
    @FindBy(id="enterbtn")
    private WebElement enterButtonElement;
    @FindBy(id="errormsg")
    private WebElement errorMessageElement;

    public void loginInvalid(LoginObject loginObject)
    {
        elementMethods.fillElement(emailFieldElement,loginObject.getEmail());
        LoggerUtility.infoTest("The user fills in emailField with value"+loginObject.getEmail());

        elementMethods.fillElement(passwordFieldElement,loginObject.getPassword());
        LoggerUtility.infoTest("The user fills passwordField with value"+loginObject.getPassword());

        elementMethods.clickElement(enterButtonElement);
        LoggerUtility.infoTest("The user clicks on enterButton element");

        elementMethods.validateTextElement(errorMessageElement,loginObject.getErrorMessage());
        LoggerUtility.infoTest("The user validates errorMessageElement field to have value"+ loginObject.getErrorMessage());
    }
}
