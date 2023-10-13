package Pages;

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
        elementMethods.fillElement(passwordFieldElement,loginObject.getPassword());

        elementMethods.clickElement(enterButtonElement);
        elementMethods.validateTextElement(errorMessageElement,loginObject.getErrorMessage());

    }
}
