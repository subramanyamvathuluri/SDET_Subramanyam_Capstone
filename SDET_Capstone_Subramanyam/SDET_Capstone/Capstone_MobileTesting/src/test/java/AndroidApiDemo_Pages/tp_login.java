package AndroidApiDemo_Pages;

import org.apache.commons.beanutils.WrapDynaBean;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import AndroidApiDemo_TestScripts.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class tp_login extends TestBase {
	AndroidDriver driver;

	public tp_login(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	@AndroidFindBy(accessibility = "Accessibility")
	WebElement AccessElement;
	
	public WebElement getAccessElement() {
		return AccessElement;
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Content\"]")
	WebElement content;

	public WebElement clickContent() {
//    	apilogin.click();
		return content;
	}

	@AndroidFindBy(accessibility = "Provider")
	WebElement Provider;

	public WebElement clickProvider() {
		return Provider;
	}

	@AndroidFindBy(accessibility = "Pick Contact")
	WebElement PickContact;

	public WebElement clickPickContact() {
		return PickContact;
	}

	@AndroidFindBy(accessibility = "Pick a Contact")
	WebElement contact;

	public WebElement clickcontact() {
		return contact;
	}

	@AndroidFindBy(xpath = "//android.widget.ImageView[@package= \\\"com.google.android.documentsui\\\"]")
	WebElement document;

	public WebElement clickdocument() {
		return document;
	}

}
