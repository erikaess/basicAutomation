package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {

    private WebDriver driver;

    public void initiateDriver(){
        //initializezi driver-ele
        driver = new EdgeDriver();
        //driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        driver.get("https://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void closeDriver(){
       // driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
