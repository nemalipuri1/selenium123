package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadingImages {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
	a.get("http://demo.guru99.com/test/upload/");
	WebElement uploadele = a.findElement(By.id("uploadfile_0"));
	uploadele.sendKeys("C:/Users/keerthin/Desktop/servers.html");
	a.findElement(By.id("terms")).click();
	a.findElement(By.id("submitbutton")).click();
}
}