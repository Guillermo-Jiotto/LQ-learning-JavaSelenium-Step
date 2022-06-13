import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepTesting {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomeScreenPage homeScreenPage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sad_d\\IdeaProjects\\LearningMavenProjectLQ\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/");
        loginPage = new LoginPage(driver);
        homeScreenPage = new HomeScreenPage(driver);
    }

    @Test
    public void logInToStepTest(){
        HomeScreenPage homeScreenPage = loginPage.logInToStep();
        String usernameAccount = homeScreenPage.getAccountUsernameText();
        Assertions.assertEquals("admin [admin]", usernameAccount);
    }

    @Test
    public void checkPlansTab() {
        loginPage.logInToStep();
        homeScreenPage.clickOnPlansTab();
    }

    @Test
    public void checkKeywordsTab() {
        loginPage.logInToStep();
        homeScreenPage.clickOnKeywordsTab();
    }

    @Test
    public void checkParametersTab() {
        loginPage.logInToStep();
        homeScreenPage.clickOnParametersTab();
    }

    @Test
    public void checkExecutionsTab() {
        loginPage.logInToStep();
        homeScreenPage.clickOnExecutionsTab();
    }

    @Test
    public void checkSchedulerTab() {
        loginPage.logInToStep();
        homeScreenPage.clickOnSchedulerTab();
    }

    @Test
    public void checkGridTab() {
        loginPage.logInToStep();
        homeScreenPage.clickOnGridTab();
    }

    @Test
    public void checkAdminTab() {
        loginPage.logInToStep();
        homeScreenPage.clickOnAdminTab();
    }

    @AfterEach
    public void tearDown() { driver.quit(); }
}
