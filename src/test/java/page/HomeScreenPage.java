package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeScreenPage extends BasePage {
    public HomeScreenPage(WebDriver driver) { super(driver); }

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

    public void checkLoginCorrect() {
        isElementDisplayed(usernameAcc);
    }

    public void adminTabCheck() {
        click(adminTab);
        isElementDisplayed(addUserButton);
    }

    public void gridTabCheck() {
        click(gridTab);
        isElementDisplayed(agentsTabInGrid);
    }

    public void schedulerTabCheck() {
        click(schedulerTab);
        isElementDisplayed(newTaskButton);
    }

    public void executionsTabCheck() {
        click(executionsTab);
        isElementDisplayed(executionListTab);
    }

    public void parametersTabCheck() {
        click(parametersTab);
        isElementDisplayed(newParameterButton);
    }

    public void keywordsTabCheck() {
        click(keywordsTab);
        isElementDisplayed(newKeywordButton);
    }

    public void plansTabCheck() {
        click(plansTab);
        isElementDisplayed(newPlanButton);
    }
}