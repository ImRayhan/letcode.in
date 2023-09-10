package com.letcode.in_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.letcode.in_Elements.Short_Element;

public class Short_Page {

	WebDriver driver;
	Short_Element shortElement;

	public Short_Page(WebDriver driver) {
		this.driver = driver;
		shortElement = new Short_Element(driver);

	}
	
	public String openUrl(String url) {
		return url;
		
	}

	public void todo() throws InterruptedException {
		Actions ac = new Actions(driver);
		
		//ac.clickAndHold(shortElement.clickHoldElement).build().perform();
	//	ac.clickAndHold(shortElement.clickHoldElement).build().perform();
//		ac.release(shortElement.realeseHoldElement).build().perform();
	//	ac.moveToElement(shortElement.clickHoldElement).clickAndHold().perform();
		ac.clickAndHold(shortElement.clickHoldElement).perform();
		Thread.sleep(2000);
		
		ac.moveToElement(null).build().perform();
		
		//	ac.moveByOffset(500, 300).build().perform();
		
		
		
		
		
	
	
		
		
		


	}

}
