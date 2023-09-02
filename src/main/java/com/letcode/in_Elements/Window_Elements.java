package com.letcode.in_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Window_Elements {

	WebDriver driver;
	
	public Window_Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//a[normalize-space()='Tabs'])[1]")
	public WebElement windowElement;
	
	@FindBy(css = "#home")
	public WebElement openHomePageElement;
	
	@FindBy(xpath  = "//*[@id=\"multi\"]")
	public WebElement multiWindowElement;

}
