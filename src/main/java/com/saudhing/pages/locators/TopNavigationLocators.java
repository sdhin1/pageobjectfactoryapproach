package com.saudhing.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
	
	@FindBy(id="header-account-menu")
	public WebElement account;
	@FindBy(id="account-signin")
	public WebElement signinBtn;

}
