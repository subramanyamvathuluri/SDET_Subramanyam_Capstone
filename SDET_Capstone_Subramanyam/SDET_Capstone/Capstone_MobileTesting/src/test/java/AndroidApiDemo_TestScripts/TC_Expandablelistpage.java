package AndroidApiDemo_TestScripts;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import AndroidApiDemo_Pages.TP_ExpandableLists;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TC_Expandablelistpage extends TestBase {
  @Test
  public void f() throws InterruptedException {
	  
	  TP_ExpandableLists expand = new TP_ExpandableLists(driver);
	  
	  expand.getViews().click();
	  Thread.sleep(2000);
	  expand.getexpandable().click();
	  Thread.sleep(2000);
	  expand.getcustomadaptor().click();
	  Thread.sleep(2000);
	  WebElement longClickElement=expand.getpeoplename();
	  ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) longClickElement).getId(), "duration", 3000));
	  Thread.sleep(5000);
	  
	  driver.pressKey(new KeyEvent(AndroidKey.BACK));
	  driver.pressKey(new KeyEvent(AndroidKey.BACK));
	  Thread.sleep(2000);
	  
	  expand.getcursor().click();
	  Thread.sleep(2000);
	  driver.pressKey(new KeyEvent(AndroidKey.BACK));
	  
	  expand.getadapter().click();
	  Thread.sleep(2000);
	  expand.getgroup().click();
	  Thread.sleep(2000);
	  expand.getchild().click();
	  Thread.sleep(2000);
	  
	  
	  
	  driver.pressKey(new KeyEvent(AndroidKey.BACK));
	  
	  
	  
	  
	  
  }
}
