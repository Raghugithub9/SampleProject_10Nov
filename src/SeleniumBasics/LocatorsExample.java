package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatorsExample {

/*
  	Element Locators
		ID	--
		Name
		Class Name
		LinkText
		Partial LinkText
		Xpath - absolute xpath
		Relative xpath
		CssSelector
		
		TagName
*/	
	
	@Test
	public void accessLinkedin() {
		
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://facebook.com");
		
		//driver.findElement(By.id("email")).sendKeys("raghutest@gmail.com");
		
		
		//ID locator
		WebElement id=driver.findElement(By.id("email"));
		id.sendKeys("raghutest@gmail.com");
		
		//Name locator
		//WebElement name=driver.findElement(By.name("email"));
		
		//WebElement className=driver.findElement(By.className("inputtext _55r1 _6luy"));
		
		//Link Text
		//WebElement linktxt=driver.findElement(By.linkText("Forgotten password?"));
		
		
		//Partial Link Text
		//WebElement ptlinktxt=driver.findElement(By.partialLinkText("password?"));
		//ptlinktxt.click();
		
		//html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]
		
		//Relative Xpath
		//@tag[att='value']
		//*[att='value']
		
		//Absolute xpath
		WebElement pwlink=driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/a[1]"));
		pwlink.click();
		
		//Relative xpath
		//WebElement cancel=driver.findElement(By.xpath("//a[normalize-space()='Cancel']"));
		//cancel.click();
		
		//css Selector
		WebElement cancel=driver.findElement(By.cssSelector("._42ft._4jy0._9nq1.textPadding20px._4jy3._517h._51sy"));
		cancel.click();
		
		driver.close();
		
		
		
		
	}
	

	
	
}
