package pom_Extra;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_utility.FileUtility;

public class Org1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// OPEN CHROME URL
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// GET PROPERTIES FILES DATA
		FileUtility ful = new FileUtility();

		String URL = ful.getDataFromProperties("url");
		String USERNAME = ful.getDataFromProperties("un");
		String PASSWORD = ful.getDataFromProperties("pwd");

		
		// OPEN URL OF LOCALHOST
		driver.get(URL);
		
		//VERIFY
		LogIn_Page lp = new LogIn_Page(driver);
		HomePage hp = new HomePage(driver);
		Org_Module om = new Org_Module(driver);
		Org_Info oi = new Org_Info(driver);
		
		//ENTER USERNAME
		WebElement un = lp.getun();
		un.sendKeys(USERNAME);

		//ENTER PASSWORD
		WebElement up = lp.getup();
		up.sendKeys(PASSWORD);
		
		// CLICK ON LOGIN BUTTON
		WebElement login = lp.getlogin();
		login.click();
		
		// CLICK ON ORGANIZATION
		WebElement org = hp.org();
		org.click();
		
		// CLICK ON CREATE AN ORGANIZATION
		WebElement co = om.co();
		co.click();

		// ENTER ORGANIZATION NEW-NAME
		WebElement nm = oi.ac();
		String a = "TCS_" + (int) (Math.random() * 1000);
		nm.sendKeys(a);
		
		// CLICK ON WEBSITE
		WebElement ws = oi.ws();
		String sw = ful.getDataFromExcel("org", 0, 1);
		ws.sendKeys(sw);
		
		// CLICK ON TICKER SYMBOL
		WebElement ts = oi.ts();
		String PE = ful.getDataFromExcel("org", 1, 1);
		ts.sendKeys(PE);

		// CLICK ON EMPLOYEES
		WebElement e= oi.e();
		String ME = ful.getDataFromExcel("org", 2, 1);
		e.sendKeys(ME);

		// CLICK ON OTHER EMAIL
		WebElement em = oi.em();
		String M = ful.getDataFromExcel("org", 3, 1);
		em.sendKeys(M);
		
		// CLICK ON PHONE
		WebElement p = oi.p();
		String HP = ful.getDataFromExcel("org", 4, 1);
		p.sendKeys(HP);

		// CLICK ON FAX
		WebElement f = oi.f();
		String F = ful.getDataFromExcel("org", 5, 1);
		f.sendKeys(F);

		// CLICK ON OTHER PHONE
		WebElement ot = oi.ot();
		String O = ful.getDataFromExcel("org", 6, 1);
		ot.sendKeys(O);
		
		// CLICK ON EMAIL
		WebElement em1 = oi.em1();
		String EL = ful.getDataFromExcel("org", 7, 1);
		em1.sendKeys(EL);
		
		// CLICK ON OWNERSHIP
		WebElement os = oi.os();
		String SO = ful.getDataFromExcel("org", 8, 1);
		os.sendKeys(SO);

		// CLICK ON SIC CODE
		WebElement sc = oi.sc();
		String IC = ful.getDataFromExcel("org", 9, 1);
		sc.sendKeys(IC);

		// CLICK ON ANNUAL REVENUE
		WebElement ar = oi.ar();
		String RA = ful.getDataFromExcel("org", 10, 1);
		ar.sendKeys(RA);


		// CLICK ON BILLING ADDRESS
		WebElement bs = oi.bs();
		String AB = ful.getDataFromExcel("org", 11, 1);
		bs.sendKeys(AB);
		
		
////	WebElement LOGIN = driver.findElement(By.id("mouseArea_Billing PO Box"));
		// CLICK ON ASSIGNED TO
		WebElement at = oi.at();
		at.click();

		// CLICK ON SAVE BUTTON	
		WebElement save =oi.save();
		save.click();

		System.out.println("CREATED ORGANIZATION SUCCESSFULLY..........");
		Thread.sleep(3000);
		driver.close();

	}

}
