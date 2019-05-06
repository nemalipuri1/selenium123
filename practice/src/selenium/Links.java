package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
    a.get("http://demo.guru99.com/test/block.html");
    a.manage().window().maximize();
    a.findElement(By.partialLinkText("Inside")).click();
    System.out.println("inside one");
    a.navigate().back();
    a.findElement(By.partialLinkText("Outside")).click();
    System.out.println("o one");

}
}
