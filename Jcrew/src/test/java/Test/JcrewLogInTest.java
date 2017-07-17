package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Popup;

public class JcrewLogInTest {

	WebDriver driver = new FirefoxDriver();
		@Test
		public void LogInTest(){
	
		driver.get("https://www.jcrew.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Popup pu = new Popup (driver);
	
		Homepage hp = new Homepage (driver);
		pu.submitclick();
		hp.JcrewLogIn();
		driver.close();

		
		}}