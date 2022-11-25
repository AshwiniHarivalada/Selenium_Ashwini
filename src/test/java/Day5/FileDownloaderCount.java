package Day5;

import java.io.IOException;
import java.util.HashMap;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileDownloaderCount {
    public static void main(String[] args) throws IOException, InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.id("file-upload"))).click().perform();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\ashh1\\Desktop\\File.exe");
        driver.findElement(By.id("file-submit")).click();
      
    }
    }