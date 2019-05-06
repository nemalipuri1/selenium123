package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
	a.get("http://demo.guru99.com/test/radio.html");
	List<WebElement> value = a.findElements(By.xpath("//input[@name='webform' and @type='radio']"));
	for (int i =0; i<value.size();i++) 
	{
		WebElement radio = value.get(i);
		String str =radio.getAttribute("value");
		System.out.println("values are"+str);
	
	 
    if(str.equals("Option 1"))
    {
    	radio.click();
    }
    if(str.equals("Option 2"))
    {
    	radio.click();
    }
  }
	List<WebElement> checkbox = a.findElements(By.xpath("//input[@name='webform' and @type='checkbox']"));
	for(int i=0; i<checkbox.size();i++)
	{
		WebElement ele =checkbox.get(i);
		String str1 = ele.getAttribute("value");
		System.out.println("value "+str1);
		if(str1.equals("Checkbox1"))
		{
			ele.click();
		}
		/*if(str1.equals("Checkbox2"))
		{
			ele.click();
		}*/
		
	}
		
}
}
