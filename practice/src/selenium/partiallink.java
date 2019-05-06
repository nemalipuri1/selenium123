package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallink 
{
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
	    a.get("http://demo.guru99.com/test/accessing-link.html");
	    a.manage().window().maximize();
	    a.findElement(By.partialLinkText("click")).click();
	    System.out.println("Title of page is: " + a.getTitle());	
	    a.navigate().back();
	    
	    a.findElement(By.partialLinkText("here")).click();
	   // a.navigate().forward();
	    System.out.println("Title of page is: " + a.getTitle());	
	}
}
