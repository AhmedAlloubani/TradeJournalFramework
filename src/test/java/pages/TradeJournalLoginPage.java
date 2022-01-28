package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class TradeJournalLoginPage {
	
	
	
	public TradeJournalLoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	
	
	@FindBy (id = "username")
	public WebElement userNameBox;
	
	@FindBy (id = "password")
	public WebElement passwordBox;
	
	@FindBy (xpath = "//button[text()=‘Sign in’]")
	public WebElement signInBtn;
	
	@FindBy (tagName = "h2")
	public WebElement pageHeader;


}
