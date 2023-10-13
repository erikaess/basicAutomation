package Pages;

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
        frameMethods.switchToFrame("singleframe");//te muta cu focusul in IFRAME/frame
        elementMethods.fillElement(iframeTextBox, frameObject.getSingleIFrame());
        frameMethods.switchToDefaultFrame();
    }
    public void interactionMultipleFrame(FrameObject frameObject){
        elementMethods.clickElement(frameOptions.get(1));
        frameMethods.switchToFrame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
        frameMethods.switchToFrame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
        elementMethods.fillElement(nestedIframeTextBox, frameObject.getMultipleIFrame());
    }
}
