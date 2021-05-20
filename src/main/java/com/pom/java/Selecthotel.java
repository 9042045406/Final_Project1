package com.pom.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel {
	
	

	public Selecthotel(WebDriver driver2) {
		this.Driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	private WebDriver Driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	public WebDriver getDriver() {
		return Driver;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	
	
}
