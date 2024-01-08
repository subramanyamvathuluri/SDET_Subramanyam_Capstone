package AndroidApiDemo_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import AndroidApiDemo_TestScripts.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TP_AppPage extends TestBase{
	
	AndroidDriver driver;

	public TP_AppPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	@AndroidFindBy(accessibility = "App")
	WebElement app;
	public WebElement getapp() {
		return app;
	}
	
	@AndroidFindBy(accessibility = "Activity")
	WebElement Activity;
	public WebElement getActivity() {
		return Activity;
	}
	
	@AndroidFindBy(accessibility = "Custom Title")
	WebElement CustomTitle;
	public WebElement getCustomTitle() {
		return CustomTitle;
	}
	
	@AndroidFindBy(id = "io.appium.android.apis:id/left_text_edit")
	WebElement left;
	public WebElement getleft() {
		return left;
	}
	
	@AndroidFindBy(id = "io.appium.android.apis:id/left_text_edit")
	WebElement left1;
	public WebElement setleft1() {
		return left1;
	}
	
	@AndroidFindBy(accessibility  = "Change Left")
	WebElement ChangeLeft;
	public WebElement getChangeLeft() {
		return ChangeLeft;
	}
	
	@AndroidFindBy(id = "io.appium.android.apis:id/right_text_edit")
	WebElement right;
	public WebElement getright() {
		return right;
	}
	
	@AndroidFindBy(id = "io.appium.android.apis:id/right_text_edit")
	WebElement right1;
	public WebElement setright1() {
		return right1;
	}
	
	@AndroidFindBy(accessibility  = "Change Right")
	WebElement ChangeRight;
	public WebElement getChangeRight() {
		return ChangeRight;
	}

}
