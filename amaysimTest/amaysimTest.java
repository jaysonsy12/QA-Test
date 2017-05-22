package amaysimTest;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class amaysimTest {

  public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
      //Initialize_chrome_driver
		System.setProperty("webdriver.chrome.driver","C:\\MyAmaySim\\chromedriver.exe");
		 
		//Disable "Save Password" 
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--start-maximized");
	    options.addArguments("--disable-web-security");
	    options.addArguments("--no-proxy-server");
	    Map<String, Object> prefs = new HashMap<String, Object>();
	    prefs.put("credentials_enable_service", false);
	    prefs.put("profile.password_manager_enabled", false);
	    options.setExperimentalOption("prefs", prefs);
	    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	    			      
	    driver =new ChromeDriver(capabilities);
				    
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	    
        //This will get URL from URLClass
		URLClass url = new URLClass();
		
	    String vURL=url.GetURL("test");//--->>CHANGE VALUE
		                               // launchApp("test") => opens app in test environment
		                               // launchApp("prod") => opens app in prod environment
		                               // launchApp("lower") => opens app in lower environment  
	
	    //This will launch login page    
	    driver.get(vURL);
	
	    
	    //Maximize browser
		MyActions use = new MyActions();
		use.maximizeWindow();
		Thread.sleep(2000);
		
	
	    //This will login to the application
	    UserLogin ul = new UserLogin(driver);	
	    ul.Userlogin("0468827174", "theHoff34");
		
		
	    //Close_activate_sim;
	    use.closeActivateSIM();
	    Thread.sleep(2000);
	
		
		//Open_manage_settings     
		use.openSettings();
		Thread.sleep(2000);
        
	
		//Click SimNickName Edit button 
		use.clickEditSimName();
		Thread.sleep(2000);
		
		
	//Test_Edit_SIM_Nickname
		Test1_EditSimNickname Test1 =new Test1_EditSimNickname(driver);
		Test1.EditSimNickName("Test 005");
		System.out.println("TC_001 : Edit SIM Nickname : PASSED");
		  //Thread.sleep(2000);
	    
	
		//Click recharge PIN Edit button		
		use.clickEditRechargePIN();
		Thread.sleep(2000);
        
		
	//Test_Edit_Recharge_PIN
		Test2_RechargePIN Test2 =new Test2_RechargePIN(driver);
		Test2.EditPIN("3167");
		System.out.println("TC_002 : Edit Recharge PIN : PASSED");
		  //Thread.sleep(1000);
		
		
		//Click Edit button Call Forwarding
		use.clickEditCallForward();
		
		  //Thread.sleep(1000);


	    //Click confirm
		use.clickConfirm();
		
		
	//Test- Disable Call Forwarding
		Test3_EditCallForwarding Test3_01 = new Test3_EditCallForwarding(driver);
		Test3_01.CallForwardingNO(driver);
		System.out.println("TC_003 : Disabling Call Forwarding : PASSED");
		  //Thread.sleep(1000);
		
		
		//Click success message box
		use.closeSuccess();
		
		
		//Click Edit button Call Forwarding		
		use.clickEditCallForward();
		Thread.sleep(500);
		
		
        //Click Confirm button
		use.clickConfirm();

	    
	//Test- Enable Call Forwarding		
	    Test3_EditCallForwarding Test3_02 = new Test3_EditCallForwarding(driver);
	    Test3_02.CallForwaringYES("02 1234 5678");
	    System.out.println("TC_004 : Enabling Call Forward : PASSED");
	    Thread.sleep(1000);
	    
	    //Click success message box
	    use.closeSuccess();
	 
	   
	    //Close browser	
	    use.quit();
		
	}
	       	
}
	

