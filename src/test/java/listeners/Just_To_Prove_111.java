package listeners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners_extra.List_imp.class)
public class Just_To_Prove_111 {
	@BeforeSuite
	private void bs() {
		System.out.println("i am @Beforesuite");
	}

	@BeforeTest
	private void precon() {
		System.out.println("pre condition");
	}

	@BeforeClass
	private void opneBro() {
		System.out.println("Opne Browers");
	}

	@BeforeClass
	private void login() {
		System.out.println("login");
	}

	@Test
	private void case11() {
		System.out.println("Test Method");
	}

	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}

	@AfterClass
	private void closeBro() {
		System.out.println("close the brower");
	}

	@AfterTest
	private void postCon() {
		System.out.println("post condition");
	}

	@AfterSuite
	private void as() {
		System.out.println("i am @aftersuite");
	}

}
