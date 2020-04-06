package phab.bug.reporting.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public static WebDriver driver;
    public static String browser = "chrome";
    public static String operatingSystem = null;

    public TestBase() {
        if (driver == null) {
            initDriver();
        }
    }

    public static String osName() {
        operatingSystem = System.getProperty("os.name").toLowerCase();
        return operatingSystem;
    }

    public static void initDriver() {
        if (osName().contains("win")) {
            if (browser.contains("chrome")) {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
            }
        }
        if (osName().contains("linux")) {
            if (browser.contains("chrome")) {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
                driver = new ChromeDriver();
            }
        }
        driver.manage().window().maximize();
        driver.get("https://phab.dexlock.com/");
    }


}
