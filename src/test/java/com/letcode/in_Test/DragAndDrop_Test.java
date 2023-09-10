package com.letcode.in_Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.letcode.in_Data.Data_letcode;

public class DragAndDrop_Test extends BaseTest {

	// dragAnfDropXML to test
	@Parameters("dragData")
	@Test
	public void verifyDraging(String dragDta) {
		app().flow().getUrl(app().pages().dragPage().openUrl(dragDta));
		app().pages().dragPage().dragDrop();

	}

	// i put this data in separate package com.letcode.in_Data

//	@DataProvider(name = "dataDrop") 
//	public Object[][] dataProvider() {
//
//		Object[][] data = { { "https://letcode.in/dropable" } };
//
//		return data;
//
//	}

	@Test(dataProvider = "drop", dataProviderClass = Data_letcode.class)
	public void verifyingDrop(String url) {
		app().flow().getUrl(app().pages().dragPage().openUrl(url));
		app().pages().dragPage().drop();

	}

}
