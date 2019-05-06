package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
	    a.get("http://demo.guru99.com/test/ajax.html");
	    a.manage().window().maximize();
	    a.findElement(By.id("yes")).click();
	   // a.findElement(By.xpath("//input[@value='Reset']")).click();
	    a.findElement(By.id("buttoncheck")).click();
}
}
