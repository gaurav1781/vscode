package steps;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class vsctest
{
    WebDriver driver;

    @Test
    public void vscode()
    {
        System.setProperty("webdriver.chrome.driver","D://Selenium//Drivers//chromedriver.exe");
        driver=new ChromeDriver();

        driver.navigate().to("https://viceducation.my.salesforce.com");
        driver.manage().window().maximize();
       driver.findElement(By.id("username")).sendKeys("gauravpal1781-e89f@force.com");
       driver.findElement(By.id("password")).sendKeys("Iloveaus8$$");
       driver.findElement(By.id("Login")).click();
        }
        
       
    }