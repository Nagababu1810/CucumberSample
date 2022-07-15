package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefeniations.BaseTest;

public class CreateLoginAccount extends BaseTest {
	
public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='skip-link skip-account']") public WebElement clickacct;
	//@FindBy(xpath="//a[text()='My Account']") public WebElement clickacct1;
	@FindBy(xpath="//a[text()='Register']") public WebElement createaccount;
	@FindBy(xpath="//input[@id='firstname']") public WebElement Efirstname;
	@FindBy(xpath="//input[@id='lastname']") public WebElement Elastname;
	@FindBy(xpath="//input[@id='email_address']") public WebElement Eemail;
	@FindBy(xpath="//input[@id='password']") public WebElement Epwd;
	@FindBy(xpath="//input[@id='confirmation']") public WebElement Econfirm;
	@FindBy(xpath="//button[@title='Register']") public WebElement Cregister;

	
	public CreateLoginAccount(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void Aclick() {
		
		clickacct.click();
	}
	

	public void creataccount()
	{
		
		createaccount.click();
	}
	
	public void Efirstname() {
		Efirstname.sendKeys("test");
	}
	
	public void Elastname() {
		
		Elastname.sendKeys("demo");
	}
	
	public void Email() {
		
		Eemail.sendKeys(RandomEmail()+"@gmail.com");
		
	}
	
	public void Epassword() {
		
		Epwd.sendKeys("123456");
	}
	
	public void Epwdconfirm() {
		
		Econfirm.sendKeys("123456");
	}
	public void Register() {
		
		Cregister.click();
	}
}
