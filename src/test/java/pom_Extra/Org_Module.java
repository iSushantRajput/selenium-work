package pom_Extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Org_Module {
	//Initialization
	Org_Module(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(css= "img[title='Create Organization...']")
	private WebElement co;
	
	
	//Public Service (getters)
	public WebElement co() {
		return co;
	}
	
	
	
	
	
}
