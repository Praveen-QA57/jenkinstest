package jenkinstest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
WebDriver driver; 


@BeforeTest
public void launch() {
	

driver = new ChromeDriver();

}

	@Test
	public void launchbrowser() {
		driver.get("https://www.google.com/");
		System.out.println("Browser Launched");
	}
	
	@Test(dependsOnMethods = "launchbrowser")
	public void search() {
		driver.findElement(By.xpath("//span[text()='AI Mode']")).click();	
		System.out.println("Google opened");
	}
	
	@AfterTest
	public void endbrowser() {
		
		driver.quit();
		System.out.println("Browser closed");
	}
	
}
