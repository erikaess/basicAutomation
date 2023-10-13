package Pages;

import HelpMethods.ElementMethods;
import ObjectData.LoginObject;
import ObjectData.RegisterObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement switchToElement;

    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement alertsElement;
    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement framesElement;
    @FindBy(xpath = "//a[text()='Windows']")
    private WebElement windowsElement;

    public void navigateToAlert() {
//        Actions action = new Actions(driver);//am mutat in HelpMethods
//        action.moveToElement(switchToElement).perform();//move to numai indica unde se duce si perform aplica actiunea
        elementMethods.moveToElement(switchToElement);
        alertsElement.click();
        driver.navigate().to("https://demo.automationtesting.in/Alerts.html"); //navigheaza pana acolo si nu asteapta asa de mult ca get(), sa nu mai vedem reclamele

    }

    public void navigateToFrames() {
        elementMethods.moveToElement(switchToElement);
        framesElement.click();
        driver.navigate().to("https://demo.automationtesting.in/Frames.html");
    }

    public void navigateToWindows() {
        elementMethods.moveToElement(switchToElement);
        windowsElement.click();
        driver.navigate().to("https://demo.automationtesting.in/Windows.html");
    }

    @FindBy(css = "input[placeholder='First Name']")
    private WebElement firstNameElement;
    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement lastNameElement;
    @FindBy(css = "input[value='FeMale']")
    private WebElement radioButtonElement;
    @FindBy(css = "input[type='checkbox']")
    private List<WebElement> checkBoxes;
    @FindBy(css = "input[id='imagesrc']")
    private WebElement uploadElement;
    @FindBy(className = "select2-hidden-accessible")
    private WebElement countryElement;
    @FindBy(id = "Skills")
    private WebElement skillsElement;
    @FindBy(id = "yearbox")
    private WebElement yearElement;
    @FindBy(css = "select[placeholder='Month']")
    private WebElement monthElement;
    @FindBy(id = "daybox")
    private WebElement dayElement;
    @FindBy(css = "input[id='firstpassword']")
    private WebElement passwordElement;
    @FindBy(css = "input[id='secondpassword']")
    private WebElement confirmPassword;
    @FindBy(id = "msdd")
    private WebElement languagesElement;
    @FindBy(css = ".ui-corner-all")
    private List<WebElement> languageOptions;

    public void registerProcess(RegisterObject registerObject) {
        //(String firstName, String lastName,List<String> checkBoxesValues, String passwordRegister, String confirmPasswordRegister,
        //                                String imageUpload, String countryValue, String skillValue, String yearValue, String monthValue, String dayValue, List<String> languageValues)
        elementMethods.fillElement(firstNameElement, registerObject.getFirstName());
        elementMethods.fillElement(lastNameElement,registerObject.getLastName());
        elementMethods.clickElement(radioButtonElement);

        for (int index = 0; index < checkBoxes.size(); index++) {
            //checkBoxes.get(index).click();//pe fiecare faci click
            if(registerObject.getCheckBoxesValues().contains(checkBoxes.get(index).getAttribute("value"))){
                checkBoxes.get(index).click();
            }
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        elementMethods.fillElement(uploadElement,registerObject.getImageUpload());
        elementMethods.selectByText(countryElement, registerObject.getCountryValue());
        elementMethods.selectByText(skillsElement, registerObject.getSkillValue());
        elementMethods.selectByValue(yearElement, registerObject.getYearValue());
        elementMethods.selectByText(monthElement, registerObject.getMonthValue());
        elementMethods.selectByValue(dayElement, registerObject.getDayValue());
        elementMethods.fillElement(passwordElement,registerObject.getPasswordRegister());
        elementMethods.fillElement(confirmPassword,registerObject.getConfirmPasswordRegister());

        languagesElement.click();
        for (int index = 0; index < languageOptions.size(); index++) { //faci o parcurgere de la primul element pana la ultimul

            if (registerObject.getLanguageValues().contains(languageOptions.get(index).getText())) {
                languageOptions.get(index).click();
            }
        }

    }
}
