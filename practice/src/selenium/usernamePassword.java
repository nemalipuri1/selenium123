package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usernamePassword {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
	a.get("http://demo.guru99.com/test/login.html");
    a.manage().window().maximize();
    a.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    a.findElement(By.id("email")).sendKeys("keerthi.nemalipuri@gmail.com");
    a.findElement(By.linkText("Agile Project")).click();
    a.findElement(By.id("passwd")).sendKeys("ajnhgjj");
    a.findElement(By.id("SubmitLogin")).submit();
    System.out.println("logged in");
}
}
