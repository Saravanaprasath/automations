package facebook.automation.unlike.tests;

import facebook.automation.unlike.pages.LoginPage;
import facebook.automation.unlike.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    LoginPage loginPage;

    public LoginTests() {
        super();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void loginToAccount() {
        loginPage.login();
    }
}
