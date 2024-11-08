package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	
	//@FindBy(xpath="//span[contains(text(), 'My Account')]") 
	@FindBy(xpath="//input[@name='username']")
	
	WebElement uname;
	
	//@FindBy(xpath="//a[normalize-space()='Register']") 
	@FindBy(xpath="//input[@name='password']")
	WebElement pswd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn;
	
	public void username(String name) {
	uname.clear();
	uname.sendKeys(name);
	}
	
	public void password(String psw) {
		pswd.clear();
		pswd.sendKeys(psw);
	}
	
	public void clickButton() {
		btn.click();
	}
	
	
}
