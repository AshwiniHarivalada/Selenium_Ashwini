package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day1Assignment {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a//b[text()='Admin']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']")).sendKeys("Mukesh Otwani");
		driver.findElement(By.xpath("//input[@name='systemUser[userName]']")).sendKeys("Ashwini");
		driver.findElement(By.xpath("//input[@name='systemUser[password]']")).sendKeys("Ashwini@222");
		driver.findElement(By.xpath("//input[@name='systemUser[confirmPassword]']")).sendKeys("Ashwini@222");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='btnSave']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Ashwini");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Ashwini@222");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}

}