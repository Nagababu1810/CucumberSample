package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;

	@FindBy(xpath="//a[@class='skip-link skip-account']") public WebElement Acclink;
	@FindBy(xpath="//a[text()='Log In']") public WebElement Acclogin;
	@FindBy(xpath="//input[@id='email']") public WebElement username;
	@FindBy(xpath="//input[@id='pass']") public WebElement password;
	@FindBy(xpath="//button[@id='send2']") public WebElement clkbtn;
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	public void Account() {
		
		Acclink.click();
		
	}
	
	public void Accountlogin() {
		
		Acclogin.click();
	}
	
	public void Eusername() {
	
	username.sendKeys("testdemo@gmail.com");
	}

	public void Epassword() {
	
		password.sendKeys("123456");
	
}

	public void clickbtn() {
	
	clkbtn.click();
	}

	
	
}
