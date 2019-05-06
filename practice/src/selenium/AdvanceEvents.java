package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvanceEvents {
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
	a.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
	WebElement ele = a.findElement(By.xpath("//button[text()='Automation Tools']"));
	Actions act = new Actions(a);
	Actions series = act.contextClick();
	
	series.perform();
	
	act.moveToElement(ele).perform();	
	//act.contextClick(ele);

	//till here the mouse will perform the actions, it will click and hold
   a.findElement(By.xpath("//div[@class='dropdown-content']//a[text()='Selenium']")).click();;

	}
}
