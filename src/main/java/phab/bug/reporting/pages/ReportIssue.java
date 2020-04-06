package phab.bug.reporting.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import phab.bug.reporting.base.TestBase;
import phab.bug.reporting.data.DataConstants;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class ReportIssue extends TestBase {
    public ReportIssue(WebDriver driver) throws FileNotFoundException {
        this.driver = driver;
    }

    //WebElements
    @FindBy(xpath = "//input[@data-autoid='autoid_3']")
    WebElement title;


    @FindBy(xpath = "//input[@data-autoid='autoid_11']")
    WebElement projectName;
    @FindBy(xpath = "//div[@data-autoid='autoid_10']//a[contains(@href,'/tag/inside/')]")
    WebElement insideProject;


    //Methods
    public void createManiphest() {
        driver.navigate().to("https://phab.dexlock.com/maniphest/task/create/");
    }

    /*

    //div[@data-autoid='autoid_2']//a[contains(@href,'nirmal')]

     */

    public void addProject() {
        try {
            projectName.click();
            projectName.sendKeys(DataConstants.PROJECT_NAME);
            Thread.sleep(5000);
            String xp = "//div[@class='tokenizer-result' and text()='" + DataConstants.PROJECT_NAME + "']";
            WebElement element = driver.findElement(By.xpath(xp));
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xp)));
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
