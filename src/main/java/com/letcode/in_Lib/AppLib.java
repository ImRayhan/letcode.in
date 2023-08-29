package com.letcode.in_Lib;

import org.openqa.selenium.WebDriver;

public class AppLib {

	WebDriver driver;
	FlowLib flow;
	PageLib pages;

	public AppLib(WebDriver driver) {
		this.driver = driver;
		flow = new FlowLib(driver);
		pages = new PageLib(driver);
	}

	public FlowLib flow() {
		return flow;

	}

	public PageLib pages() {
		return pages;

	}

}
