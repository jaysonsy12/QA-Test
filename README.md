# QA-Test

Note: runnable jar is designed to run on Windows 7 or Windows 10

1. Download "amaysimtest.jar"

2. Download "chromedriver_win32.zip" and extract.

3. Create new folder "MyAmaysim" in drive C:\
   *It should look like this :  C:\MyAmaysim\
  
3. Copy "amaysimtest.jar" from download folder and paste to C:\myamaysim\ 
   *It should look like this :  C:\MyAmaysim\amaysimtest.jar

4. Copy "chromedriver.exe" and paste to C:\myamaysim\
   *It should look like this :  C:\MyAmaysim\chromedriver.exe

5. Open command prompt : 
   Click "Windows". Type "cmd" in the "Search programs and files. 

6. Type : java -jar c:\myamaysim\amaysimtest.jar

7. Press "ENTER" 



**********************************************************************************************
Download and extract "MyAmaySim.zip" to see the source code

*source code: C:\MyAmaySim\src\amaysimTest

a. amaysimTest.java --> holds the main method

b. URLClass.java --> declares URL per environment

c. UserLogin.java --> holds the login method

d. MyActions.java --> holds reusable action for "Settings" page

e. Test1_EditSimNickname.java --> Test actions to edit Sim Nickname

d. Test2_RechargePIN.java --> Test action to Edit PIN number

f. Test3_EditCallForwarding.java --> Test actions to Edit Call Forwarding settings
