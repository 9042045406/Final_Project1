package com.pom.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconfirm {
	
	

	public Bookingconfirm(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	private WebDriver driver;
	
	@FindBy(xpath="//a[@href='Logout.php']")
	private WebElement logout;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	
		
		
		
		
		
		
		
		
		
	}


