package com.letcode.in_Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InputPage_Test extends BaseTest {

	@Test
	public void verifyingInputField() {
		app().flow().getUrl(app().pages().inputPage().openUrl());
		app().pages().inputPage().ClickInputEdit();
		app().pages().inputPage().enterYourFullName("Rayhan Chowdhury");
		app().pages().inputPage().appendatextandpreskeyboardtabe();
		app().pages().inputPage().whatisinsidethetextboxValue();
		app().pages().inputPage().clearthetext();
		app().pages().inputPage().confirmeditfieldisdisabledIsenbled();
		app().pages().inputPage().Confirmtextisreadonly();

		if (!app().flow().currentUrl().equalsIgnoreCase("https://letcode.in/edit")) {
			AssertJUnit.fail();
		}
		String actualtitle = "Interact with Input fields";
		AssertJUnit.assertEquals(app().flow().currentTitle(), actualtitle);

	}

}
