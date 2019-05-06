package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ie {
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.ie.driver", "C:\\selenium\\ie\\IEDriverServer.exe"); 
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://msn.com");
	}

}
