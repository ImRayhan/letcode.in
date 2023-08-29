package com.letcode.in_Pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.letcode.in_Elements.ButtonClick_Elements;

public class ButtonClick_Page {
	WebDriver driver;
	ButtonClick_Elements buttonClickElements;
	String baseUrl = "https://letcode.in/test";

	public ButtonClick_Page(WebDriver driver) {
		this.driver = driver;
		buttonClickElements = new ButtonClick_Elements(driver);

	}

	public String openUrl() {
		return baseUrl;

	}

	public void clickButtonClick() {

		buttonClickElements.buttonClickElement.click();

	}

	public void findtheheightwidthofthebutton() {

		Rectangle rect = buttonClickElements.findtheheightwidthofthebuttonElement.getRect();
		System.out.println("Height is: " + rect.getHeight());
		System.out.println("Widtch: " + rect.getWidth());
		System.out.println("GetPoint is: " + rect.getPoint());

		Dimension dime = rect.getDimension();
		System.out.println("Widtch: " + dime.getWidth());
		System.out.println("Height is: " + dime.getHeight());

	}

	public String howTallAndFatIamTextVerify() {
		return buttonClickElements.findtheheightwidthofthebuttonElement.getText();

	}

	public void ClickgotoHome() {
		buttonClickElements.gotoHomeElement.click();

	}

	public String buttonTextVerify() {
		return buttonClickElements.buttonTextElement.getText();

	}

	public void ClickandHoldButton() {

		Actions act = new Actions(driver);
		act.clickAndHold(buttonClickElements.buttonHolElement).perform();

	}

	public boolean Confirmbuttonisdisabled() {
		boolean isEnble = buttonClickElements.didbleButtonElement.isEnabled();
		return isEnble;

	}

	public void HoldButton() {

		Actions act = new Actions(driver);
		act.clickAndHold(buttonClickElements.clickAndHoldElement);

	}

}
