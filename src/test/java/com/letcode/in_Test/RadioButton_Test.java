package com.letcode.in_Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class RadioButton_Test extends BaseTest {

	@Test
	public void verifyingRadioButton() {

		app().flow().getUrl(app().pages().radioButton().openUrl());
		app().pages().radioButton().clickButton();
		app().pages().radioButton().radioButtonCheckbox();

	}

}
