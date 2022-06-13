import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeScreenPage {

    private WebDriver driver;
    public HomeScreenPage(WebDriver driver) { this.driver = driver; }

    private By usernameAcc = By.id("sessionDropdown");

    private By plansTab = By.xpath("//a[@href='#/root/plans/list']");
    private By keywordsTab = By.xpath("//a[@ng-click=\"setView('functions')\"]");
    private By parametersTab = By.xpath("//a[@ng-click=\"setView('parameters')\"]");
    private By executionsTab = By.xpath("//a[@ng-click=\"setView('executions')\"]");
    private By schedulerTab = By.xpath("//a[@ng-click=\"setView('scheduler')\"]");
    private By gridTab = By.xpath("//a[@ng-click=\"setView('grid')\"]");
    private By adminTab = By.xpath("//a[@ng-click=\"setView('admin')\"]");

    private By newPlanButton = By.xpath("//button[@ng-click='addPlan()']");
    private By newKeywordButton = By.xpath("//*[@ng-click='addFunction()']");
    private By newParameterButton = By.xpath("//*[@ng-click='addParameter()']");
    private By executionListTab = By.xpath("//*[@ng-click='selectTab(tab.id)']");
    private By newTaskButton = By.xpath("//*[@ng-click='addSchedulerEntry()']");
    private By agentsTabInGrid = By.xpath("//li/a[text()='Agents']");
    private By addUserButton = By.xpath("//*[@ng-click=\"addUser()\"]");

    public String getAccountUsernameText() { return driver.findElement(usernameAcc).getText(); }
    public HomeScreenPage clickOnPlansTab() {
        driver.findElement(plansTab).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(newPlanButton));
        return this;
    }

    public HomeScreenPage clickOnKeywordsTab() {
        driver.findElement(keywordsTab).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(newKeywordButton));
        return this;
    }

    public HomeScreenPage clickOnParametersTab() {
        driver.findElement(parametersTab).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(newParameterButton));
        return this;
    }

    public HomeScreenPage clickOnExecutionsTab() {
        driver.findElement(executionsTab).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(executionListTab));
        return this;
    }

    public HomeScreenPage clickOnSchedulerTab() {
        driver.findElement(schedulerTab).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(newTaskButton));
        return this;
    }

    public HomeScreenPage clickOnGridTab() {
        driver.findElement(gridTab).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(agentsTabInGrid));
        return this;
    }

    public HomeScreenPage clickOnAdminTab() {
        driver.findElement(adminTab).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(addUserButton));
        return this;
    }
}