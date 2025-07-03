package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.ConfigManager;

public class GoogleSearchTest {
    WebDriver driver;
    String baseUrl;

    @Parameters("env")
    @BeforeClass
    public void setUp(@Optional("QA") String env) {
        baseUrl = ConfigManager.getBaseUrl(env);
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleTitle() {
        driver.get(baseUrl);
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
