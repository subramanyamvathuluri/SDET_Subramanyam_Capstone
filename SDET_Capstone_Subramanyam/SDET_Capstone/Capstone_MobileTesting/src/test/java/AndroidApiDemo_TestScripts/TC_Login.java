package AndroidApiDemo_TestScripts;
import org.testng.annotations.Test;

import AndroidApiDemo_Pages.tp_login;


public class TC_Login extends TestBase {
  @Test
  public void f() throws InterruptedException {
	  
//	  TC_Login obj1=new TC_Login(driver); 
//	  tp_login obj1=new tp_login(driver);
	  obj1.clickContent().click();
	  Thread.sleep(5000);
	  
//	  login.clickcontent().click();
	  Thread.sleep(1000);
	  obj1.clickProvider().click();
	  Thread.sleep(1000);
	  obj1.clickPickContact().click();
	  Thread.sleep(1000);
	  obj1.clickcontact().click();
	  Thread.sleep(1000);
	  obj1.clickdocument().click();
	  Thread.sleep(1000);
	  
	  
	  
  }
}
