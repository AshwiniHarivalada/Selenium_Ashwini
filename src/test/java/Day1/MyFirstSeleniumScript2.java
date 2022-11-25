package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript2 {

	public static void main(String[] args) {

		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
	
		WebElement username=driver.findElement(By.xpath("//span[text()='Username']"));
		
		username.sendKeys("Admin");
		
		driver.findElement(By.xpath("//span[text()='Password']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		
		String url=driver.getCurrentUrl();
		
		if(url.contains("dashboard"))
		{
			System.out.println("Login done");
		}
		else
		{
			System.out.println("Login failed");
		}
		
		
		
	}

}
