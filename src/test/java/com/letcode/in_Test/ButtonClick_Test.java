package com.letcode.in_Test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonClick_Test extends BaseTest {

	@Test(groups = "a")
	public void veryFyingButtonOnHomePageHowTallFatButton() {
		app().flow().getUrl(app().pages().buttonClickPage().openUrl());
		app().pages().buttonClickPage().clickButtonClick();
		app().pages().buttonClickPage().findtheheightwidthofthebutton();
		String expectedButtonText = app().pages().buttonClickPage().howTallAndFatIamTextVerify();
		String actuallButtonText = "How tall & fat I am?";
		AssertJUnit.assertEquals(expectedButtonText, actuallButtonText);
		String actualldUrl = "https://letcode.in/buttons";
		String expectedUrl = app().flow().currentUrl();
		String actuallTitle = "Interact with Button fields";
		String expectedTitle = app().flow().currentTitle();
		if (!actualldUrl.equals(expectedUrl)) {
			Assert.fail("url dosnt match");

		} else if (!actuallTitle.equals(expectedTitle)) {
			Assert.fail("title dosnt match");

		}

	}

	@Test(groups = "regression")
	public void veryfingGotoHomeButton() {
		app().flow().getUrl(app().pages().buttonClickPage().openUrl());
		app().pages().buttonClickPage().clickButtonClick();
		app().pages().buttonClickPage().ClickgotoHome();
		String CurrentnavigateBackUrl = "https://letcode.in/";
		String expectedUrlNav = app().flow().currentUrl();
		String actualldUrl = "https://letcode.in/buttons";
		String actuallTitle = "Interact with Button fields";
		String expectedTitle = app().flow().currentTitle();
		if (CurrentnavigateBackUrl.equals(expectedUrlNav)) {
			app().flow().back();

		} else if (!expectedTitle.equals(actuallTitle)) {
			Assert.fail("title dosnt match");

		} else {
			Assert.fail("dosnt gone througth the page expected");
		}
		String expectedUrl = app().flow().currentUrl();
		AssertJUnit.assertEquals(actualldUrl, expectedUrl);
		AssertJUnit.assertEquals(app().pages().buttonClickPage().buttonTextVerify(), "Button");

	}

	@Test(groups = "regression")
	public void buttonHoldVerify() throws InterruptedException {
		app().flow().getUrl(app().pages().buttonClickPage().openUrl());
		app().pages().buttonClickPage().clickButtonClick();
		app().pages().buttonClickPage().ClickandHoldButton();
		String actualldUrl = "https://letcode.in/buttons";
		String expectedUrl = app().flow().currentUrl();
		String actuallTitle = "Interact with Button fields";
		String expectedTitle = app().flow().currentTitle();
		if (!actualldUrl.equals(expectedUrl)) {
			Assert.fail("url dosnt match");

		} else if (!actuallTitle.equals(expectedTitle)) {
			Assert.fail("title dosnt match");

		}

	}

	@Test(groups = "regression")
	public void didbleButton() {

		app().flow().getUrl(app().pages().buttonClickPage().openUrl());
		app().pages().buttonClickPage().clickButtonClick();
		boolean isenbled = app().pages().buttonClickPage().Confirmbuttonisdisabled();
		if (isenbled) {
			Assert.fail("button enbled");

		}
		String actualldUrl = "https://letcode.in/buttons";
		String expectedUrl = app().flow().currentUrl();
		AssertJUnit.assertEquals(actualldUrl, expectedUrl);
		AssertJUnit.assertEquals(app().pages().buttonClickPage().buttonTextVerify(), "Button");

	}

	@Test
	public void verifyingHoldButton() {
		
		applib.flow().getUrl(applib.pages().buttonClickPage().openUrl());
		applib.pages().buttonClickPage().clickButtonClick();
		applib.pages().buttonClickPage().ClickandHoldButton();	
		AssertJUnit.assertEquals(app().flow().currentUrl(), "https://letcode.in/buttons");
		AssertJUnit.assertEquals(app().flow().currentTitle(), "Interact with Button fields");

	}

}
