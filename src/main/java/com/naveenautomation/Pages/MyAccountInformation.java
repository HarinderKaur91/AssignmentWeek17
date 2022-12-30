package com.naveenautomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class MyAccountInformation extends TestBase {

	public MyAccountInformation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[name='telephone']")
	WebElement telephone;

	@FindBy(css = "input[value='Continue']")
	WebElement continueBtn;

	public MyAccountPage updateTelephone(String mobile) {
		telephone.sendKeys(mobile);
		continueBtn.submit();
		return new MyAccountPage();
	}

}
