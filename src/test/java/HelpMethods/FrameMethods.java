package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameMethods {

    private WebDriver driver;
    public FrameMethods(WebDriver driver) {
        this.driver=driver;
    }

    public void switchToFrame(String value){
        driver.switchTo().frame(value);

    }

    public void switchToFrame(WebElement element){
        driver.switchTo().frame(element);
    }
    public void switchToDefaultFrame(){
        driver.switchTo().defaultContent();
    }
}
