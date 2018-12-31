package com.saudhing.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saudhing.base.Page;
import com.saudhing.errorcollectors.ErrorCollector;
import com.saudhing.pages.actions.HomePage;

public class FlightSearchTest {
	
	@BeforeTest
	public void setUp() {
		
		Page.initConfiguration();
		
	}

	@Test
	public void flightSearchTest() {

		HomePage home = new HomePage();
		
		//Assert.assertEquals(home.findTabCount(), 5);
		ErrorCollector.verifyEquals(home.findTabCount(), 7);
		
		home.goToFlights().bookAFlight("Delhi, India (DEL-Indira Gandhi Intl.)",
				"Seattle, WA, United States (SEA-Seattle - Tacoma Intl.)", 
				"29/12/2019", "29/12/2019", "2", "1");

	}
	
	@AfterTest
	public void tearDown() {
		
		Page.quitBrowser();
		
	}

}
