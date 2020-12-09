package com.adactin.stepdefinition;

import java.io.IOException;


import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookHotelPage;
import com.adactin.pom.BookedItineraryPage;
import com.adactin.pom.BookingConfirmPage;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.TestRunner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {
	
	public static WebDriver driver=TestRunner.driver;
	PageObjectManager pom=new PageObjectManager(driver);

	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
	   //driver = getBrowser("Chrome");
	   //getUrl("http://adactinhotelapp.com/index.php");
		String url = FileReaderManager.getInstance().getCrInstance().getUrlPath();
		getUrl(url);
	}
	
	@Before
	public void beforeHooks(Scenario scenario) {
	String name = scenario.getName();	
	System.out.println("Scenario Name: " +name);	
	}
	
	@After
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("             Scenario Status: " +status);
		if (scenario.isFailed()) {
			getScreenShot(scenario.getName());
		}

	}
	
	@When("^User log into the application$")
	public void user_log_into_the_application() throws Throwable {
	    System.out.println("Login Details");

	}

	/*@When("^User enters the valid username in the username field$")
	public void user_enters_the_valid_username_in_the_username_field() throws Throwable {
	    HomePage hp=new HomePage(driver);
	    inputValueElement(hp.getUsername(), "Sharuraj");
	    
	}*/

	/*@When("^User enters the valid password in the password field$")
	public void user_enters_the_valid_password_in_the_password_field() throws Throwable {
		HomePage hp=new HomePage(driver);
		inputValueElement(hp.getPassword(), "mypass123");
	}*/
	
	@When("^User enters the valid \"([^\"]*)\" in the username field$")
	public void user_enters_the_valid_in_the_username_field(String username) throws Throwable {
		HomePage hp=new HomePage(driver);
		inputValueElement(pom.getHp().getUsername(), username);
	}

	@When("^User enters the valid \"([^\"]*)\" in the password field$")
	public void user_enters_the_valid_in_the_password_field(String password) throws Throwable {
		HomePage hp=new HomePage(driver);
		inputValueElement(pom.getHp().getPassword(), password);
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		HomePage hp=new HomePage(driver);
		clickElement(pom.getHp().getLoginbutton());
	}


	@Then("^User verifies whether HomePage navigates to Search Hotel Page$")
	public void user_verifies_whether_HomePage_navigates_to_Search_Hotel_Page() throws Throwable {
	Assert.assertEquals("A", "a");
	}

	/*@When("^User able to select location from the location dropdown field$")
	public void user_able_to_select_location_from_the_location_dropdown_field() throws Throwable {
	   SearchHotel srh=new SearchHotel(driver);
	   selectDropDown(srh.getSrchlocation(), "7", "index");
	   
	}*/
	
	@When("^User able to select location \"([^\"]*)\" as \"([^\"]*)\" from the location dropdown field$")
	public void user_able_to_select_location_as_from_the_location_dropdown_field(String location, String option) throws Throwable {
		SearchHotel srh=new SearchHotel(driver);
		selectDropDown(pom.getSrh().getSrchlocation(), location, option);
	}

	/*@When("^User able to select hotels from the hotel dropdown field$")
	public void user_able_to_select_hotels_from_the_hotel_dropdown_field() throws Throwable {
		 SearchHotel srh=new SearchHotel(driver);
		 selectDropDown(srh.getSrchhotel(), "Hotel Hervey", "value");
	}*/
	
	@When("^User able to select hotels \"([^\"]*)\" as \"([^\"]*)\" from the hotel dropdown field$")
	public void user_able_to_select_hotels_as_from_the_hotel_dropdown_field(String hotel, String option) throws Throwable {
		SearchHotel srh=new SearchHotel(driver);
		selectDropDown(pom.getSrh().getSrchhotel(), hotel, option);
	}

	/*@When("^User able to select room type from the room type dropdown field$")
	public void user_able_to_select_room_type_from_the_room_type_dropdown_field() throws Throwable {
		SearchHotel srh=new SearchHotel(driver);
		selectDropDown(srh.getRoomtype(), "3", "index");
	}*/
	
	@When("^User able to select roomtype \"([^\"]*)\" as \"([^\"]*)\" from the room type dropdown field$")
	public void user_able_to_select_roomtype_as_from_the_room_type_dropdown_field(String type, String option) throws Throwable {
		SearchHotel srh=new SearchHotel(driver);
		selectDropDown(pom.getSrh().getRoomtype(), type, option);
	}

	/*@When("^User able to select number of rooms from the number of rooms dropdown field$")
	public void user_able_to_select_number_of_rooms_from_the_number_of_rooms_dropdown_field() throws Throwable {
		SearchHotel srh=new SearchHotel(driver);
		selectDropDown(srh.getNoofrooms(), "1", "value");
	}*/
	
	@When("^User able to select number of rooms \"([^\"]*)\" as \"([^\"]*)\" from the number of rooms dropdown field$")
	public void user_able_to_select_number_of_rooms_as_from_the_number_of_rooms_dropdown_field(String rooms, String option) throws Throwable {
		SearchHotel srh=new SearchHotel(driver);
		selectDropDown(pom.getSrh().getNoofrooms(), rooms, option);
	}


	@When("^User enters valid checkin date in the checkin field$")
	public void user_enters_valid_checkin_date_in_the_checkin_field() throws Throwable {
		SearchHotel srh=new SearchHotel(driver);
		inputValueElement(pom.getSrh().getCheckindate(), "05/12/2020");
	}

	@When("^User enters valid checkout date in the checkout field$")
	public void user_enters_valid_checkout_date_in_the_checkout_field() throws Throwable {
		SearchHotel srh=new SearchHotel(driver);
		inputValueElement(pom.getSrh().getCheckoutdate(), "08/12/2020");
	}

	/*@When("^User able to select number of adults in adults per room field$")
	public void user_able_to_select_number_of_adults_in_adults_per_room_field() throws Throwable {
		SearchHotel srh=new SearchHotel(driver);
		selectDropDown(srh.getAdultsinroom(), "2 - Two", "text");
	}*/
	
	@When("^User able to select number of adults \"([^\"]*)\" as \"([^\"]*)\" in adults per room field$")
	public void user_able_to_select_number_of_adults_as_in_adults_per_room_field(String adult, String option) throws Throwable {
		SearchHotel srh=new SearchHotel(driver);
		selectDropDown(pom.getSrh().getAdultsinroom(), adult, option);
	}

	/*@When("^User able to select number of child in children per room field$")
	public void user_able_to_select_number_of_child_in_children_per_room_field() throws Throwable {
		SearchHotel srh=new SearchHotel(driver);
		selectDropDown(srh.getChildinroom(), "1", "value");
	}*/
	
	@When("^User able to select number of child \"([^\"]*)\" as \"([^\"]*)\" in children per room field$")
	public void user_able_to_select_number_of_child_as_in_children_per_room_field(String child, String option) throws Throwable {
		SearchHotel srh=new SearchHotel(driver);
		selectDropDown(pom.getSrh().getChildinroom(), child, option);
	}

	@When("^User clicks on the search button$")
	public void user_clicks_on_the_search_button() throws Throwable {
		SearchHotel srh=new SearchHotel(driver);
		clickElement(pom.getSrh().getSearchbutton());
	}

	@Then("^User verifies whether Search Page navigates to Search Comfirmation Page$")
	public void user_verifies_whether_Search_Page_navigates_to_Search_Comfirmation_Page() throws Throwable {
	    
	}

	@When("^User able to choose the radio button to confirm the search$")
	public void user_able_to_choose_the_radio_button_to_confirm_the_search() throws Throwable {
	   SelectHotel slh=new SelectHotel(driver);
	   clickElement(pom.getSlh().getRbutton());
	   
	}

	@When("^User clicks on the continue button$")
	public void user_clicks_on_the_continue_button() throws Throwable {
		SelectHotel slh=new SelectHotel(driver);
		clickElement(pom.getSlh().getContinuebutton());
	}

	@Then("^User verifies whether Search Page navigates to Book A Hotel Page$")
	public void user_verifies_whether_Search_Page_navigates_to_Book_A_Hotel_Page() throws Throwable {
	    
	}

	/*@When("^User enters the valid first name in the first name field$")
	public void user_enters_the_valid_first_name_in_the_first_name_field() throws Throwable {
	   BookHotelPage bh=new BookHotelPage(driver);
	   inputValueElement(bh.getFname(), "Sharikaa");
	}*/
	
	@When("^User enters the valid \"([^\"]*)\" in the firstname field$")
	public void user_enters_the_valid_in_the_firstname_field(String firstname) throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		inputValueElement(pom.getBh().getFname(), firstname);
	}
	
	/*@When("^User enters the valid last name in the last name field$")
	public void user_enters_the_valid_last_name_in_the_last_name_field() throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		inputValueElement(bh.getLname(), "Rajesh");
	}*/
	
	@When("^User enters the valid \"([^\"]*)\" in the lastname field$")
	public void user_enters_the_valid_in_the_lastname_field(String lastname) throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		inputValueElement(pom.getBh().getLname(), lastname);
	}

	/*@When("^User enters the valid billing address in the billing address field$")
	public void user_enters_the_valid_billing_address_in_the_billing_address_field() throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		inputValueElement(bh.getBilladdress(), "1,Lakeview Apartments,Texas");
	}*/
	
	
	@When("^User enters the valid \"([^\"]*)\" in the billingaddress field$")
	public void user_enters_the_valid_in_the_billingaddress_field(String billingaddress) throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		inputValueElement(pom.getBh().getBilladdress(), billingaddress);
	}


	/*@When("^User enters the valid credit card details in the credit card number field$")
	public void user_enters_the_valid_credit_card_details_in_the_credit_card_number_field() throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		inputValueElement(bh.getCcno(), "7564823467894512");
	}*/

	
	@When("^User enters the valid \"([^\"]*)\" in the creditcardnumber field$")
	public void user_enters_the_valid_in_the_creditcardnumber_field(String creditcarddetails) throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		inputValueElement(pom.getBh().getCcno(), creditcarddetails);
	}
	
	/*@When("^User able to choose credit card type from the credit card type dropdown field$")
	public void user_able_to_choose_credit_card_type_from_the_credit_card_type_dropdown_field() throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		selectDropDown(bh.getCctype(), "MAST", "value");
	}*/
	
	@When("^User able to choose creditcardtype \"([^\"]*)\" as \"([^\"]*)\" from the creditcardtype dropdown field$")
	public void user_able_to_choose_creditcardtype_as_from_the_creditcardtype_dropdown_field(String creditcardtype, String option) throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		selectDropDown(pom.getBh().getCctype(), creditcardtype, option);
	}

	/*@When("^User able to choose select month in the month dropdown field$")
	public void user_able_to_choose_select_month_in_the_month_dropdown_field() throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		selectDropDown(bh.getExpmonth(), "11", "value");
	}*/
	
	@When("^User able to choose expmonth \"([^\"]*)\" as \"([^\"]*)\" in the month dropdown field$")
	public void user_able_to_choose_expmonth_as_in_the_month_dropdown_field(String selectmonth, String option) throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		selectDropDown(pom.getBh().getExpmonth(), selectmonth, option);
	}

	/*@When("^User able to choose select year in the year dropdown field$")
	public void user_able_to_choose_select_year_in_the_year_dropdown_field() throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		selectDropDown(bh.getExpyear(), "2021", "text");
	}*/
	
	@When("^User able to choose expyear \"([^\"]*)\" as \"([^\"]*)\" in the year dropdown field$")
	public void user_able_to_choose_expyear_as_in_the_year_dropdown_field(String selectyear, String option) throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		selectDropDown(pom.getBh().getExpyear(), selectyear, option);
	}

	/*@When("^User enters the valid cvv number in the CVV field$")
	public void user_enters_the_valid_cvv_number_in_the_CVV_field() throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		inputValueElement(bh.getCvvno(), "595");
	}*/
	
	@When("^User enters the valid \"([^\"]*)\" in the CVV field$")
	public void user_enters_the_valid_in_the_CVV_field(String cvvnumber) throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		inputValueElement(pom.getBh().getCvvno(), cvvnumber);
	}

	@When("^User clicks on the book now button$")
	public void user_clicks_on_the_book_now_button() throws Throwable {
		BookHotelPage bh=new BookHotelPage(driver);
		clickElement(pom.getBh().getBooknowbutton());
	}

	@Then("^User verifies whether Book A Hotel Page navigates to Booking Confirmation Page$")
	public void user_verifies_whether_Book_A_Hotel_Page_navigates_to_Booking_Confirmation_Page() throws Throwable {
	 
	}

	@When("^User clicks on the My Itinerary button$")
	public void user_clicks_on_the_My_Itinerary_button() throws Throwable {
	   BookingConfirmPage bc=new BookingConfirmPage(driver);
	   clickElement(pom.getBc().getMyitinerary());
	}

	@Then("^User verifies whether Booking Confirmation Page navigates to Booked Itinerary Page$")
	public void user_verifies_whether_Booking_Confirmation_Page_navigates_to_Booked_Itinerary_Page() throws Throwable {
	   
	}

	@When("^User clicks on the logout button$")
	public void user_clicks_on_the_logout_button() throws Throwable {
	  BookedItineraryPage bi=new BookedItineraryPage(driver);
	  clickElement(pom.getBi().getLogout());
	}

	@Then("^User verifies whether Booked Itinerary Page navigates to Successfully Logout Page$")
	public void user_verifies_whether_Booked_Itinerary_Page_navigates_to_Successfully_Logout_Page() throws Throwable {
	 
	}


	
}
