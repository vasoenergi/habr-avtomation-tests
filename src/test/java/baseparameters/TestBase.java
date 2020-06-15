package inputs;

import helpers.ElementsHelper;
import inputs.Browsers;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;

public class TestBase {
    public static WebDriver driver;
    public static ElementsHelper elementsHelper;
    public String testURL = ("https://account.habr.com/login/");

    @BeforeGroups(groups = {"test_group"})
    @Parameters("browser")
    public void setUp(Browsers browser) {
        switch (browser) {
            case CHROME:
                WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
                driver = new ChromeDriver();
                break;
            case OPERA:
                WebDriverManager.getInstance(DriverManagerType.OPERA).setup();
                driver = new OperaDriver();
                break;
            case FIREFOX:
                WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid specified browser: " + browser + "expected one of 'CHROME','OPERA','FIREFOX'");
        }
        elementsHelper = new ElementsHelper(driver);
        driver.get(testURL);
        driver.manage().window().maximize();
    }

    @AfterGroups(groups = {"test_group"})
    public void quit() {
        if (driver != null)
            driver.quit();
    }

}
