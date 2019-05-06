package practice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class selenium {


	public static void main(String[] args) {
		WebDriver w = new FirefoxDriver();
		w.get("https://wikipedia.org");
	}

}
