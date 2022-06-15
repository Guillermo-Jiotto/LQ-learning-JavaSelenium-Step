package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.HomeScreenPage;
import page.LoginPage;

import java.time.Duration;

public class TestBase {

    public WebDriver driver;
    public LoginPage loginPage;
    public HomeScreenPage homeScreenPage;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        homeScreenPage = PageFactory.initElements(driver, HomeScreenPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.goTo().logIn();
    }

    @AfterEach
    public void tearDown() { driver.quit(); }
}
