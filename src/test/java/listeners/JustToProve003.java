package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JustToProve003 {
	@Test(retryAnalyzer = listeners_extra.List_Imp_Retry.class)
	private void case4() {
		WebDriver driver = null;
		try {
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
			
			Assert.assertTrue(logo.isDisplayed());
		} finally {
			driver.quit();
		}
		

	}
	

	
	
	
	
	
	
	
	
	
	
}
