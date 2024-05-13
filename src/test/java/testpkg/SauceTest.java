package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.SauceDemoTest;
import pagepkg.SauceLogout;
import pagepkg.SauceName;
import pagepkg.SauceProductCart;

public class SauceTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void logintest() {
		SauceDemoTest ob=new SauceDemoTest(driver);
		ob.setValues("standard_user","secret_sauce");
		ob.loginclick();
	}
	
	@Test (priority = 2)
	public void hoverclick() throws InterruptedException {
		SauceProductCart ob1=new SauceProductCart(driver);
		ob1.addtocart();
	}
	
	@Test (priority = 3)
	public void details () throws InterruptedException {
		SauceName ob2=new SauceName(driver);
		ob2.namepass();
	}
	
	@Test (priority = 4)
	public void last() throws InterruptedException {
		SauceLogout ob3=new SauceLogout(driver);
		ob3.sout();	
		}
	}
