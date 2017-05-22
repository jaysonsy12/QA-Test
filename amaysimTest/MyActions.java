package amaysimTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;

public class MyActions extends amaysimTest {

	//WebElement settingsBtn;
	//WebElement editSimName;
	//WebElement editPIN;
	//WebElement editBtnCF;
	
	//public MyActions(WebDriver driver){}
	
	
	//Maximize Window
	public void maximizeWindow() {
        
		driver.manage().window().maximize();
	}

	
	//Close Activate SIM dialog box
	public void closeActivateSIM(){
		
		driver.findElement(By.xpath(".//*[@id='welcome_popup']/a")).click();
	}
	
	
	//Click Settings
	public void openSettings() {
		
		WebElement settingsBtn = driver.findElement(By.xpath(".//*[contains(text(),'Settings')]"));
		settingsBtn.click();
	}
	 
	
	//Click Edit button of SIM Nickname
	public void clickEditSimName(){
		WebElement editSimName = driver.findElement(By.id("edit_settings_phone_label"));
		editSimName.click();
		
	}

	
	//Click Edit button of RechargePIN
	public void clickEditRechargePIN(){
		
		WebElement editPIN = driver.findElement(By.id("edit_settings_recharge_pin"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("arguments[0].click();", editPIN);
	
	}

	
	//Click Edit button of Call Forwarding
	public void clickEditCallForward(){
	    
		WebElement editBtnCF = driver.findElement(By.id("edit_settings_call_forwarding"));
	    
		JavascriptExecutor executor = (JavascriptExecutor)driver; 
	    executor.executeScript("arguments[0].scrollIntoView(true);", editBtnCF);
	    executor.executeScript("arguments[0].click();", editBtnCF);
	
	}

	
	//Click confirm message box
	public void clickConfirm(){
		
		WebElement confirm = driver.findElement(By.xpath("//*[@class='confirm_popup_confirm button-green-action small-12 columns text-center']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("arguments[0].click();", confirm);

	}

	
	//Close success message box
	public void closeSuccess(){
		
		WebElement close = driver.findElement(By.xpath("//*[@class='close-reveal-modal']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("arguments[0].click();", close);
		
	}
	
	
	
	//quit
	public void quit(){
		
		driver.quit();
	}
}
