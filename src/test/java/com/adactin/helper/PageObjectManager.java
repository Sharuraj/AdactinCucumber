package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotelPage;
import com.adactin.pom.BookedItineraryPage;
import com.adactin.pom.BookingConfirmPage;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
	public static WebDriver driver;

	private HomePage hp;
	private SearchHotel srh;
	private SelectHotel slh;
	private BookHotelPage bh;
	private BookingConfirmPage bc;
	private BookedItineraryPage bi;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	// here we have declared the object but not assigned the value for it thats
	//y null pointer exception
	
	public HomePage getHp() {
		hp = new HomePage(driver);
		return hp;
	}

	public SearchHotel getSrh() {
		srh = new SearchHotel(driver);
		return srh;
	}

	public SelectHotel getSlh() {
		slh = new SelectHotel(driver);
		return slh;
	}

	public BookHotelPage getBh() {
		bh = new BookHotelPage(driver);
		return bh;
	}

	public BookingConfirmPage getBc() {
		bc = new BookingConfirmPage(driver);
		return bc;
	}

	public BookedItineraryPage getBi() {
		bi = new BookedItineraryPage(driver);
		return bi;
	}

}
