package com.letcode.in_Lib;


import org.openqa.selenium.WebDriver;

import com.letcode.in_Pages.ButtonClick_Page;
import com.letcode.in_Pages.Input_Page;
import com.letcode.in_Pages.RadioButton_Page;
import com.letcode.in_Pages.Select_Page;

public class PageLib {
	WebDriver driver;
	Input_Page inputPage;
	ButtonClick_Page buttonClickPage;
	Select_Page selectPage;
	RadioButton_Page radioButtonPage;

	public PageLib(WebDriver driver) {
		this.driver = driver;
		inputPage = new Input_Page(driver);
		buttonClickPage = new ButtonClick_Page(driver);
		selectPage = new Select_Page(driver);
		radioButtonPage = new RadioButton_Page(driver);
		
		

	}

	public Input_Page inputPage() {
		return inputPage;

	}

	public ButtonClick_Page buttonClickPage() {
		return buttonClickPage;

	}
	
	public Select_Page SelectPage() {
		return selectPage;
		
	}
	
	public RadioButton_Page radioButton() {
		return radioButtonPage;
		
	}

}
