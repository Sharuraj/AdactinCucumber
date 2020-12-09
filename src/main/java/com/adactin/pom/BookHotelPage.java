package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lname;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement billaddress;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement ccno;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cctype;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expmonth;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expyear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvvno;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement booknowbutton;
	
	public BookHotelPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getBilladdress() {
		return billaddress;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getBooknowbutton() {
		return booknowbutton;
	}
	

}
