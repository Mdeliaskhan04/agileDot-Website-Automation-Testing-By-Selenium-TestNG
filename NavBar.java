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

public class NavBar {
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
    public void Contact()
    {
        WebElement contact=driver.findElement(By.linkText("Contact"));
        contact.click();
        String title= driver.getTitle();
        System.out.println(title);
    }

    @Test(priority = 2)
    public void AboutUs()
    {
        WebElement aboutUs=driver.findElement(By.linkText("About"));
        aboutUs.click();
    }

    @Test(priority = 3)
    public void Services() throws InterruptedException
    {
        WebElement services=driver.findElement(By.cssSelector("button.flex"));
        services.click();
    }

    @AfterClass
    public void tearDown() throws InterruptedException
    {
        Thread.sleep(1500);
     driver.quit();
     System.out.println("Sucessfully passes all the test cases..");
    }
}
