package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	
	public WebDriver driver;
	
	public SignIn (WebDriver driver){
		this.driver=driver;
	}
		public void JcrewSignIn(){
			driver.findElement(By.xpath(".//*[@id='sidecarUser']")).sendKeys("su.sohel@gmail.com");
			driver.findElement(By.xpath(".//*[@id='sidecarPassword']")).sendKeys("music1jcrew");
			driver.findElement(By.xpath(".//*[@id='page__signin']/article/section[1]/div/form[2]/button")).click();
		}
			
			
			
		
	}


