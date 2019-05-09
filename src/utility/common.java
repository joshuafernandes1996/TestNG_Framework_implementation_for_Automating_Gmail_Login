package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class common {

    public WebDriver createChromeWebDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Joshua\\IdeaProjects\\TestNG\\chromedriver_.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public void openPage(WebDriver driver, String url){
        driver.get(url);
    }

    public void delay(WebDriver driver,Long time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public WebElement getElementByXpath(WebDriver driver, String x_path){
        return driver.findElement(By.xpath(x_path));
    }

    public void closeBrowser(WebDriver driver){
        driver.quit();
    }

}
