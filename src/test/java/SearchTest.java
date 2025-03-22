import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.security.Key;
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

    @Test
    public void test02() { //aranan iphone urununu sepete ekliyoruz.
        driver.findElement(By.xpath("//*[@id=\"sp-cc-accept\"]")).click();
        driver.findElement(By.xpath("//div[@data-index=\"3\"]")).click();

    }

    @Test
    public void test03() { //urunu sepete ekleme
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.xpath("//*[@id=\"attach-warranty-header\"]")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//*[@id=\"submit.add-to-cart\"]")).click();
        WebElement basket = driver.findElement(By.xpath("//*[@id=\"sw-atc-details-single-container\"]"));
        driver.findElement(By.xpath("//*[@id=\"attachSiNoCoverage\"]"));
        Assert.assertTrue(basket.isDisplayed());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        driver.close(); //action class kapatmasini yazacagiz.//action class kapatmasini yazacagiz.
        //action class kapatmasini yazacagiz.//action class kapatmasini yazacagiz.
    }
}