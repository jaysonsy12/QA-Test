package amaysimTest;


import org.openqa.selenium.*;
//import org.openqa.selenium.interactions.Actions;

public class Test3_EditCallForwarding {

	//WebElement confirmBtn;
	WebElement noRadio;
	WebElement commitBtn;
	WebElement yesRadio;
	WebElement forwardTo;
	
	public Test3_EditCallForwarding(WebDriver driver) {
		
	  noRadio = driver.findElement(By.id("my_amaysim2_setting_call_divert_false"));
	  commitBtn = driver.findElement(By.name("commit"));
	  yesRadio = driver.findElement(By.xpath("//*[contains(text(),'Yes')]"));
	  forwardTo = driver.findElement(By.id("my_amaysim2_setting_call_divert_number"));
	  
	}
	

	//Disable Forwarding
	public void CallForwardingNO(WebDriver driver){
	    //confirmBtn.click();
	    
	    JavascriptExecutor executor = (JavascriptExecutor)driver; 
		executor.executeScript("arguments[0].click();", noRadio);
		
	    commitBtn.submit();

	}

    public void CallForwaringYES(String forwardCallTo){
    	//confirmBtn.click();
	    yesRadio.click();
	    forwardTo.clear();
	    forwardTo.sendKeys(forwardCallTo);
	    commitBtn.submit();
    	
    }

}

