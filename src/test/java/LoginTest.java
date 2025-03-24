import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test
    public void login() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        loginPage.clickSubmitButton();

    }
}
