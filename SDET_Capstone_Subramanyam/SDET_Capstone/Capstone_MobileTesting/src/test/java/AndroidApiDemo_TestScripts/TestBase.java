package AndroidApiDemo_TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import AndroidApiDemo_Pages.TP_AppPage;
import AndroidApiDemo_Pages.TP_ExpandableLists;
import AndroidApiDemo_Pages.TP_ViewsPage;
import AndroidApiDemo_Pages.tp_login;
import io.appium.java_client.android.AndroidDriver;


public class TestBase {
 
  
  public AndroidDriver driver;
  
   tp_login obj1;
   TP_ViewsPage views;
   TP_AppPage app;
   TP_ExpandableLists expand;


@BeforeClass
public void capability() throws MalformedURLException, InterruptedException {

  


		DesiredCapabilities capabilities = new DesiredCapabilities();
		// Set the Platform Name
		capabilities.setCapability("platformName", "Android");
		// Set The Device Name
		capabilities.setCapability("deviceName", "Pixel 7 Pro API 31");
		
		// Set The Automation name
		capabilities.setCapability("automationName", "UiAutomator2");
		// Set The Apk
		capabilities.setCapability("app",
				"C:\\Users\\SVATHULURI\\eclipse-workspace\\Seliniumjava\\Capstone_MobileTesting\\src\\test\\java\\Resourses\\ApiDemos-debug 1.apk");
		// capabilities.setCapability("autoGrantPermissions", "true");
		// Set the UIAutomatior2 URL
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
		Thread.sleep(3000);
	   // driver.findElement(By.id("android:id/text1")).click();
		
		
		obj1 = new tp_login(driver);
		views= new TP_ViewsPage(driver);
		app = new TP_AppPage(driver);
		expand = new TP_ExpandableLists(driver);
		
		
	}
  




@AfterClass
public void tearDown() {
	driver.quit();
}


}
