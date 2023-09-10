package com.letcode.in_Test;

import org.testng.annotations.Test;

import com.letcode.in_Data.Data_letcode;

public class ShortData_Test extends BaseTest {

	@Test(dataProviderClass = Data_letcode.class, dataProvider = "short")
	public void verifyinghShortData(String url) throws InterruptedException {
		app().flow().getUrl(app().pages().shortPage().openUrl(url));
		app().pages().shortPage().todo();
	}

}
