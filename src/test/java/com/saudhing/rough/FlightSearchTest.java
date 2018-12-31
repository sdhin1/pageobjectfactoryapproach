package com.saudhing.rough;

import org.testng.Assert;

import com.saudhing.base.Page;
import com.saudhing.errorcollectors.ErrorCollector;
import com.saudhing.pages.actions.HomePage;

public class FlightSearchTest {

	public static void main(String[] args) {

		Page.initConfiguration();

		HomePage home = new HomePage();
		
		//Assert.assertEquals(home.findTabCount(), "5");
		ErrorCollector.verifyEquals(home.findTabCount(), 5);
		
		home.goToFlights().bookAFlight("Delhi, India (DEL-Indira Gandhi Intl.)",
				"Seattle, WA, United States (SEA-Seattle - Tacoma Intl.)", 
				"29/12/2018", "29/12/2018", "2", "1");

		Page.quitBrowser();

	}

}
