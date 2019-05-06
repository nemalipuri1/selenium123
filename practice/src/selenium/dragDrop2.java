package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop2 
{
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Thread.sleep(5000);
		 a.manage().window().maximize();
		Actions act = new Actions(a);
		WebElement main = a.findElement(By.xpath("//span[text()='Bestsellers'][1]"));
		WebElement destination=a.findElement(By.xpath("(//span[text()='History'])[2]"));
		act.clickAndHold(main).pause(2000).moveToElement(destination).release().build().perform();
		
	}
	
}
