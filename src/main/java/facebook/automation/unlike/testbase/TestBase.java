package facebook.automation.unlike.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public static WebDriver driver = null;
    public static String browser = "chrome";

    public TestBase() {
        if (driver == null) {
            initDriver();
        }
    }

    public static void initDriver() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win") && browser.contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.get("https://www.facebook.com/");
    }

    public static void main(String[] args) {
        initDriver();
    }
}
