package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Contact {
    WebDriver driver;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","F:\\Automation Testing Using Selenium+TestNG\\iCrew\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.agiledot.us/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void Email()
    {
        WebElement email=driver.findElement(By.linkText("info@agiledot.us"));
        email.click();
    }
    @Test(priority =2)
    public void Facebook()
    {
        WebElement facebook=driver.findElement(By.cssSelector("div.mt-4 > a:nth-child(1) > svg:nth-child(1)"));
        facebook.click();
    }
    @Test(priority = 3)
    public void Linkdin()
    {
        WebElement inkdin=driver.findElement(By.cssSelector("div.mt-4 > a:nth-child(2) > svg:nth-child(1)"));
        inkdin.click();
    }
    @Test(priority = 4)
    public void Twitter()
    {
        WebElement twitter=driver.findElement(By.cssSelector("div.mt-4 > a:nth-child(3) > svg:nth-child(1)"));
        twitter.click();
    }
    @AfterClass
    public void tearDown() throws InterruptedException
    {
        Thread.sleep(1500);
        driver.quit();
        System.out.println("Sucessfully passes all the test cases..");
    }
}
