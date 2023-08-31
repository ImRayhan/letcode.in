package com.letcode.in_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.letcode.in_Elements.RadioAndCheckbox_Elements;

public class RadioButton_Page {

	WebDriver driver;
	RadioAndCheckbox_Elements radioAndCheckboxElements;

	public RadioButton_Page(WebDriver driver) {
		this.driver = driver;
		radioAndCheckboxElements = new RadioAndCheckbox_Elements(driver);

	}

	public String openUrl() {
		return "https://letcode.in/test";

	}

	public void clickButton() {
		radioAndCheckboxElements.radioBuuttonElement.click();

	}

	public void radioButtonCheckbox() {
		radioAndCheckboxElements.selectAnyonElement.click();
		radioAndCheckboxElements.confirmYouCanSelectOneRadioButtonYesElement.click();
		radioAndCheckboxElements.confirmYouCanSelectOneRadioButtonNoElement.click();
		boolean check = radioAndCheckboxElements.confirmYouCanSelectOneRadioButtonYesElement.isSelected();
		System.out.println(check);
		radioAndCheckboxElements.findTheBugYesElement.click();
		radioAndCheckboxElements.findTheBugNoElement.click();
		boolean sel1 = radioAndCheckboxElements.findTheBugYesElement.isSelected();
		System.out.println("its an bug" + sel1);
		boolean sel2 = radioAndCheckboxElements.findTheBugNoElement.isSelected();
		System.err.println("its an bug" + sel2);
		boolean disbled = radioAndCheckboxElements.ConfirmlastfieldisdisabledElement.isEnabled();
		System.out.println("it is disbled" + disbled);
		boolean sh = radioAndCheckboxElements.findTheCheckboxSelectedOrNotElement.isSelected();
		System.out.println("it is selected " + sh);
		

	}

}
