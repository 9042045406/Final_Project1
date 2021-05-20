package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.helper.File_Reader_Manager;
import com.adactin.helper.Page_Object_Manager;
import com.adactin.runner.Test_runner;
import com.baseclass.java.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {

	public static WebDriver driver = Test_runner.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		BrowserOpen(url);
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		inputvalue(pom.InstanceLogin().getUsername(), "8870533993");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		inputvalue(pom.InstanceLogin().getPassword(), "Subashini@95");
	}

	@Then("^user Click on The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_on_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		ClickOnElement(pom.InstanceLogin().getLogbtn());
	}

	@When("^user Select The Location In Field$")
	public void user_Select_The_Location_In_Field() throws Throwable {
		DropDown(pom.InstanceSearch().getLocation(),"text","Melbourne");
		
			}

	@When("^user Select The Hotel In Field$")
	public void user_Select_The_Hotel_In_Field() throws Throwable {
		DropDown(pom.InstanceSearch().getHotels(),"text","Hotel Creek");
			}

	@When("^user Select The Roomtype In Field$")
	public void user_Select_The_Roomtype_In_Field() throws Throwable {
		DropDown(pom.InstanceSearch().getRoomtype(),"text","Standard");
			}

	@When("^user Select The Nos Of Rooms$")
	public void user_Select_The_Nos_Of_Rooms() throws Throwable {
		DropDown(pom.InstanceSearch().getNorooms(),"text","2 - Two");
			}

	@When("^user Choose The Check In Date In Field$")
	public void user_Choose_The_Check_In_Date_In_Field() throws Throwable {
		inputvalue(pom.InstanceSearch().getDatein(),"17/05/2021");
			}

	@When("^user Choose The CheckOut Date In Field$")
	public void user_Choose_The_CheckOut_Date_In_Field() throws Throwable {
		inputvalue(pom.InstanceSearch().getDateout(),"18/05/2021");
	}

	@When("^user Select The Adult Per Room In Field$")
	public void user_Select_The_Adult_Per_Room_In_Field() throws Throwable {
		DropDown(pom.InstanceSearch().getAdultroom(),"text","2 - Two");
			}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		DropDown(pom.InstanceSearch().getChildroom(),"text","3 - Three");
	}

	@Then("^user Click On The Search Button and it Navigates To Select Hotel Page$")
	public void user_Click_On_The_Search_Button_and_it_Navigates_To_Select_Hotel_Page() throws Throwable {
		ClickOnElement(pom.InstanceSearch().getSearchbtn());
	}

	@When("^user Select The Hotel In Remote Button Field$")
	public void user_Select_The_Hotel_In_Remote_Button_Field() throws Throwable {
		ClickOnElement(pom.InstanceSelect().getRadiobtn());
	}

	@Then("^Click On The Continue Button And Navigates To Book A Hotel Page$")
	public void click_On_The_Continue_Button_And_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		ClickOnElement(pom.InstanceSelect().getContinuebtn());
	}

	@When("^user Enter The Firstname In Firstname Field$")
	public void user_Enter_The_Firstname_In_Firstname_Field() throws Throwable {
		inputvalue(pom.InstanceBook().getFirstname(),"Subashini");
		Thread.sleep(4000);
	}

	@When("^user Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
		inputvalue(pom.InstanceBook().getLastname(),"Saravanan");
		Thread.sleep(4000);

	}

	@When("^user Enter The Billing Address in Billing Field$")
	public void user_Enter_The_Billing_Address_in_Billing_Field() throws Throwable {
		inputvalue(pom.InstanceBook().getAddress(),"6rpc appartment G2 kilburn nagar Mangalore");
		Thread.sleep(4000);

	}

	@When("^user Enter The (\\d+)Digit Credit Card Number in Field$")
	public void user_Enter_The_Digit_Credit_Card_Number_in_Field(int arg1) throws Throwable {
		inputvalue(pom.InstanceBook().getCarnumber(),"987654321089101");
        Thread.sleep(4000);
	}

	@When("^user Select The Credit Card Type in Field$")
	public void user_Select_The_Credit_Card_Type_in_Field() throws Throwable {
		DropDown(pom.InstanceBook().getCardtype(),"text","VISA");
		Thread.sleep(4000);
	}

	@When("^user Select The Expiry Date in The Field$")
	public void user_Select_The_Expiry_Date_in_The_Field() throws Throwable {
    DropDown(pom.InstanceBook().getExpirymonth(),"text","February");
    Thread.sleep(4000);
	}

	@When("^user Select The Expiry Year in The Field$")
	public void user_Select_The_Expiry_Year_in_The_Field() throws Throwable {
		DropDown(pom.InstanceBook().getExpiryyear(),"text","2022");
		Thread.sleep(4000);
	}

	@When("^user Enter The CVV Number In Field$")
	public void user_Enter_The_CVV_Number_In_Field() throws Throwable {
	inputvalue(pom.InstanceBook().getCvvnumber(),"599");
	Thread.sleep(4000);
	}

	@Then("^user Click on The Book Now  Button And It Navigates To BookingConfirm Hotel Page$")
	public void user_Click_on_The_Book_Now_Button_And_It_Navigates_To_BookingConfirm_Hotel_Page() throws Throwable {
	ClickOnElement(pom.InstanceBook().getBookbtn());	
	Thread.sleep(4000);
	}

	@When("^user Click On The LogOut Page and close$")
	public void user_Click_On_The_LogOut_Page_and_close() throws Throwable {
		ClickOnElement(pom.InstanceConfirm().getLogout());
		Thread.sleep(4000);
	}

}
