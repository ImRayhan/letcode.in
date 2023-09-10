package com.letcode.in_Data;

import org.testng.annotations.DataProvider;

public class Data_letcode {

	@DataProvider(name = "drop")
	public Object[][] dataProvider() {

		Object[][] data = { { "https://letcode.in/dropable" } };

		return data;

	}

	@DataProvider(name = "short")
	public Object[][] shortData() {

		Object[][] data = { { "https://letcode.in/sortable" } };

		return data;

	}

}
