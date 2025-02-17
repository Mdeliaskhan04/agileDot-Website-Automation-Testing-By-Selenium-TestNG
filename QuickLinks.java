package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class QuickLinks {
    WebDriver driver;
    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","F:\\Automation Testing Using Selenium+TestNG\\iCrew\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.agiledot.us/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    @Test(priority = 1)
    public void Home()
    {
        WebElement home=driver.findElement(By.linkText("Home"));
        home.click();
    }
    @Test(priority = 2)
    public void Services()
    {
        WebElement services=driver.findElement(By.cssSelector("button.transition-colors"));
        services.click();
    }
    @Test(priority = 6)
    public void aboutUs()
    {
        WebElement AboutUs=driver.findElement(By.xpath("/html/body/main/div/footer/div[1]/div[2]/ul/li[3]/a"));
        AboutUs.click();
    }
    @Test(priority = 4)
    public void Contact()
    {
        WebElement contact=driver.findElement(By.linkText("Contact"));
        contact.click();
    }
    @Test(priority = 5)
    public void Privacy()
    {
        WebElement privacyPolicy=driver.findElement(By.linkText("Privacy and Policy"));
        privacyPolicy.click();
    }
    @Test(priority = 3)
    public void Terms()
    {
        WebElement termsCondition=driver.findElement(By.linkText("Terms and Conditions"));
        termsCondition.click();
    }

    @AfterClass
    public void tearDown() throws InterruptedException
    {
        Thread.sleep(1500);
        driver.quit();
        System.out.println("Sucessfully passes all the test cases..");
    }
}
