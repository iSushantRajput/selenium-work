package pom_Extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page {
	//Initialization
	LogIn_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	//USERNAME 
	@FindBy(name="user_name")
	private WebElement un;
	
	//PASSWORD
	@FindBy( name="user_password")
	private WebElement up;
	
	// CLICK ON LOGIN BUTTON
	@FindBy(id="submitButton")
	private WebElement login;
	
	
	//Public Service (getters)
	public WebElement getun() {
		return un;
	}
	
	public WebElement getup() {
		return up;
	}
	
	public WebElement getlogin() {
		return login;
	}











}
