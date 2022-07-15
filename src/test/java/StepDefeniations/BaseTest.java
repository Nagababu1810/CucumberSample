package StepDefeniations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.openqa.selenium.WebDriver;



public class BaseTest {
	public WebDriver driver;
	public static Logger logger;
	public FileInputStream fis;
	public String projectpath=System.getProperty("user.dir");
	
	
	

	public static String RandomEmail() {
		
	String GeneratedString=	RandomStringUtils.randomAlphabetic(5);
	return (GeneratedString);
	}
	
	public static void RandomNumber() {
		
		Random r= new Random(5);
		int RanNum=r.nextInt();
	}
}
