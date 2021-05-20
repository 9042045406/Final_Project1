Feature: Hotel Booking In Adactin Application

Scenario: Loginpage Functionality

Given user Launch The Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click on The Login Button And It Navigates To Search Hotel Page

Scenario: Search Hotel Page Functionality
When user Select The Location In Field
And user Select The Hotel In Field
And user Select The Roomtype In Field
And user Select The Nos Of Rooms
And user Choose The Check In Date In Field
And user Choose The CheckOut Date In Field 
And user Select The Adult Per Room In Field
And user Select The Children Per Room
Then user Click On The Search Button and it Navigates To Select Hotel Page

Scenario: Select Hotel Page Functionality
When user Select The Hotel In Remote Button Field
Then Click On The Continue Button And Navigates To Book A Hotel Page

Scenario: Book Hotel Page Functionality
When  user Enter The Firstname In Firstname Field
And  user Enter The Lastname In Lastname Field
And  user Enter The Billing Address in Billing Field
And  user Enter The 16Digit Credit Card Number in Field
And  user Select The Credit Card Type in Field
And  user Select The Expiry Date in The Field
And  user Select The Expiry Year in The Field
And  user Enter The CVV Number In Field
Then user Click on The Book Now  Button And It Navigates To BookingConfirm Hotel Page

Scenario: Booking Confirm Page Functionality
When user Click On The LogOut Page and close

