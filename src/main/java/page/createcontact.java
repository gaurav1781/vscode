package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class createcontact
{
    static WebDriver driver;
    public void vscoder()
    {
       System.setProperty("webdriver.chrome.driver","D://Selenium//Drivers//chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://viceducation.my.salesforce.com");
        driver.manage().window().maximize();
       driver.findElement(By.id("username")).sendKeys("gauravpal1781-e89f@force.com");
       driver.findElement(By.id("password")).sendKeys("Iloveaus8$$");
       driver.findElement(By.id("Login")).click();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//*[@id=\"brandBand_2\"]/div/div/div/div/div/div/div[1]/div/div/div/runtime_sales_easy-spotlight-internal/article/div[2]/div/div[2]/ul/li[1]/runtime_sales_easy-spotlight-tile/article/div/div[2]/p[1]")).click();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      // driver.findElement(By.xpath("//div[@class='slds-col_bump-right']/lightning-button[@class='dismiss']//input[@type='button']")).click();
      //driver.findElement(By.xpath("//a[contains(@href,'javascript:void(0)')][contains(@class,'forceActionLink')][contains(@title,'New')]")).click();
      driver.findElement(By.xpath("//button[contains(@class,'slds-button')][text()='Dismiss']")).click();
       driver.findElement(By.xpath("//*[@id=\"combobox-button-244-1-244\"]")).click(); 
        }
}