package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement Srchlocation;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement Srchhotel;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement noofrooms;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkindate;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkoutdate;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adultsinroom;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childinroom;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement searchbutton;
	
	public SearchHotel(WebDriver ldriver) {
	    this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getSrchlocation() {
		return Srchlocation;
	}

	public WebElement getSrchhotel() {
		return Srchhotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultsinroom() {
		return adultsinroom;
	}

	public WebElement getChildinroom() {
		return childinroom;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

}
