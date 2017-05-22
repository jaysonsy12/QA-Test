package amaysimTest;

public class URLClass{
   
	//Declare environment URL here
	String testURL = "https://accounts.amaysim.com.au/identity/login";
    String prodURL = "prod URL";
    String lowerURL = "lower environment URL";
 
   	public String GetURL(String environment) {
				
		String newURL ="";
	    
		if (environment == "test"){	
			
			newURL = testURL;
	        
		}else if(environment == "prod"){
			
			newURL = prodURL;
		    
	    }else if(environment== "lower"){
	    	
	    	newURL = lowerURL;
		    
		}
		return newURL;
	
	}
	
}
 