package com.letcode.in_Elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioAndCheckbox_Elements {

	WebDriver driver;

	public RadioAndCheckbox_Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[normalize-space()='Toggle']")
	public WebElement radioBuuttonElement;
	
	@FindBy(xpath = "//input[@id='yes']")
	public WebElement selectAnyonElement;
	
	@FindBy(xpath = "//input[@id='yes']")
	public WebElement confirmYouCanSelectOneRadioButtonYesElement;	
	
	@FindBy(xpath = "//input[@id='two']")
	public WebElement confirmYouCanSelectOneRadioButtonNoElement;	
	
	@FindBy(xpath = "//input[@id='nobug']")
	public WebElement findTheBugYesElement;
	
	@FindBy(xpath = "//input[@id='bug']")
	public WebElement findTheBugNoElement;
	
	@FindBy(xpath = "//input[@id='maybe']")
	public WebElement ConfirmlastfieldisdisabledElement;
	
	@FindBy(xpath = "/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input")
	public WebElement findTheCheckboxSelectedOrNotElement;
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-radio-check[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/label[2]/input[1]")
	public WebElement acceptTheTAndCElement;
	
	
	

	@FindBy(xpath = "//input[@type='radio']")
	public List<WebElement> radioButtonsList;

}
