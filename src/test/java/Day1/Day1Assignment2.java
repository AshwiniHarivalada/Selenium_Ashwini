package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day1Assignment2 {
		
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
		Thread.sleep(5000);
		WebElement id= driver.findElement(By.xpath("//a[text() = 'Create New Account']"));
		id.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Ashwini");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Harivalada");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Ashwini222@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Ashwini222@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Ashwini@222");
		Thread.sleep(3000);
		WebElement day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select datedd =new Select(day);
		datedd.selectByValue("02");
		Thread.sleep(3000);
		WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select monthdd =new Select(month);
		monthdd.selectByVisibleText("Feb");
		Thread.sleep(3000);
		WebElement year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select yeardd =new Select(year);
		yeardd.selectByValue("2000");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
    }
}
