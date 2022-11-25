package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Exception {
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("");
		
//
//		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
//		
//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
//		WebElement ele=driver.findElement(By.xpath("//h1[text()='Dashboard']"));
//		Assert.assertTrue(ele.isDisplayed());

}}
