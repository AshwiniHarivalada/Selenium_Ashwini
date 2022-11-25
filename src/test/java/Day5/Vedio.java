package Day5;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Vedio {
	WebDriver driver;	
	@Parameters({"browserName","browerVersion","os","osVersion"})
	@BeforeMethod
	public void setup(String browserName,String browserVersion,String os,String osVersion) {
		DesiredCapabilities capabilities =new DesiredCapabilities();
		capabilities.setCapability("browserName", browserName);
		capabilities.setCapability("browserVersion", browserVersion);
		capabilities.setCapability("os",os);
		capabilities.setCapability("osVersion", osVersion);
		URL url=null;
		try {
			url = new URL("https://ashwiniharivalad_KkHAfl:pewfnzu7FFfNKiXWEzLs@hub-cloud.browserstack.com/wd/hub");
		}catch(MalformedURLException e) {
			e.printStackTrace();

		}
		driver=new RemoteWebDriver(url,capabilities);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test

	public void login() throws InterruptedException {
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		WebElement ele=driver.findElement(By.xpath("//h1[text()='Dashboard']"));
		Assert.assertTrue(ele.isDisplayed());
		

	}
}

