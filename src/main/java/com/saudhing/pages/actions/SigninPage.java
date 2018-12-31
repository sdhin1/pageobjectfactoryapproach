package com.saudhing.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.saudhing.base.Page;
import com.saudhing.pages.locators.SigninPageLocators;

public class SigninPage extends Page {

	public SigninPageLocators signinPage;

	public SigninPage() {

		this.signinPage = new SigninPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.signinPage);

	}

	public void doLogin(String username, String password) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		type(signinPage.email, username);
		type(signinPage.password, password);
		click(signinPage.submit);
		
	}

}
