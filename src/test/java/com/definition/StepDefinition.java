package com.definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
public static WebDriver driver;
	
	@Given("User launch Adactin web application")
	public void user_launch_Adactin_web_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	   driver.findElement(By.id("username")).sendKeys("Pushparaj12");
	   driver.findElement(By.id("password")).sendKeys("Maddy.5");
	}

	@When("User clicks Login button")
	public void user_clicks_Login_button() {
		 driver.findElement(By.id("login")).click();
	}

	@Then("user validate search hotel page is displayed")
	public void user_validate_search_hotel_page_is_displayed() {
	   WebElement searchHotel = driver.findElement(By.xpath("//td[contains(text(),'Search')]"));
	   boolean hotel = searchHotel.isDisplayed();
	   System.out.println("Search Hotel page :"+hotel);
	   
	}

	@When("User selects location, hotels, room type in search hotel page")
	public void user_selects_location_hotels_room_type_in_search_hotel_page() {
	    WebElement location = driver.findElement(By.id("location"));
	    Select drpDwn = new Select(location);
	    drpDwn.selectByValue("London");
	    
	    WebElement hotels = driver.findElement(By.id("hotels"));
	    Select drpDwn1 = new Select(hotels);
	    drpDwn1.selectByValue("Hotel Sunshine");
	    
	    WebElement roomType = driver.findElement(By.id("room_type"));
	    Select drpDwn2 = new Select(roomType);
	    drpDwn2.selectByValue("Standard");
	    	    
	}

	@When("clicks Search button")
	public void clicks_Search_button() {
		driver.findElement(By.id("Submit")).click();	    
	}

	@Then("user validate search results page is displayed")
	public void user_validate_search_results_page_is_displayed() {
	    WebElement selectHotel = driver.findElement(By.xpath("//td[contains(text(),'Select')]"));
	    boolean selectTxt = selectHotel.isDisplayed();
	    System.out.println("Select Hotel page :"+selectTxt);
	}

	@When("User clicks on radio button")
	public void user_clicks_on_radio_button() {
	    driver.findElement(By.id("radiobutton_0")).click();
	}

	@When("clicks Continue button")
	public void clicks_Continue_button() {
	    driver.findElement(By.id("continue")).click();
	}

	@Then("user validate book hotel page is displayed")
	public void user_validate_book_hotel_page_is_displayed() {
	    WebElement bookHotel = driver.findElement(By.xpath("//td[contains(text(),'Book')]"));
	    boolean bookTxt = bookHotel.isDisplayed();
	    System.out.println("Book Hotel page :"+bookTxt);
	}

	@When("User enter valid first name, last name, Billing address")
	public void user_enter_valid_first_name_last_name_Billing_address() {
	    driver.findElement(By.name("first_name")).sendKeys("Tony");
	    driver.findElement(By.name("last_name")).sendKeys("Stark");
	    driver.findElement(By.name("address")).sendKeys("No 111, Washington DC");
	        
	}

	@When("User enters valid credit card number, credit card type, expiry date and enters valid cvv")
	public void user_enters_valid_credit_card_number_credit_card_type_expiry_date_and_enters_valid_cvv() {
		driver.findElement(By.name("cc_num")).sendKeys("9873343456890087");
		
		WebElement ccType = driver.findElement(By.name("cc_type"));
		Select cc = new Select(ccType);
		cc.selectByValue("MAST");
		
		WebElement ccMnth = driver.findElement(By.name("cc_exp_month"));
		Select Month = new Select(ccMnth);
		Month.selectByValue("10");
		
		WebElement ccYear= driver.findElement(By.name("cc_exp_year"));
		Select Year = new Select(ccYear);
		Year.selectByValue("2022");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("111");
		
		
	}

	@When("clicks Book Now button")
	public void clicks_Book_Now_button() throws InterruptedException {
		driver.findElement(By.name("book_now")).click();
		Thread.sleep(5000);
	    
	}

	@Then("user validate order id is displayed")
	public void user_validate_order_id_is_displayed() {
		WebElement ordId = driver.findElement(By.name("order_no"));
		String OrderId = ordId.getAttribute("value");
		System.out.println("Order id is :" +OrderId);
	    
	}
	
	@When("user selects valid {string}, {string} and {string} in search hotel page")
	public void user_selects_valid_and_in_search_hotel_page(String location, String hotels, String roomType) {
		 WebElement hotelLocation = driver.findElement(By.id("location"));
		    Select drpDwn = new Select(hotelLocation);
		    drpDwn.selectByValue(location);
		    
		    WebElement hotel = driver.findElement(By.id("hotels"));
		    Select drpDwn1 = new Select(hotel);
		    drpDwn1.selectByValue(hotels);
		    
		    WebElement room = driver.findElement(By.id("room_type"));
		    Select drpDwn2 = new Select(room);
		    drpDwn2.selectByValue(roomType);
	}

	@When("user enters valid {string}, {string} and {string}")
	public void user_enters_valid_and(String frstName, String lstName, String addres) {
		 driver.findElement(By.name("first_name")).sendKeys(frstName);
		    driver.findElement(By.name("last_name")).sendKeys(lstName);
		    driver.findElement(By.name("address")).sendKeys(addres);	  
	}

	@When("user enters valid {string}, {string}, {string}, {string} and {string}")
	public void user_enters_valid_and(String ccNum, String ccTyp, String mnth, String yr, String cvvNo) {
		
		driver.findElement(By.name("cc_num")).sendKeys(ccNum);
		
		WebElement ccType = driver.findElement(By.name("cc_type"));
		Select cc = new Select(ccType);
		cc.selectByValue(ccTyp);
		
		WebElement ccMnth = driver.findElement(By.name("cc_exp_month"));
		Select Month = new Select(ccMnth);
		Month.selectByValue(mnth);
		
		WebElement ccYear= driver.findElement(By.name("cc_exp_year"));
		Select Year = new Select(ccYear);
		Year.selectByValue(yr);
		
		driver.findElement(By.id("cc_cvv")).sendKeys(cvvNo);
	}


	
}
