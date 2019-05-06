package practice;


import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class chrome {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
	    a.get("https://accounts.google.com/");
	    
	  a.manage().window().maximize();
	  a.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("mahesh babu");
	  //a.findElement(By.xpath("//div[@role='button' and @id ='identifierNext']")).click();
	  //a.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).click();
	  a.findElement(By.xpath("//input[@value='Google Search' and @name='btnK']")).click();
	 //  a.close();
		
}
}
