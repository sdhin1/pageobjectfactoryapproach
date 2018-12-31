package com.saudhing.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(id="tab-flight-tab-hp")
	public WebElement flightTab;
	
	//locators for flight booking
	@FindBy(id="flight-origin-hp-flight")
	public WebElement fromCity;
	@FindBy(id="flight-destination-hp-flight")
	public WebElement toCity;
	@FindBy(id="flight-departing-hp-flight")
	public WebElement departFlight;
	@FindBy(id="flight-returning-hp-flight")
	public WebElement returnFlight;
	@FindBy(id="flight-adults-hp-flight")
	public WebElement adultCount;
	@FindBy(id="flight-children-hp-flight")
	public WebElement childCount;
	@FindBy(id="flight-age-select-1-hp-flight")
	public WebElement firstAge;
	@FindBy(xpath="//button[@class='btn-primary btn-action gcw-submit']")
	public WebElement search;
	
	@FindBy(xpath="//ul[@class='tabs cf col']/li")
	public List<WebElement> tabCount;
	
	

}
