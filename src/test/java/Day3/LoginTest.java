package Day3;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        System.out.println("Running before method");
        WebDriver driver = new ChromeDriver();
        driver.get(null);
    }
    
    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Running after method");
        
    }
    
    @Test
    public void verifyURL() {
        Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
    }
    @Test
    public void verifyTitle() {
        Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
    }
    @Test
    public void verifySocialMediaCount() {
        Assert.assertEquals(driver.findElements(By.xpath(null)).size(),5);
    }
    @Test
    public void verifyForgotPasswordLink() {
        Assert.assertEquals(driver.findElements(By.xpath(null)).size(),4);
    }





}