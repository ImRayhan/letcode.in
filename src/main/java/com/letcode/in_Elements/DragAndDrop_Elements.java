package com.letcode.in_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop_Elements {
	
	WebDriver driver;
	
	public DragAndDrop_Elements(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//h3[@id='header']")
	public WebElement dragElement;
	
	@FindBy(xpath = "//div[@id='draggable']")
	public WebElement dropPickElement;
	
	@FindBy(xpath = "//div[@id='droppable']")
	public WebElement dropRealeaseElement;
	
	

}
