package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class google 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
	a.get("https://www.google.com/");
	//a.manage().window().maximize();
	//a.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
	//create action
	Actions act=new Actions(a);
	act.contextClick(a.findElement(By.linkText("About"))).perform();
	
}
}
