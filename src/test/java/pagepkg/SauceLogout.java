package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLogout {
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement hamburger;
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;

	
	
	public SauceLogout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sout() throws InterruptedException {
		
		hamburger.click();
		Thread.sleep(3000);
		logout.click();
	}
}