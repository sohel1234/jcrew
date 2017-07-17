package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	public WebDriver driver;
	 
	  public Homepage (WebDriver driver){
		  this.driver=driver;
	  }
    public SignIn JcrewLogIn(){
    	
    	driver.findElement(By.xpath(".//*[@id='c-header__userpanel']/a/span[2]")).click();
    	return new SignIn(driver);
    }
}
