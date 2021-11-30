package com.definition;

import com.base.BaseClass;
import com.pojo.BookHotelPojo;
import com.pojo.LoginPojo;
import com.pojo.SearchHotelPojo;
import com.pojo.SelectHotelPojo;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {
	
	LoginPojo lp;
	SearchHotelPojo sh;
	SelectHotelPojo shp;
	BookHotelPojo bhp;
	
	@Given("User launch Adactin web application")
	public void user_launch_Adactin_web_application() {
		launchBrowser();
		maximizeWindow();
		loadUrl("https://adactinhotelapp.com/");
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		
		lp = new LoginPojo();
		type(lp.getUserName(), "Pushparaj12");
		type(lp.getPassWord(), "Maddy.5");
		}

	@When("User clicks Login button")
	public void user_clicks_Login_button() {
		lp = new LoginPojo();
		btnClick(lp.getLogIn());
	}

	@Then("user validate search hotel page is displayed")
	public void user_validate_search_hotel_page_is_displayed() {
		
		sh = new SearchHotelPojo();
		verifyPage(sh.getSearchTxt());	   
	}

	@When("User selects location, hotels, room type in search hotel page")
	public void user_selects_location_hotels_room_type_in_search_hotel_page() {
		
		sh = new SearchHotelPojo();
		dropDownSelect(sh.getLocation(), "London");
		dropDownSelect(sh.getHotels(), "Hotel Sunshine");
		dropDownSelect(sh.getRoomType(), "Standard");    
	}

	@When("clicks Search button")
	public void clicks_Search_button() {
		sh = new SearchHotelPojo();
		btnClick(sh.getSearchBtn());	    
	}

	@Then("user validate search results page is displayed")
	public void user_validate_search_results_page_is_displayed() {
		
		shp = new SelectHotelPojo();
		verifyPage(shp.getSelectHotelTxt());
	}

	@When("User clicks on radio button")
	public void user_clicks_on_radio_button() {
		
		shp = new SelectHotelPojo();
		btnClick(shp.getRadioBtn());
	}

	@When("clicks Continue button")
	public void clicks_Continue_button() {
		
		shp = new SelectHotelPojo();
		btnClick(shp.getContinueBtn());
	}

	@Then("user validate book hotel page is displayed")
	public void user_validate_book_hotel_page_is_displayed() {
	    bhp = new BookHotelPojo();
	    verifyPage(bhp.getBookTxt());
	}

	@When("User enter valid first name, last name, Billing address")
	public void user_enter_valid_first_name_last_name_Billing_address() {
		
		bhp = new BookHotelPojo();
		type(bhp.getFirstName(), "Tony");
		type(bhp.getLastName(), "Stark");
		type(bhp.getAddress(), "No 111, Washington DC");	        
	}

	@When("User enters valid credit card number, credit card type, expiry date and enters valid cvv")
	public void user_enters_valid_credit_card_number_credit_card_type_expiry_date_and_enters_valid_cvv() {
		
		bhp = new BookHotelPojo();
		type(bhp.getCCNum(), "9873343456890087");
		dropDownSelect(bhp.getCcType(), "MAST");
		dropDownSelect(bhp.getExpMnth(), "10");
		dropDownSelect(bhp.getExpYear(), "2022");
		type(bhp.getCvv(), "111");
		
	}

	@When("clicks Book Now button")
	public void clicks_Book_Now_button() throws InterruptedException {
		
		bhp = new BookHotelPojo();
		btnClick(bhp.getBookNow());	 
		Thread.sleep(5000);
	}

	@Then("user validate order id is displayed")
	public void user_validate_order_id_is_displayed() {
		
		bhp = new BookHotelPojo();
		printOrderId(bhp.getOrderNo());	    
	}
	
	@When("user selects valid {string}, {string} and {string} in search hotel page")
	public void user_selects_valid_and_in_search_hotel_page(String location, String hotels, String roomType) {
		
		sh = new SearchHotelPojo();
		dropDownSelect(sh.getLocation(), location);
		dropDownSelect(sh.getHotels(), hotels);
		dropDownSelect(sh.getRoomType(), roomType); 
		}

	@When("user enters valid {string}, {string} and {string}")
	public void user_enters_valid_and(String frstName, String lstName, String addres) {
		
		bhp = new BookHotelPojo();
		type(bhp.getFirstName(), frstName);
		type(bhp.getLastName(), lstName);
		type(bhp.getAddress(), addres);		  
	}

	@When("user enters valid {string}, {string}, {string}, {string} and {string}")
	public void user_enters_valid_and(String ccNum, String ccTyp, String mnth, String yr, String cvvNo) {
		bhp = new BookHotelPojo();
		type(bhp.getCCNum(), ccNum);
		dropDownSelect(bhp.getCcType(), ccTyp);
		dropDownSelect(bhp.getExpMnth(), mnth);
		dropDownSelect(bhp.getExpYear(), yr);
		type(bhp.getCvv(), cvvNo);
	}


	
}
