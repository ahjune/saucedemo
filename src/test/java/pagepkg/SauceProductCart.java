package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceProductCart {
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement pdt1;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement pdt2;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement pdt3;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement pdt4;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement pdt5;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement pdt6;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkout;

	public SauceProductCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//hover and clicking elements
	public void addtocart() throws InterruptedException {
		
		Thread.sleep(3000);
		pdt1.click();
		pdt2.click();
		pdt3.click();
		pdt4.click();
		pdt5.click();
		pdt6.click();
		cart.click();
		checkout.click();
		
		//Actions act=new Actions(driver);
		//act.moveToElement(pdt1).click().perform();
		//act.moveToElement(pdt2).click().perform();
		//act.moveToElement(pdt3).click().perform();
		//act.moveToElement(pdt4).click().perform();
		//act.moveToElement(pdt5).click().perform();
		//act.moveToElement(pdt6).click().perform();
		//act.moveToElement(cart).click().perform();
	}
	

}
