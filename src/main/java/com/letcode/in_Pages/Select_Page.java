package com.letcode.in_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.letcode.in_Elements.Select_Elements;

public class Select_Page {

	WebDriver driver;
	Select_Elements selectElements;

	public Select_Page(WebDriver driver) {

		selectElements = new Select_Elements(driver);

	}

	public String openUrl() {
		return "https://letcode.in/test";

	}

	public void clickOnSelect() {
		selectElements.selectElement.click();

	}

	public void Selecttheappleusingvisibletext(String text) {

		Select sel = new Select(selectElements.Selecttheappleusingvisibletext);
		sel.selectByVisibleText(text);

	}

	public String YouhaveselectedApple() {
		return selectElements.YouhaveselectedApple.getText();

	}

	public void Selectyoursuperheros() {
		Select sel = new Select(selectElements.Selectyoursuperhero);
		if (sel.isMultiple()) {
			sel.selectByValue("aq");

		}

	}

	public void selectthelastprogramminglanguageandprintalltheoptions() {

		List<WebElement> all = selectElements.selectthelastprogramminglanguageandprintalltheoptionsElement;

		for (WebElement webElement : all) {
			String allElements = webElement.getText();
			System.out.println(allElements);
			if (allElements.equalsIgnoreCase("C#")) {

				Select sel = new Select(selectElements.selectthelastprogram);
				System.out.println(sel.getOptions());
				sel.selectByIndex(4);
				System.out.println(sel.getFirstSelectedOption().getText());
				break;

			}

		}

	}

}
