package com.letcode.in_Lib;

import org.openqa.selenium.WebDriver;

public class FlowLib {

	private WebDriver driver;

	public FlowLib(WebDriver driver) {
		this.driver = driver;

	}

	public void getUrl(String url) {
		driver.get(url);

	}
	
	public String currentUrl() {
		return driver.getCurrentUrl();

	}

	public String currentTitle() {
		return driver.getTitle();

	}
	public void back() {
		driver.navigate().back();
		
	}
	public void forword() {
		driver.navigate().forward();
		
	}

}
