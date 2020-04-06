package phab.bug.reporting.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import phab.bug.reporting.base.TestBase;
import phab.bug.reporting.pages.LoginPage;
import phab.bug.reporting.pages.ReportIssue;

import java.io.IOException;

public class ReportIssuesTests extends TestBase {
    ReportIssue reportIssue;

    public ReportIssuesTests() {
        super();
        //loginPage = PageFactory.initElements(driver, LoginPage.class);
        reportIssue = PageFactory.initElements(driver, ReportIssue.class);
    }


    @Test
    public void createManiphestTask() throws IOException {
        reportIssue.createManiphest();
        reportIssue.addProject();
    }


}

