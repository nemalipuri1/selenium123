package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
	    a.get("http://demo.guru99.com/test/facebook.html");
	    a.manage().window().maximize();
	    a.findElement(By.xpath("//input[@id='email']")).sendKeys("keerthi.nemalipuri@gmail.com");
	    a.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz");
	    a.findElement(By.xpath("//*[@id='u_0_b']")).click();
	}

}
