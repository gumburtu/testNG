import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By usernameLocator = By.id("username");
    By passwordLocator = By.id("password");
    By submitButtonLocator = By.id("submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(submitButtonLocator).click();
    }
}
