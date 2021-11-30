package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPojo extends BaseClass {
	public SelectHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[contains(text(),'Select')]")
	private WebElement selectHotelTxt;
	
	@FindBy(id="radiobutton_0")
	private WebElement radioBtn;
	
	@FindBy(id="continue")	
	private WebElement continueBtn;

	public WebElement getSelectHotelTxt() {
		return selectHotelTxt;
	}

	public void setSelectHotelTxt(WebElement selectHotelTxt) {
		this.selectHotelTxt = selectHotelTxt;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public void setRadioBtn(WebElement radioBtn) {
		this.radioBtn = radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public void setContinueBtn(WebElement continueBtn) {
		this.continueBtn = continueBtn;
	}
	
	
}
