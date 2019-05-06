package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
	a.get("http://jsbin.com/osebed/2");
	Select drop = new Select(a.findElement(By.id("fruits")));
	drop.selectByIndex(0);
	drop.selectByVisibleText("Apple");
	drop.selectByValue("orange");
	}
}
