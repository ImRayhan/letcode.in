package com.letcode.in_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Short_Element {
	WebDriver driver;
	
	public Short_Element(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "cdk-drop-list-0")
	public WebElement todoTablElement;
	
	@FindBy(id = "sample-box1")
	public WebElement clickHoldElement;
	
	
	@FindBy(xpath  = "//div[@id='cdk-drop-list-0']//div[4]")
	public WebElement realeseHoldElement;
	
	

}
