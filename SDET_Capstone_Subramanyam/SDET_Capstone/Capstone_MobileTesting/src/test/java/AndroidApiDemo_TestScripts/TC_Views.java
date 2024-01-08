package AndroidApiDemo_TestScripts;

import org.testng.annotations.Test;

import AndroidApiDemo_Pages.TP_ViewsPage;

public class TC_Views extends TestBase{
  @Test
  public void f() throws InterruptedException {
	  
	  TP_ViewsPage views = new TP_ViewsPage(driver);
	  
	  views.getViews().click();
	  Thread.sleep(2000);
	  views.getViews1().click();
	  Thread.sleep(2000);
	  views.getInterpolators().click();
	  Thread.sleep(2000);
	  views.getspinner().click();
	  Thread.sleep(2000);
	  
	 
	  
	  
  }
}
