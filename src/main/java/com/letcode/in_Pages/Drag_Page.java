package com.letcode.in_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.letcode.in_Elements.DragAndDrop_Elements;

public class Drag_Page {

	WebDriver driver;
	DragAndDrop_Elements dragAndDropElements;

	public Drag_Page(WebDriver driver) {
		this.driver = driver;
		dragAndDropElements = new DragAndDrop_Elements(driver);

	}

	public String openUrl(String url) {
		return url;

	}

	public void dragDrop() {
		Actions ac = new Actions(driver);
		ac.dragAndDropBy(dragAndDropElements.dragElement, -2, 198).build().perform();

	}

	public void drop() {
		Actions act = new Actions(driver);
		act.dragAndDrop(dragAndDropElements.dropPickElement, dragAndDropElements.dropRealeaseElement).build().perform();
	}

}
