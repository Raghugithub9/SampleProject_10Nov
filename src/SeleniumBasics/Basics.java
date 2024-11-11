package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Basics {

	
	@Test
public void accessLinkedin() {
	
	System.setProperty("webdriver.gecko.driver", "D://Trainings//Selenium//Drivers//geckodriver-v0.31.0-win64/geckodriver.exe");
	
	//System.setProperty("webdriver.gecko.driver","geckodriver.exe");

	//Launch the Firefox Browser
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://linkedin.com");
	driver.close();
}
	
	
	@Test
	public void chromeTest() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");

		//Launch the Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.close();
	}
	
	
}
