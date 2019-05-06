package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(5000);
		Actions act = new Actions(a);
		WebElement ele =a.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement drop=a.findElement(By.xpath(".//*[@id='droppable']"));
		act.dragAndDrop(ele, drop).build().perform();

	}

}
