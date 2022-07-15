package StepDefeniations;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PomPages.CreateLoginAccount;
import PomPages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestCase  extends BaseTest{
	public WebDriver driver;
	public LoginPage lp;
	public Properties configprop;
	public  CreateLoginAccount cla;
	
	
	
 private static final Logger logger=Logger.getLogger(LoginTestCase.class);
 
 	@Before
 	public void setup() throws IOException 
 	{
 		
 		FileInputStream configprofile= new FileInputStream(".//Config.properties");
 		configprop= new Properties();
 		configprop.load(configprofile);
 		logger.info("Configproperty file readed");
 		
 		
 		fis= new FileInputStream(projectpath+ ".//Log4jConfig.properties");
		PropertyConfigurator.configure(fis);
		logger.info("log4j file reader");
		
		String br=configprop.getProperty("browser");
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", configprop.getProperty("chrompath"));
		driver= new ChromeDriver();
 	}
		else if(br.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", configprop.getProperty("firefoxpath"));
		driver= new FirefoxDriver();
		}
		else if(br.equals("edge")) {
		System.setProperty("webdriver.edge.driver", configprop.getProperty("edgepath"));
		driver= new EdgeDriver();
		}
 	}
 
 	
	
	@Given("user lunch the chrome browser")
	
	public void user_lunch_the_chrome_browser() throws FileNotFoundException {
		logger.info("*********Testcase stated******");
		
		
	}

	@When("user opends url")
	public void user_opends_url() {
	
		logger.info("*********url lunched**********");
		driver.get("http://live.techpanda.org/index.php/mobile.html");
		
	}

	@When("user Enter user name as {string}")
	public void user_enter_user_name_as(String string) throws InterruptedException {
		
	    lp= new LoginPage(driver);
	    lp.Account();
	    lp.Accountlogin();
	    Thread.sleep(3000);
	    lp.Eusername();
	    logger.info("username entered");
	   
	    
		
	}

	@When("user Enter Password as {string}")
	public void user_enter_password_as(String string) throws InterruptedException {
		 lp.Epassword();
		 Thread.sleep(3000);
		logger.info("password entered");
	}

	@When("user clicked login button")
	public void user_clicked_login_button() {
		
		lp.clickbtn();
		logger.info("login button clicked");
		
	}

	@Then("Check the Title of the page")
	public void check_the_title_of_the_page() {
	     String title=driver.getTitle();
	     System.out.println(title);
		
	}

	@And("close the browser")
	public void close_the_browser() {
	    
		driver.quit();
		
		logger.info("********browser close********");
	}

	@Given("user lunch the chromebrowser")
	public void user_lunch_the_chromebrowser() {
		//System.setProperty("webdriver.chrome.driver", ".//Drivers\\chromedriver.exe");
		//driver= new ChromeDriver();
		
		logger.info("*****TC_02*****started");
		
	}

	@When("Enter the url")
	public void enter_the_url() {
	   
		driver.get("http://live.techpanda.org/index.php/mobile.html");
		logger.info("***********url lunched********");
	}

	@When("Click on Account button")
	public void click_on_account_buttons() throws InterruptedException {
		cla= new CreateLoginAccount(driver);
	    cla.Aclick();
	    Thread.sleep(3000);
	    logger.info("****Account btn clicked****");
		
	}

	@When("select the Resgister button")
	public void select_the_resgister_button() {
	   cla.creataccount();
	   logger.info("*******Resgister bun clicked****");
		
	}

	@When("Enter FirstName")
	public void enter_first_name() {
	    cla.Efirstname();
	    logger.info("****Enter first name******");
		
	}

	@When("Eenter LastName")
	public void eenter_last_name() {
	   cla.Elastname();
	   logger.info("*****Enter last name*****");
		
	}

	@Then("Enter EmailAddress")
	public void enter_email_address() {
	   cla.Email();
	   logger.info("*****Enter email add****");
		
	}

	@Then("Enter Password")
	public void enter_password() {
	    cla.Epassword();
	    logger.info("*****Entr pwd******");
	
	}

	@Then("Enter Confirm Password")
	public void enter_confirm_password() {
	   cla.Epwdconfirm();
	   logger.info("***Enter confirm pwd");
		
	}

	@Then("Click on RegisterButton")
	public void click_on_register_button() {
	    
		cla.Register();
		
		logger.info("Enter regisgter******");
		
	}
	
	@Then("Close the browser")
	public void close_the_browserurl() {
	    
		driver.quit();
		logger.info("*********browser close********");
		
	}
	
	
	
}
