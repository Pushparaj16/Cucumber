package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotelPojo extends BaseClass {
	
	public BookHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[contains(text(),'Book')]")
	private WebElement bookTxt;
	
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(name="last_name")
	private WebElement lastName;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement CCNum;
	
	@FindBy(name="cc_type")
	private WebElement ccType;
	
	@FindBy(name="cc_exp_month")
	private WebElement expMnth;
	
	@FindBy(name="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	@FindBy(id="order_no")
	private WebElement orderNo;

	public WebElement getBookTxt() {
		return bookTxt;
	}

	public void setBookTxt(WebElement bookTxt) {
		this.bookTxt = bookTxt;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getCCNum() {
		return CCNum;
	}

	public void setCCNum(WebElement cCNum) {
		CCNum = cCNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public void setCcType(WebElement ccType) {
		this.ccType = ccType;
	}

	public WebElement getExpMnth() {
		return expMnth;
	}

	public void setExpMnth(WebElement expMnth) {
		this.expMnth = expMnth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public void setExpYear(WebElement expYear) {
		this.expYear = expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public void setBookNow(WebElement bookNow) {
		this.bookNow = bookNow;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(WebElement orderNo) {
		this.orderNo = orderNo;
	}
	
	
	
	
}
