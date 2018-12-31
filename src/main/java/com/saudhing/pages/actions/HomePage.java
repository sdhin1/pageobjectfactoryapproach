package com.saudhing.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.saudhing.base.Page;
import com.saudhing.pages.locators.HomePageLocators;

public class HomePage extends Page{
	
	
	public HomePageLocators home;
	
	
	public HomePage() {
		
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.home);
		
	}

	public HomePage goToFlights() {
		
		click(home.flightTab);
		return this;

	}

	public void goToHotels() {

	}
	
	public void goToFlightAndHotels() {

	}
	
	public int findTabCount() {
		
		return home.tabCount.size();
		
	}
	
	public void bookAFlight(String from, String to, String departing, String returning,
			String noOfAdults,String noOfChildren) {
		
		type(home.fromCity, from);
		type(home.toCity, to);
		type(home.departFlight, departing);
		type(home.returnFlight, returning);
		type(home.adultCount, noOfAdults);
		type(home.childCount, noOfChildren);
		type(home.firstAge, "4");
		click(home.search);

	}

}
