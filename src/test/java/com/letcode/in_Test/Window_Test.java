package com.letcode.in_Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Window_Test extends BaseTest {
	
	
	
	@Test
	public void verifyingWindow() {
		
		app().flow().getUrl(app().pages().window().openUrl());
		app().pages().window().clickWindow();
		app().pages().window().windowHandle();
	
		
	}
	
	@Test
	public void verifyingMultiwindow() {
		app().flow().getUrl(app().pages().window().openUrl());
		app().pages().window().clickWindow();	
	   app().pages().window().multiWindow();
		
	}

}
