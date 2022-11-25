package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDynamicElementsTest {
@Test
    public void test1() {
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
         driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
         driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
         Assert.assertTrue(driver.getCurrentUrl().contains("blogspot"));
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Sapient");
         driver.findElement(By.xpath("//input[@value='Show me']")).click();
}
}