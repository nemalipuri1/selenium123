package practice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwoStrings 
{
    public static void main(String[] args) 
    {
        String[] username={"@", "test"};
            String[] password= {"@", "test"};
            System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
            WebDriver d = new ChromeDriver();
    	   
        d.get("http://newtours.demoaut.com/mercurysignon.php");
        d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            for(int i = 0; i < username.length ; i++)
            {
               d.findElement(By.name("userName")).clear();
               d.findElement(By.name("userName")).sendKeys(username[i]);
               System.out.println(username[i]);
               d.findElement(By.name("password")).clear();
               d.findElement(By.name("password")).sendKeys(password[i]);
               System.out.println(username[i]);

               d.findElement(By.name("login")).click();
             }
    }
}