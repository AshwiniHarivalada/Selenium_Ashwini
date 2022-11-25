package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day1AssignmentTest {
	@Test
	   public  void test2() throws InterruptedException{
	        //SearchContext driver1 = new ChromeDriver();
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("http://137.184.76.209/orangehrm-4.9");
	        Assert.assertTrue(driver.getCurrentUrl().contains("orange"));
	        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
	        driver.findElement(By.xpath("//input[@class='button']")).click();
//	        Assert.assertTrue(driver.findElement(By.xpath("//b[normalize-space()='Dashboard']")).getText().contains("Dashboard"));
	        driver.findElement(By.xpath("//a[contains(@class,'firstLevelMenu')]")).click();
	        driver.findElement(By.xpath("//input[contains(@name,'btnAdd')]")).click();
	        //Select systemUser_userType = new UserType(systemUser_userTypeDrop);
	     
	    }



	}