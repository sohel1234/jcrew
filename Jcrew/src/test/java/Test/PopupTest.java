

//import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.Popup;

public class PopupTest {
	
	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void PopupSubmitTest(){
		
		driver.get("https://www.jcrew.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Popup pu = new Popup(driver);
		pu.submitclick();
	
		
		
		
	}

}
