package pom_Extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Org_Info {
	//Initialization
	Org_Info(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
	// DECLARATION ORGANIZATION NEW-NAME
	@FindBy(name="accountname")
	private WebElement ac;
	
	// DECLARATION ON WEBSITE
	@FindBy(css= "input[name='website']")
	private WebElement ws;
	
	// DECLARATION ON TICKER SYMBOL
	@FindBy(css="input[name='tickersymbol']")
	private WebElement ts;
	
	//DECLARATION ON EMPLOYEES
	@FindBy(css="input[name='employees']")
	private WebElement e;
	
	// DECLARATION ON OTHER EMAIL
	@FindBy(css="input[name='email2']")
	private WebElement em;
	
	// DECLARATION ON PHONE
	@FindBy(css="input[name='phone']")
	private WebElement p;
	
	// DECLARATION ON FAX
	@FindBy(css="input[name='fax']")
	private WebElement f;
	
	// DECLARATION ON OTHER PHONE
	@FindBy(css="input[name='otherphone']")
	private WebElement ot;
	
	// DECLARATION ON EMAIL
	@FindBy(css="input[name='email1']")
	private WebElement em1;
	
	//DECLARATION ON OWNERSHIP
	@FindBy(css="input[name='ownership']")
	private WebElement os;
	
	// DECLARATION ON SIC CODE
	@FindBy(css="input[name='siccode']")
	private WebElement sc;
	
	// DECLARATION ON ANNUAL REVENUE
	@FindBy(css="input[name='annual_revenue']")
	private WebElement ar;
	
	// DECLARATION ON BILLING ADDRESS
	@FindBy(css="textarea[name='bill_street']")
	private WebElement bs;
	
	// DECLARATION ON ASSIGNED TO
	@FindBy(name="assigntype")
	private WebElement at;
	
	// DECLARATION ON SAVE BUTTON
	@FindBy(css="input[value='  Save  ']")
	private WebElement save;
	
	
	// PUBLIC SERVICE (getters)- ORGANIZATION NEW-NAME 
	public WebElement ac() {
		return ac;
	}
	
	// PUBLIC SERVICE (getters)- ON WEBSITE
	public WebElement ws() {
		return ws;
	}
	
	// PUBLIC SERVICE (getters)- TICKER SYMBOL
	public WebElement ts() {
		return ts;
	}
	
	// PUBLIC SERVICE (getters)- ON EMAIL
	public WebElement e() {
		return e;
	}
	
	// PUBLIC SERVICE (getters)- ON OWNERSHIP
	public WebElement em() {
		return em;
	}
	
	// PUBLIC SERVICE (getters)- ON PHONE
	public WebElement p() {
		return p;
	}
	
	// PUBLIC SERVICE (getters)- ON FAX
	public WebElement f() {
		return f;
	}
	
	// PUBLIC SERVICE (getters)- ON OTHER PHONE
	public WebElement ot() {
		return ot;
	}
	
	// PUBLIC SERVICE (getters)- ON EMAIL
	public WebElement em1() {
		return em1;
	}
	
	//PUBLIC SERVICE (getters)- ON OWNERSHIP
	public WebElement os() {
		return os;
	}
	
	// PUBLIC SERVICE (getters)- ON SIC CODE
	public WebElement sc() {
		return sc;
	}
	
	// PUBLIC SERVICE (getters)- ON ANNUAL REVENUE
	public WebElement ar() {
		return ar;
	}
	
	// PUBLIC SERVICE (getters)- ON BILLING ADDRESS
	public WebElement bs() {
		return bs;
	}
	
	// PUBLIC SERVICE (getters)- ASSIGNED TO
	public WebElement at() {
		return at;
	}
	
	// PUBLIC SERVICE (getters)- ON SAVE BUTTON
	public WebElement save() {
		return save;
	}
	
	
	
	
	
	
}
