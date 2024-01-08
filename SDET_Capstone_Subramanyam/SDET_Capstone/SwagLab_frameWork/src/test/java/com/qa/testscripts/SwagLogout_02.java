package com.qa.testscripts;

import org.testng.annotations.Test;

public class SwagLogout_02 extends SwagLogin_01  {
  @Test
  public void f() throws InterruptedException {
	  

	    logout1.clickmorebutton();
	  /*  WebElement strn = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
	    Boolean TF= strn.getText().equalsIgnoreCase("Checkout: Overview"); 
	    if(TF) {
	    	System.out.println("Everything is on right path");
	    }else {
	    	System.out.println("Not in a correct path");
	    }
	    */
	    Thread.sleep(2000);
	    logout1.clicklogoutbutton2();
	


}

  }

