package listeners_extra;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class List_imp implements ISuiteListener, ITestListener {

	ExtentReports report;
	ExtentTest test;

	@Override
	public void onStart(ISuite suite) {
		ExtentSparkReporter spark = new ExtentSparkReporter("./ad_reports/ms111.html");
		spark.config().setDocumentTitle("Sauce_Demo");
		spark.config().setReportName("First_Report");
		spark.config().setTheme(Theme.DARK);

		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("BROWERS", "CHORME");
		report.setSystemInfo("VERSION", "AW01.09.112.55");
		report.setSystemInfo("WINDOWS", "IOS");
		report.setSystemInfo("USERNAME", "CHORME");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test = report.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "THIS IS PASSED");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "THIS IS FAILED");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "THIS IS SKIPPED");
	}

}
