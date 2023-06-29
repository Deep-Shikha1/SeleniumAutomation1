import java.util.List;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\deepshikha.1\\Desktop\\Java\\SeleniumWebDriver_1\\DemoProject1\\drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://omayo.blogspot.com/");
		


	}

}
