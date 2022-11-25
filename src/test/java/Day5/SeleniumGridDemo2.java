package Day5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SeleniumGridDemo2 {
	WebDriver driver;	
	@BeforeMethod
	public void setup() {
		 driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	}

	

}
