package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.java.Bookhotel;
import com.pom.java.Bookingconfirm;
import com.pom.java.Loginpage;
import com.pom.java.Searchhotel;
import com.pom.java.Selecthotel;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Loginpage login;
	
	private Searchhotel search;
	
	private Selecthotel select;
	
	private Bookhotel book;
	
	private Bookingconfirm confirm;
	
	public Page_Object_Manager(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
	}
	
	public Loginpage InstanceLogin() {
		login=new Loginpage(driver);
		return login;
	}
	
	public Searchhotel InstanceSearch() {
		search=new Searchhotel(driver);
		return search;
		
	}
	
	public Selecthotel InstanceSelect() {
		select=new Selecthotel(driver);
		return select;
		
	}
	
	public Bookhotel InstanceBook() {
		book=new Bookhotel(driver);
		return book;
	}
	
	public Bookingconfirm InstanceConfirm() {
		confirm=new Bookingconfirm(driver);
		return confirm;
		
		
		
		
		
		
		
		
	}
	
	
	

}
