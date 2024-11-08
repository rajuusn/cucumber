package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	//Elements
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']") 
	WebElement dropdown;
	
	@FindBy (xpath= "//a[normalize-space()='Logout']")
	WebElement logout;
	
	
	
	public void dropdown() {
	dropdown.click();
	}
	
	public void logout() {
		logout.click();
	}
	
		
	}


