package com.letcode.in_Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.letcode.in_Lib.AppLib;

public class BaseTest {
	WebDriver driver;
	AppLib applib;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		applib = new AppLib(driver);
		

	}

	@AfterClass
	public void tearUp() {
		// driver.quit();

	}
	
	
	public AppLib app() {
		return applib;
		
		
	}

}
