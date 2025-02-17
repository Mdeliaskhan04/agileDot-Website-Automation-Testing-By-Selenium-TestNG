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
import java.util.Set;

public class Services {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","F:\\Automation Testing Using Selenium+TestNG\\iCrew\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.agiledot.us/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String mainWindow=driver.getWindowHandle();
        WebElement servicesMenu=driver.findElement(By.cssSelector("button.flex"));
        servicesMenu.click();
        Thread.sleep(1000);
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window); // নতুন উইন্ডোতে সুইচ করো
                break;
            }
        }
    }

    @Test(priority = 1)
     public void First() throws InterruptedException
    {
        Thread.sleep(2000);
        WebElement first=driver.findElement(By.linkText("Innovative SaaS (Software as a Service) Services"));
        first.click();
    }
    @Test(priority = 2)
    public void Second()
    {
        WebElement second=driver.findElement(By.linkText("Customized Project Development"));
        second.click();
    }
    @Test(priority = 3)
    public void Three()
    {
        WebElement three=driver.findElement(By.linkText("Software Quality Assurance (SQA)"));
        three.click();
    }
    @Test(priority = 4)
    public void Four()
    {
        WebElement four=driver.findElement(By.linkText("Solution Architecture Design Service"));
        four.click();
    }
    @Test(priority = 5)
    public void Five()
    {
        WebElement five=driver.findElement(By.linkText("Business, Process & IT Consultancy"));
        five.click();
    }

    @AfterClass
    public void tearDown() throws InterruptedException
    {
        Thread.sleep(1500);
        driver.quit();
        System.out.println("Sucessfully passes all the test cases..");
    }
}
