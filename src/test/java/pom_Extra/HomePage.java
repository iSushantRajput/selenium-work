package pom_Extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Initialization
	HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(linkText="Organizations")
	private WebElement org;
	
	
	//Public Service (getters)
	public WebElement org() {
		return org;
	}
}
