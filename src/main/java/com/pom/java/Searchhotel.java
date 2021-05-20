package com.pom.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel {
	

	public Searchhotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		private WebDriver driver;
		
		@FindBy(name="location")
		private WebElement location;
		
		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getLocation() {
			return location;
		}

		public WebElement getHotels() {
			return hotels;
		}

		public WebElement getRoomtype() {
			return roomtype;
		}

		public WebElement getNorooms() {
			return norooms;
		}

		public WebElement getDatein() {
			return datein;
		}

		public WebElement getDateout() {
			return dateout;
		}

		public WebElement getAdultroom() {
			return adultroom;
		}

		public WebElement getChildroom() {
			return childroom;
		
		}
		@FindBy(id="hotels")
		private WebElement hotels;
		
		@FindBy(id="room_type")
		private WebElement roomtype;
		
		@FindBy(name="room_nos")
		private WebElement norooms;
		
		@FindBy(id="datepick_in")
		private WebElement datein;
		
		@FindBy(id="datepick_out")
		private WebElement dateout;
		
		@FindBy(name="adult_room")
		private WebElement adultroom;
		
		@FindBy(id="child_room")
		private WebElement childroom;
		
		@FindBy(id="Submit")
		private WebElement Searchbtn;

		public WebElement getSearchbtn() {
			return Searchbtn;
		}

				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


