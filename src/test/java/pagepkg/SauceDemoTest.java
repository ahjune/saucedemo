package pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoTest {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement usrname;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement passwd;
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement login;
	
	//constructor
	public SauceDemoTest(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//values/naming
	public void setValues(String standard_user,String secret_sauce) {
		usrname.sendKeys(standard_user);
		passwd.sendKeys(secret_sauce);
	}
	//login button click
	public void loginclick() {
		login.click();
	}
	
	

	
	
	
	
	  

	

}
