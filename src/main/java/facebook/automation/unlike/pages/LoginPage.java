package facebook.automation.unlike.pages;


import facebook.automation.unlike.testbase.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase {

    public LoginPage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    //xpaths
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "pass")
    WebElement password;
    @FindBy(xpath = "//label[@id='loginbutton']")
    WebElement login;


    //methods
    public void login() {
        email.sendKeys("saravanaprasathbca@gmail.com");
        password.sendKeys("Tester.3545");
        login.click();
    }

}
