package com.pom.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel {
	public Bookhotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
		private WebDriver driver;
		
	@FindBy(id="first_name")
	private WebElement firstname;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCarnumber() {
		return carnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}
	@FindBy(id="last_name")
	private WebElement Lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement carnumber;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expirymonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvnumber;
	
	@FindBy(id="book_now")
	private WebElement bookbtn;
	
	
	
		
		
		
		
		
		
		
	}


