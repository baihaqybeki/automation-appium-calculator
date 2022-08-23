package com.calculator.testing;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.calculator.testing.pages.Calculator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestCalculator {
	
	private static AndroidDriver<MobileElement> driver;
	private Calculator calculator;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Pixel_4_API_30");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appPackage","com.google.android.calculator");
		cap.setCapability("appActivity","com.android.calculator2.Calculator");
		cap.setCapability("noReset", true);
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	}
	
	@BeforeMethod
	public void pageObject() {
		calculator = new Calculator(driver);
	}
	
	@Test (priority = 1)
	public void testMinus() {
		calculator.calcMinus(8,4);
		String actual = calculator.getTxtResult();
		assertEquals(actual ,"4");
	}
	
	@Test (priority = 2)
	public void testDiv() {
		calculator.calcDiv(8,4);
		String actual = calculator.getTxtResult();
		assertEquals(actual ,"2");
	}
	
	@Test (priority = 3)
	public void testMultiple() {
		calculator.calcMultiplied(8,4);
		String actual = calculator.getTxtResult();
		assertEquals(actual ,"32");
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
}
