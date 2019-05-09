package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utility.common;
import utility.xpaths;

public class login {
    common utility = new common();
    xpaths xpath = new xpaths();
    data myData = new data();
    WebDriver driver = utility.createChromeWebDriver();

    @Test(priority = 1)
    void openBrowser(){
        System.out.println("opening browser");
        utility.openPage(driver,"http://mail.google.com");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("logging in");
        utility.delay(driver, (long) 3);
        utility.getElementByXpath(driver,xpath.email_input).sendKeys(myData.emailid);
        utility.getElementByXpath(driver,xpath.next_btn).click();
        utility.getElementByXpath(driver,xpath.pass_input).sendKeys(myData.password);
        utility.getElementByXpath(driver,xpath.login_btn).click();
        utility.delay(driver, (long) 3);

    }

    @Test(priority = 3)
    void logout(){
        System.out.println("logging out");
        utility.getElementByXpath(driver,xpath.option).click();
        utility.getElementByXpath(driver,xpath.logout_btn).click();
    }

    @Test(priority = 4)
    void closeBrowser(){
        System.out.println("closing browser");
        utility.closeBrowser(driver);
    }
}
