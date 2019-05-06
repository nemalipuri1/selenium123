package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listelement {
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
    a.get("http://demo.guru99.com/test/ajax.html");
    a.manage().window().maximize();
    List<WebElement> lk = a.findElements(By.tagName("a"));
    
    for (WebElement lkcurrent : lk) {
    	String text = lkcurrent.getText();
		System.out.println(text);
	}
	}

}
