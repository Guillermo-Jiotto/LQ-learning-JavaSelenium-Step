package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    String site_url = "http://localhost:8080/";
    public LoginPage(WebDriver driver) { super(driver); }

    private By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage goTo() {
        driver.get(site_url);
        return this;
    }

    public void logIn() {
        click(loginButton);
    }
}
