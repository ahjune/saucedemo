package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceName {
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement fn;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement ln;
	
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement pin;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuebtn;
	
	@FindBy(xpath="//*[@id=\"finish\"]")
	WebElement finishbtn;
	
	@FindBy(xpath="//*[@id=\"back-to-products\"]")
	WebElement backhome;
	
	public SauceName(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void namepass() throws InterruptedException {
		
		Thread.sleep(3000);
		fn.sendKeys("alfredo");
		ln.sendKeys("aldo");
		pin.sendKeys("687427");
		continuebtn.click();
		finishbtn.click();
		backhome.click();
		
	}

}
