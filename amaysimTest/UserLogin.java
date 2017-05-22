package amaysimTest;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;


public class UserLogin {
    
	WebElement userN;
	WebElement passW;
	WebElement loginBtn;
	
	public UserLogin(WebDriver driver){
		
		userN = driver.findElement(By.id("username"));
		passW = driver.findElement(By.id("password"));
		loginBtn = driver.findElement(By.xpath("//*[@value='login']"));
	}
	
	
	public void Userlogin(String username,String password) {
		  
        //Login_to_App    
        userN.sendKeys(username);
        passW.sendKeys(password);
        loginBtn.submit(); 
	  		
	}

}
