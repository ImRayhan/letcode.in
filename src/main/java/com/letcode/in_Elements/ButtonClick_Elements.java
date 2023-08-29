package com.letcode.in_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonClick_Elements {

	WebDriver driver;

	public ButtonClick_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Click']")
	public WebElement buttonClickElement;

	@FindBy(id = "property")
	public WebElement findtheheightwidthofthebuttonElement;

	@FindBy(xpath = "//button[@id='home']")
	public WebElement gotoHomeElement;
	
	@FindBy(xpath = "//h1[normalize-space()='Button']")
	public WebElement buttonTextElement;
	
	@FindBy(xpath = "//button[@class='button is-info']")
	public WebElement didbleButtonElement;
	
	@FindBy(xpath = "//h2[normalize-space()='Button Hold!']")
	public WebElement buttonHolElement;

	@FindBy(xpath = "//h2[normalize-space()='Button has been long pressed']")
	public WebElement clickAndHoldElement;
	
	

}
