package Pages;

import Logger.LoggerUtility;
import ObjectData.FrameObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage{
    public FramePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".analystic")
    private List<WebElement> frameOptions;
    @FindBy(xpath = "//input[@type='text']")
    private WebElement iframeTextBox;
    @FindBy(xpath = "//input[@type='text']")
    private WebElement nestedIframeTextBox;
    public void interactSingleFrame(FrameObject frameObject){
        elementMethods.clickElement(frameOptions.get(0));
        LoggerUtility.infoTest("The user clicks on first Frame option");
        frameMethods.switchToFrame("singleframe");//te muta cu focusul in IFRAME/frame
        LoggerUtility.infoTest("The user switches on Iframe");
        elementMethods.fillElement(iframeTextBox, frameObject.getSingleIFrame());
        LoggerUtility.infoTest("The user fills in the first text box");
        frameMethods.switchToDefaultFrame();
        LoggerUtility.infoTest("The user interacts with Single Frame");
    }
    public void interactionMultipleFrame(FrameObject frameObject){
        elementMethods.clickElement(frameOptions.get(1));
        LoggerUtility.infoTest("The user clicks on the second Frame option");
        frameMethods.switchToFrame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
        frameMethods.switchToFrame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
        LoggerUtility.infoTest("The user switches on Iframe");
        elementMethods.fillElement(nestedIframeTextBox, frameObject.getMultipleIFrame());
        LoggerUtility.infoTest("The user fills in the second text box");
    }
}
