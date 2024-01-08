package AndroidApiDemo_TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestBase2 {
	AndroidDriver driver;
  @Test
  public void testBase2() throws InterruptedException, MalformedURLException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
		// Set the Platform Name
		capabilities.setCapability("platformName", "Android");
		// Set The Device Name
		capabilities.setCapability("deviceName", "Pixel 6a API 30");
		
		// Set The Automation name
		capabilities.setCapability("automationName", "UiAutomator2");
		// Set The Apk
		capabilities.setCapability("app",
				"C:\\Users\\SVATHULURI\\eclipse-workspace\\Seliniumjava\\Capstone_MobileTesting\\src\\test\\java\\Resourses\\ApiDemos-debug 1.apk");
		// capabilities.setCapability("autoGrantPermissions", "true");
		// Set the UIAutomatior2 URL
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
		Thread.sleep(3000);
  }
}
