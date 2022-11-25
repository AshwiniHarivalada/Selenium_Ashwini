package Day1;



import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class MyFirstSeleniumScript4 {



   public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ineuron-courses.vercel.app/signup");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("ashwini");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ashwini@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ash@123");
        
        WebElement stateDropdown = driver.findElement(By.id("state"));
        WebElement genderDropdown = driver.findElement(By.id("gender"));
        Select state = new Select(stateDropdown);
        //Select gender = new Select(genderDropdown);
        state.selectByVisibleText("Rajasthan");
        Thread.sleep(2000);
        /*state.selectByIndex(2);
        Thread.sleep(2000);
        state.selectByVisibleText("Goa");
        Thread.sleep(2000);
        state.selectByValue("Karnataka");
        */
        List<WebElement> allValues = state.getOptions();
        for(WebElement ele:allValues) {
            System.out.println(ele.getText());
            String st=ele.getText();
            if(st.contains("Rajasthan"))
            {
                System.out.println("Found the required result");
                System.out.println(ele.getText());
                break;
            }
            
        }
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/div/a")).click();
        driver.findElement(By.linkText("New user? Signup")).click();
    }



}