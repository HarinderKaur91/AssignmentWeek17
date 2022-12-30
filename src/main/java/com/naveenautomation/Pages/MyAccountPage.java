package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content h2:first-of-type")
	WebElement myAccountText;
	
	@FindBy(css = "div.list-group a:nth-of-type(2)")
	WebElement editAccountLink;
	
	@FindBy(css = "div.list-group a:last-of-type")
	WebElement logOutLink;
	
	@FindBy(css = "#content ul:last-of-type a")
	WebElement subscribeUnsubscribeLink;
	
	@FindBy(css = "div.alert-success")
	WebElement telephoneChangeSuccessBanner;
	
	@FindBy(css = "div.alert-success")
	WebElement subscribeAlertSuccessBanner;
	

	public String getMyAccountText() {
		return myAccountText.getText();
	}

	public MyAccountInformation clickEditAccount() {
		editAccountLink.click();
		return new MyAccountInformation();
	}
	
	public NewsletterSubscriptionPage clicksubscribeUnsubscribeLink() {
		subscribeUnsubscribeLink.click();
		return new NewsletterSubscriptionPage();
	}
	
	public AccounLogoutPage clickLogOutLink() {
		logOutLink.click();
		return new AccounLogoutPage();
	}
	
	public String getTelephoneChangeSuccessMessage() {
		return telephoneChangeSuccessBanner.getText();
	}
	public String getsubscribeAlertSuccessMessage() {
		return subscribeAlertSuccessBanner.getText();
	}
	
}
