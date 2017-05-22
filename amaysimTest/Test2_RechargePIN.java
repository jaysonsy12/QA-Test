package amaysimTest;

import org.openqa.selenium.*;

public class Test2_RechargePIN {

	//WebElement pinEditBtn;  
	  WebElement pinNumber; 
      WebElement pinSaveBtn;


	  public Test2_RechargePIN(WebDriver driver){
			  	     
	      //pinEditBtn = driver.findElement(By.id("edit_settings_phone_label"));
	        pinNumber = driver.findElement(By.id("my_amaysim2_setting_topup_pw")); 
	        pinSaveBtn = driver.findElement(By.name("commit"));
	    	
	    }
	    
		
	  //Edit_recharge_PIN
	  public void EditPIN(String newPIN){
	        
	    	//pinEditBtn.click();    
	        pinNumber.clear();
	        pinNumber.sendKeys(newPIN);
	        pinSaveBtn.submit();
	  }
	  
}
