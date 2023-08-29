package com.letcode.in_Elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Elements {
	WebDriver driver;
	
	public Select_Elements(WebDriver driver) {
  
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[normalize-space()='Drop-Down']")
	public WebElement selectElement;
	
	@FindBy(css = "#fruits")
	public WebElement Selecttheappleusingvisibletext;
	
	@FindBy(xpath = "//p[normalize-space()='You have selected Apple']")
	public WebElement YouhaveselectedApple;
	
	@FindBy(css = "#superheros")
	public WebElement Selectyoursuperhero;
		
	@FindBy(xpath = "//select[@id='lang']//option")
	public List<WebElement> selectthelastprogramminglanguageandprintalltheoptionsElement;
	
	@FindBy(xpath = "//select[@id='lang']")
	public WebElement selectthelastprogram;
;
	
	

}
