package Day1;



import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class signUpScript {



   public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub



       ChromeDriver chrome=new ChromeDriver();
        
        chrome.get("https://ineuron-courses.vercel.app/login");
        Thread.sleep(3000);
        chrome.findElement(By.linkText("New user? Signup")).click();
        Thread.sleep(4000);
        chrome.findElement(By.xpath("//label[contains(text(),Testing)]")).click();
        WebElement weblist=chrome.findElement(By.xpath("//select[@name=state]"));
        Thread.sleep(5000);
        Select state =new Select(weblist);
        
        List<WebElement> list=state.getOptions();
        
        for(WebElement i:list) {
            if(i.getText().contains("Rajasthan")) {
                System.out.println("rajasthan");
            break;
            }
        }
    }



}
