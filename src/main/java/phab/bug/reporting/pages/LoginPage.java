package phab.bug.reporting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import phab.bug.reporting.base.TestBase;

public class LoginPage extends TestBase {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    //WebLocators
    @FindBy(name = "username")
    WebElement username;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;


    //Methods

    public void loginToTheApp() {
        username.sendKeys("saravana@dexlock.com");
        password.sendKeys("Tester.3545");
        loginBtn.click();
    }





}
