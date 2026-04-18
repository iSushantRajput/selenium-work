package Base_Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import generic_utility.FileUtility;

public class Base_Class {

		public WebDriver driver;
		public static WebDriver sdriver;
		
		public ExtentReports report;

		@BeforeSuite
		public void repConfig() {
			ExtentSparkReporter spark = new ExtentSparkReporter("./ad_reports/ss.html");
			spark.config().setDocumentTitle("sauce demo");
			spark.config().setReportName("First Report");
			spark.config().setTheme(Theme.STANDARD);

			report = new ExtentReports();
			report.attachReporter(spark);
			report.setSystemInfo("BROWSER", "CHROME");
			report.setSystemInfo("WINDOS", "IOS");
			report.setSystemInfo("USERID", "ASDF0001");
			report.setSystemInfo("SYSTEM", "QWERT11");
		}
		
		@BeforeClass
		public void opneBro() throws IOException {
			FileUtility futil = new FileUtility();
			String browser =futil.getDataFromProperties("bro");
			
			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "./resources/msedgedriver.exe");
				driver = new EdgeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else {
				driver = new ChromeDriver();
			}

			sdriver = driver;
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		
		@BeforeMethod
		public void login() throws IOException {
			FileUtility futil = new FileUtility();
			String url = futil.getDataFromProperties("url");
			
			driver.get("http://localhost:8888/");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
