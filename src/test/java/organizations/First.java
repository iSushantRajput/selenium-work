package organizations;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class First {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		// URL LINK
		driver.get("https://newsite.mstblockchain.com/portal/register/nEN80713/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// CLOSE APLLICATION POPUP
		WebElement closeBtn = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='dialog']//button")));
		closeBtn.click();

		//  Wait popup gone
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@role='dialog']")));

		//  Get VISIBLE mobile input (IMPORTANT 🔥)
		WebElement phoneNo = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='mobile'])[last()]")));

		//  Now it WILL work
		phoneNo.sendKeys("9876543175");

		// wait for button clickable
		WebElement otpBtn = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));

		// click
		otpBtn.click();
		List<WebElement> otpFields = wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='dialog']//input[@type='tel']")));

		driver.findElement(By.xpath("(//input[@type='tel'])[1]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[3]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[4]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[5]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[6]")).sendKeys("0");
		System.out.println(otpFields.size());

		WebElement submitBtn = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='dialog']//button[text()='Submit']")));
		// CLICK DONE
		submitBtn.click();
		System.out.println("URL: " + driver.getCurrentUrl());
		System.out.println("Has Aadhaar: " + driver.getPageSource().contains("aadhaar"));
		System.out.println("OTP Submitted");

		// HARD WAIT (React transition)
		Thread.sleep(30000);

		// WAIT UNTIL MODAL REMOVED COMPLETELY
		wait.until(ExpectedConditions.invisibilityOfElementLocated(
		    By.xpath("//div[@role='dialog']")
		));

		System.out.println("Popup Removed");

		//  SWITCH CONTEXT (IMPORTANT)
		driver.switchTo().defaultContent();

		//  WAIT FOR DOM STABLE
		wait.until(driver1 -> 
		    ((JavascriptExecutor)driver1).executeScript("return document.readyState").equals("complete")
		);

		System.out.println("Page Loaded");
		

		Thread.sleep(3000);
			
		//  NOW FIND AADHAAR (SAFE WAY)
		WebElement aadhaar = wait.until(
		        ExpectedConditions.elementToBeClickable(By.name("aadharNumber"))
		);

		Actions act = new Actions(driver);

		act.moveToElement(aadhaar).click().sendKeys("987654321216").perform();
		Thread.sleep(3000);

		System.out.println("Aadhaar Entered");

		// WAIT UNTIL OTP BUTTON ENABLE
		WebElement otpButton = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//button[@type='submit']")
		        )
		);

		// CLICK OTP BUTTON
		act.moveToElement(otpButton).click().perform();

		System.out.println("OTP Button Clicked");

		// click
		otpBtn.click();
		List<WebElement> otpFields1 = driver.findElements(
			    By.xpath("//input[@type='tel' and contains(@aria-label,'OTP character')]")
			);
		driver.findElement(By.xpath("(//input[@type='tel'])[1]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[3]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[4]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[5]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[6]")).sendKeys("0");
		System.out.println(otpFields1.size());

		
		
		/**
		 * 
		**/
		otpBtn.click();
		List<WebElement> otpFields11 = driver.findElements(
			    By.xpath("//input[@type='tel' and contains(@aria-label,'OTP character')]")
			);
		driver.findElement(By.xpath("(//input[@type='tel'])[1]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[3]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[4]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[5]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[6]")).sendKeys("0");
		System.out.println(otpFields11.size());
		otpBtn.click();
		List<WebElement> otpFields12 = driver.findElements(
			    By.xpath("//input[@type='tel' and contains(@aria-label,'OTP character')]"));
		driver.findElement(By.xpath("(//input[@type='tel'])[1]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[3]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[4]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[5]")).sendKeys("0");
		driver.findElement(By.xpath("(//input[@type='tel'])[6]")).sendKeys("0");
		System.out.println(otpFields12.size());
		/**
		 * 
		**/
		
		
		
		WebElement submitBtn2 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='dialog']//button[text()='Submit']")));
		// CLICK DONE
		submitBtn2.click();
		
		Thread.sleep(3000);
		driver.quit();	


	}

}
