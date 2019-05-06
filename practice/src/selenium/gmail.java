package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
    a.get("https://accounts.google.com/");
    a.manage().window().maximize();
    a.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("keerthi.nemalipuri@gmail.com");
    a.findElement(By.xpath("//div[@id='identifierNext']")).click();
    a.findElement(By.xpath("//input[@name='password']//following::div")).sendKeys("vvghhh");
    
}
}
