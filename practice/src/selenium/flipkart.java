package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class flipkart {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.amazon.in/");
		a.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot)a;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./ScreenShots/jnk.png"));

		a.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Iphonex");
	    a.findElement(By.xpath("//input[@value='Go']")).click();
	    a.navigate().back();
		a.findElement(By.xpath("//span[text()='Category']")).click();
		a.findElement(By.xpath("//table[@id='shopAllLinks']/tbody/tr/td[2]/div/ul/li[1]/a")).click();
		a.navigate().back();
		a.navigate().forward();
		a.navigate().refresh();
		a.navigate().to("https://www.flipkart.com/");
		//a.findElement(By.xpath("//a[text()='Login & Signup']")).click();	
		a.findElement(By.className("_2zrpKA")).sendKeys("9966462160");
		a.findElement(By.xpath("//input[@type='password']")).sendKeys("dkim3836");
		a.findElement(By.xpath("//button[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c']")).click();
		a.findElement(By.xpath("////span[starts-with(text(),'Electronics')]")).click();
	}

}
