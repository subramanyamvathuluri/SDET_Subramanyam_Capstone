package AndroidApiDemo_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import AndroidApiDemo_TestScripts.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TP_ViewsPage extends TestBase {
	
	AndroidDriver driver;

	public TP_ViewsPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	@AndroidFindBy(accessibility = "Views")
	WebElement Views;
	public WebElement getViews() {
		return Views;
	}
	
//	@AndroidFindBy(accessibility = "Animation")
//	WebElement Views1;
//	public WebElement getViews1() {
//		return Views1();
//	}
	
	@AndroidFindBy(accessibility = "Animation")
	WebElement Views1;
	public WebElement getViews1() {
		return Views1;
	}
	
	
	@AndroidFindBy(accessibility = "Interpolators")
	WebElement Interpolators;
	public WebElement getInterpolators() {
		return Interpolators;
	}
	
	@AndroidFindBy(id  = "io.appium.android.apis:id/spinner")
	WebElement spinner;
	public WebElement getspinner() {
		return spinner;
	}

}
