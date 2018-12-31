package com.saudhing.rough;

import com.saudhing.base.Page;

public class SigninTest {
	
	public static void main(String[] args) {
		
		Page.initConfiguration();
		
		Page.topNav.gotoSignIn().doLogin("abcd@gmail.com", "123456");
		
		Page.quitBrowser();		
		
	}

}
