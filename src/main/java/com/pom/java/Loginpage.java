package com.pom.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	

	public Loginpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
		
	}
	private WebDriver driver;
	
	@FindBy(id ="username")
	private WebElement username;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement logbtn;
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



