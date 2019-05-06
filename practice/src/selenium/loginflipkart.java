package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginflipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.flipkart.com/");
		a.manage().window().maximize();
		Thread.sleep(5000);
		a.findElement(By.xpath("//a[text()='Login & Signup']")).click();	
		a.findElement(By.xpath("//*input[@type='text' and @class = '_2zrpKA']")).sendKeys("dinesh");
	}

}
