package com.saudhing.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saudhing.base.Page;

public class SigninTest {
	
	@BeforeTest
	public void setUp() {
		
		Page.initConfiguration();
		
	}
	
	@Test
	public void signInTest() {
		
		Page.topNav.gotoSignIn().doLogin("abcd@gmail.com", "123456");
		
	}
	
	@AfterTest
	public void tearDown() {
		
		Page.quitBrowser();
		
	}

}
