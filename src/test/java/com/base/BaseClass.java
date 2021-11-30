package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	
	public void loadUrl(String url) {
		driver.get(url);
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void type(WebElement element, String string) {
		element.sendKeys(string);
	}
	
	public void btnClick(WebElement element) {
		element.click();
	}
	
	public void dropDownSelect(WebElement element, String string) {
		Select drpDwn = new Select(element);
	    drpDwn.selectByValue(string);
	}
	
	public void verifyPage(WebElement element) {
		boolean verify = element.isDisplayed();
		System.out.println("Page Verified : " + verify);
	}
	
	public void printOrderId(WebElement element) {
		String OrderId = element.getAttribute("value");
		System.out.println("Order id is : " + OrderId);
	}
	
	
}
