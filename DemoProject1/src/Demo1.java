import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\deepshikha.1\\Desktop\\Java\\SeleniumWebDriver_1\\DemoProject1\\drivers\\chromedriver.exe");
		
	 //A blank chrome browser will be launched
		WebDriver driver = new 	ChromeDriver();  
		
		//The provided URL will be opened in the above chrome browser
		driver.get("http://omayo.blogspot.com/");  
		
		//Maximizing the browser window
		driver.manage().window().maximize();
		
		//Finding the UI elements
		WebElement element1 = driver.findElement(By.id("but2"));
		
//		//Click on GetConfirmation button
//		WebElement element2 = driver.findElement(By.id("confirm"));
//		element2.click();
//		
		
		//Wait for 5sec  ---throuws InterruptedException
		Thread.sleep(5000);
		
		//Type something in textfield
		WebElement element3 = driver.findElement(By.name("q"));
		element3.sendKeys("Deep Shikha");
		Thread.sleep(5000);
		
		
//		//Clear Text (Selenium WebDriver)
//		WebElement element4 = driver.findElement(By.id("textbox1"));
//		element4.clear();
//		Thread.sleep(5000);
		
		//Type something in textfield using className locators
		WebElement element5 = driver.findElement(By.className("classone"));
		element5.sendKeys("Shikha Deep");
		Thread.sleep(5000);
		
//		//Click on Compendiumdev link
//		WebElement element6 = driver.findElement(By.linkText("compendiumdev"));
//		element6.click();
//		Thread.sleep(5000);
//		
//		//Click on partial link Compendium ***(if not able to find locators--> NoSuchElementException)***
//		WebElement element7 = driver.findElement(By.partialLinkText("compendiumd"));
//		element7.click();
//		Thread.sleep(5000);

//		// Click on GetConfirmation button using cssSelector locators
//		WebElement element8 = driver.findElement(By.cssSelector("confirm"));
//		element8.click();
//		

//		//Click on GetConfirmation button  using Xpath locator
//		WebElement element9 = driver.findElement(By.xpath("//input[@id='confirm']"));
//		element9.click();
//		
		
//		// Directly calling with WebElement
//		driver.findElement(By.xpath("//input[@id='confirm']")).click();
//		
//		
//		//getText -- get the text in Console using getText() locators (returntype of getText is String) (getText()-value between the tags)
//		String text1 = driver.findElement(By.id("pah")).getText();
//		System.out.println(text1);   //--- To print the text in console
//		
//		//get the Title of the page using getTitle()
//		String title1 = driver.getTitle();
//		System.out.println("title of the page is: " + title1);
//		
//		//get the URL of the page using getCurrentUrl()
//		String url1 = driver.getCurrentUrl();
//		System.out.println("url of the page is: " + url1);
//		
		
//		
//		//get the URL of the compendiumdev
//		driver.findElement(By.linkText("compendiumdev")).click();
//		String url2 = driver.getCurrentUrl();
//		System.out.println("url of the the compendiumdev is: " + url2);
//		
//		
//		//open a new tab to check Close and quit functionality (close-only main window close, quit- main window + Child window + popup will close)
//		driver.findElement(By.linkText("Open a popup window")).click();
//		driver.findElement(By.linkText("Blogger")).click();
//		
		
		//getAttribute -- to get AttributeText value (remove line 42)  //(getText()-value between the tags) or (getAttribute- provided attribute name-- SeleniumWebDriver)
		String AttributeText1 = driver.findElement(By.id("textbox1")).getAttribute("value");
		System.out.println(AttributeText1);
	
		
		//isDisplayed -- Button2 is displayed or not using isDisplayed locators  (returntype of isDisplayed locators-- boolean )
		boolean displayed1 = driver.findElement(By.id("but2")).isDisplayed();
		System.out.println("Button2 is diplayed on the page: " + displayed1);
		
		//isEnabled --Button1 is enabled or not using isEnabled locators (returntype of isEnabled locators-- boolean)
		 boolean enabled1 = driver.findElement(By.id("but1")).isEnabled();
		 System.out.println("Button1 is enabled or not on the page: " + enabled1);
		 
		//isSelected --- checkbox is selected or not
		 boolean selectedCheckbox = driver.findElement(By.id("checkbox1")).isSelected();
		 System.out.println("checkbox is selected: " + selectedCheckbox);
		 
		//navigate().to   ---- navigate to another url
		 driver.navigate().to("https://www.facebook.com/login/");
		 Thread.sleep(2000);
		 
		 //navigate().back() --
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
//		 //navigate().forward()--
//		 driver.navigate().forward();
//		 Thread.sleep(2000);
//		
//		 //
//		 driver.navigate().back();
//		 Thread.sleep(2000);
//		 
//		 
//		 //navigate().refresh() --
//		 driver.navigate().refresh();
//		 Thread.sleep(2000);
//		 
////		 //getPageSource -- get html code of complete page
////		 String sourcecode1 = driver.getPageSource();
////		 System.out.println(sourcecode1);
//		 
//		 
////		 //Submit -- submiting a form  (Comment line no. 126-137)
////		 driver.navigate().to("https://www.facebook.com/login/");  -- (Take upper facebook link) line no.119
//		 driver.findElement(By.id("email")).sendKeys("deep123@gmail.com");
//		 
//		 driver.findElement(By.id("pass")).sendKeys(("1234"));
//		 
//		 driver.findElement(By.id("loginbutton")).submit();
//		 
//		 //getTagName() -- tagname of the email textbox --input
//		 String tagname1 = driver.findElement(By.id("email")).getTagName();
//		 System.out.println(tagname1);
		 
		 
		 
		 //getCssValue -- cssvalue of Home button
		 String CSSvalue1 = driver.findElement(By.id("home")).getCssValue("text-align");  //take link line no.123  omayao.org(QAFX)
		 System.out.println(CSSvalue1);
		 
		 //getSize() -- find height and weidth of the Button2
		Dimension d1 = driver.findElement(By.id("but2")).getSize();
		System.out.println("Height of the button is :" + d1.height);
		System.out.println("Weidth of the button is :" + d1.width);
		
		////getLocation -- position of the Button2 (return type of getLocation --Point )
		org.openqa.selenium.Point p1 = driver.findElement(By.id("but2")).getLocation();
		System.out.println("X coordinate of the Button2 is :" + p1.x);
		System.out.println("Y coordinate of the Button2 is :" + p1.y);
		
		//manage().window().fullScreen --
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		
		//findElement-- find only one element   (return type of findElement -- WebElement)
		//findElements-- find one or more than one elements (return type of findElements -- List<WebElement>)
		List<WebElement> elements1 = driver.findElements(By.tagName("a"));
		
		for(int i=0; i<elements1.size(); i++)
		{
			if(elements1.get(i).getText().length()>0)
			{
				System.out.println(elements1.get(i).getText());
			}
			
		}
		
//		 or
		for(WebElement j : elements1)
		{
			if(j.getText().length()>0)
			{
				System.out.println(j.getText());
			}
		}
//
//		 
//		 
//	
//		 
		  
		// Close the browser
		//driver.close();
		
		// quit the browser
		//driver.quit();
		
		
		
		
		
		
		
	}

}
