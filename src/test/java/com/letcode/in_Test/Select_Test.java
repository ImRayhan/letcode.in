package com.letcode.in_Test;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class Select_Test extends BaseTest {

	@Test(groups = "regression")
	public void verifyingvisibletext() {
		app().flow().getUrl(app().pages().SelectPage().openUrl());
		app().pages().SelectPage().clickOnSelect();
		app().pages().SelectPage().Selecttheappleusingvisibletext("Apple");

		if (!app().pages().SelectPage().YouhaveselectedApple().equals("You have selected Apple")) {
			fail("the selected text dosnt apear");

		}

	}
	
	
	@Test(groups = "regression")
	public void verifyingSuperHeros() {
		app().flow().getUrl(app().pages().SelectPage().openUrl());
		app().pages().SelectPage().clickOnSelect();
		app().pages().SelectPage().Selectyoursuperheros();
		
	}
	
	@Test(groups = "regression")
	public void verifyingselectLastPrograme() {
		app().flow().getUrl(app().pages().SelectPage().openUrl());
		app().pages().SelectPage().clickOnSelect();
		app().pages().SelectPage().selectthelastprogramminglanguageandprintalltheoptions();
		
		
		
	}
	
	

}
