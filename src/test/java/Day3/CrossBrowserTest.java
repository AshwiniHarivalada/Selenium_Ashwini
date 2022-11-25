package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

	public void loginTest(String browser)
	{
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			
		}
		if(browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("Edge ")) {
			driver=new EdgeDriver();
		}
		
	}
}
