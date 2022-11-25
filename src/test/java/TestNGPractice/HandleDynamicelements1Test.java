package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDynamicelements1Test {
	@Test
	public void test7() {
	   WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
       Assert.assertTrue(driver.getCurrentUrl().contains("blogspot"));

       driver.findElement(By.xpath("//button[text()='Try it']")).click();
       //Thread.sleep(10000);
       WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(10));
       Alert alt=wb.until(ExpectedConditions.alertIsPresent());
       alt.accept();
      
   }



}