import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchTest {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    public void test01() {
        driver.get("https://www.amazon.co.uk");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone" + Keys.ENTER);
        WebElement resultSearch = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/h2/span[1]"));
        Assert.assertTrue(resultSearch.isDisplayed());


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
