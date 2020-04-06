package phab.bug.reporting.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import phab.bug.reporting.base.TestBase;
import phab.bug.reporting.pages.LoginPage;

public class LoginTests extends TestBase {
    LoginPage loginPage;

    public LoginTests() {
        super();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void login() {
        loginPage.loginToTheApp();
    }
}
