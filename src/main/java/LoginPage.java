import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) { this.driver = driver; }

    private By usernameInput = By.xpath("//input[@name='username']");
    // admin
    private By passwordInput = By.xpath("//input[@name='password']");
    // init
    private By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage setLogin(String login){
        driver.findElement(usernameInput).sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
        return this;
    }

    public HomeScreenPage logInToStep(){
        driver.findElement(loginButton).click();
        return new HomeScreenPage(driver);
    }
}
