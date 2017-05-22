package amaysimTest;

import org.openqa.selenium.*;

public class Test1_EditSimNickname {
    
    WebElement simNickName;
    WebElement simSaveBtn;
    

    public Test1_EditSimNickname(WebDriver driver){
		
    	//simEditBtn = driver.findElement(By.id("edit_settings_phone_label"));
    	simNickName = driver.findElement(By.id("my_amaysim2_setting_phone_label"));
        simSaveBtn = driver.findElement(By.name("commit"));
             	
    }
    
	
    //Edit_SIM_Nickname 
    public void EditSimNickName(String newSimName){
 
        //simEditBtn.click();
        simNickName.clear();
        simNickName.sendKeys(newSimName);
        simSaveBtn.submit();
    }
    
}
