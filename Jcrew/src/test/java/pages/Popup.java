package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Popup {

	public WebDriver driver;
	 
	  public Popup (WebDriver driver){
		  this.driver=driver;
		  
	  }
		  public  Homepage submitclick(){
		  driver.findElement(By.xpath(".//*[@id='global__email-capture']/section/div[3]/span")).click();
		  return new  Homepage(driver);
		  
}
}