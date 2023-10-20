package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WindowPage extends BasePage{
    public WindowPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".analystic")
    private List<WebElement> tabOptionsList;
    @FindBy(css = "#Tabbed button")
    private WebElement tabOptionElement;
    @FindBy(css = "#Seperate button")
    private WebElement windowOptionElement;
    @FindBy(css="#Multiple button")
    private WebElement multipleOptionElement;

    public void openNewTabbedOptions(){
        elementMethods.clickElement(tabOptionsList.get(0));
        elementMethods.clickElement(tabOptionElement);
//        tabOptionsList.get(0).click();
//        System.out.println(driver.getTitle());
//        tabOptionElement.click();//focusul e aici acuma
//        System.out.println(driver.getTitle());
        windowMethods.moveFocusSpecificTab(1);
        windowMethods.closeCurrentTab();
        windowMethods.moveFocusSpecificTab(0);
        LoggerUtility.infoTest("The user opened new tabbed options");
    }
    public void openNewSeperateWindows(){
        elementMethods.clickElement(tabOptionsList.get(1));
        elementMethods.clickElement(windowOptionElement);
//        tabOptionsList.get(1).click();
//        windowOptionElement.click();
        windowMethods.moveFocusSpecificTab(1);
        windowMethods.closeCurrentTab();
        windowMethods.moveFocusSpecificTab(0);
        LoggerUtility.infoTest("The user opened new sepereted windows");
    }
    public void openSeperateMultipleWindows(){
        elementMethods.clickElement(tabOptionsList.get(2));
        elementMethods.clickElement(multipleOptionElement);
//        tabOptionsList.get(2).click();
//        multipleOptionElement.click();
        windowMethods.moveFocusSpecificTab(2);
        windowMethods.closeCurrentTab();
        windowMethods.moveFocusSpecificTab(1);
        windowMethods.closeCurrentTab();
        windowMethods.moveFocusSpecificTab(0);
        LoggerUtility.infoTest("The user opened multiple windows");

    }

}
