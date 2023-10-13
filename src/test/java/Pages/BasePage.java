package Pages;

import HelpMethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    //cand invatam o sa il facem protected
    public ElementMethods elementMethods;
    public AlertMethods alertMethods;
    public WindowMethods windowMethods;
    public FrameMethods frameMethods;
    public BasePage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(this.driver,this);
        //findElement(By.cssSelector("...']"));
        // in momentul cand faci Page sa se asigure ca toate findBy-uriile sunt initializate si au valori
        elementMethods=new ElementMethods(driver);
        alertMethods=new AlertMethods(driver);
        windowMethods=new WindowMethods(driver);
        frameMethods=new FrameMethods(driver);
    }
}
