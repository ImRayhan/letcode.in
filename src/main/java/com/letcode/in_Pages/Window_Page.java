package com.letcode.in_Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import com.letcode.in_Elements.Window_Elements;

public class Window_Page {

	WebDriver driver;
	Window_Elements windowElements;

	public Window_Page(WebDriver driver) {
		this.driver = driver;
		windowElements = new Window_Elements(driver);

	}

	public String openUrl() {
		return "https://letcode.in/test";

	}

	public void clickWindow() {
		windowElements.windowElement.click();

	}

	public void windowHandle() {
		String parentW = driver.getWindowHandle();
		windowElements.openHomePageElement.click();
		Set<String> childW = driver.getWindowHandles();

		for (String string : childW) {
			if (!parentW.equals(string)) {
				driver.switchTo().window(string);

			}

		}

		System.out.println(driver.getCurrentUrl());

	}

	public void multiWindow() {

		String parent = driver.getWindowHandle();
		windowElements.multiWindowElement.click();
		Set<String> child = driver.getWindowHandles();
		//System.out.println(driver.getTitle());

//		for (String string : child) {
//			driver.switchTo().window(string);
//			System.out.println(driver.getTitle());
//
//		}

		List<String> mult = new ArrayList<String>(child);
		driver.switchTo().window(mult.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(mult.get(0));
		System.out.println(driver.getCurrentUrl());
	}

}
