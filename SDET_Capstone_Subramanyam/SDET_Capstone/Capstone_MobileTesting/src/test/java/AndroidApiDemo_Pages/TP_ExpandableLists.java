package AndroidApiDemo_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TP_ExpandableLists {
	
	AndroidDriver driver;

	public TP_ExpandableLists(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	@AndroidFindBy(accessibility = "Views")
	WebElement Views;
	public WebElement getViews() {
		return Views;
	}
	
	@AndroidFindBy(accessibility = "Expandable Lists")
	WebElement expandble;
	public WebElement getexpandable() {
		return expandble;
	}
	
	@AndroidFindBy(accessibility = "1. Custom Adapter")
	WebElement customadaptor;
	public WebElement getcustomadaptor() {
		return customadaptor;
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='People Names']")
	WebElement peoplename;
	public WebElement getpeoplename() {
		return peoplename;
	}
	
	@AndroidFindBy(xpath   = "(//android.widget.TextView)[2]")
	WebElement cursor;
	public WebElement getcursor() {
		return cursor;
	}
	
	@AndroidFindBy(xpath= "(//android.widget.TextView)[3]")
	WebElement adapter;
	public WebElement getadapter() {
		return adapter;
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView)[2]")
	WebElement group;
	public WebElement getgroup() {
		return group;
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView)[9]")
	WebElement child;
	public WebElement getchild() {
		return child;
	}
	
	
	
}

