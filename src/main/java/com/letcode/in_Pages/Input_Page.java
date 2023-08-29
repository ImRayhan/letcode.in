package com.letcode.in_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.letcode.in_Elements.Input_Elements;

public class Input_Page {
	WebDriver driver;
	Input_Elements inputElement;
	String baseUrl = "https://letcode.in/test";

	public Input_Page(WebDriver driver) {
		this.driver = driver;
		inputElement = new Input_Elements(driver);

	}

	public String openUrl() {
		return baseUrl;

	}

	public void ClickInputEdit() {
		inputElement.inputEditElement.click();

	}

	public void enterYourFullName(String name) {
		inputElement.enteryourfullNameeElement.sendKeys(name);

	}

	public void appendatextandpreskeyboardtabe() {
		inputElement.appendatextandpreskeyboardtabeElement.sendKeys(" person" + Keys.TAB);

	}

	public void whatisinsidethetextboxValue() {
		String value = inputElement.whatisinsidethetextboxElement.getAttribute("value");
		System.out.println("atrivutevalue is: " + value);

	}

	public void clearthetext() {
		inputElement.clearthetextElement.clear();

	}

	public void confirmeditfieldisdisabledIsenbled() {
		boolean isenbled = inputElement.confirmeditfieldisdisabledElement.isEnabled();
		System.out.println("is it enbled " + isenbled);

	}

	public void Confirmtextisreadonly() {
		String value = inputElement.ConfirmtextisreadonlyElement.getAttribute("value");
		System.out.println("value: " + value);

	}

}
