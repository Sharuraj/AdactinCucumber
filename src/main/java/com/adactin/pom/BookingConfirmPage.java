package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement myitinerary;
	
	public BookingConfirmPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyitinerary() {
		return myitinerary;
	}
	
}
