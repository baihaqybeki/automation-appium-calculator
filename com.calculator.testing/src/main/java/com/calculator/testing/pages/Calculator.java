package com.calculator.testing.pages;


import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	
	private AndroidDriver<MobileElement> driver;
	
	public Calculator(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	//Locator
	By btnSatu = By.id("com.google.android.calculator:id/digit_1");
	By btnDua = By.id("com.google.android.calculator:id/digit_2");
	By btnTiga = By.id("com.google.android.calculator:id/digit_3");
	By btnEmpat = By.id("com.google.android.calculator:id/digit_4");
	By btnLima = By.id("com.google.android.calculator:id/digit_5");
	By btnEnam = By.id("com.google.android.calculator:id/digit_6");
	By btnTujuh = By.id("com.google.android.calculator:id/digit_7");
	By btnDelapan = By.id("com.google.android.calculator:id/digit_8");
	By btnSembilan = By.id("com.google.android.calculator:id/digit_9");
	By btnNol = By.id("com.google.android.calculator:id/digit_0");
	By btnKurang = By.id("com.google.android.calculator:id/op_sub");
	By btnKali = By.id("com.google.android.calculator:id/op_mul");
	By btnBagi = By.id("com.google.android.calculator:id/op_div");
	By btnSamaDengan = By.id("com.google.android.calculator:id/eq");
	By hasil = By.id("com.google.android.calculator:id/result_final");
	/* web: xpath = //taghtml[contains(@attr, value)] */
	
	//Method
	public void calcMinus(int firstNmbr, int scndNmbr) {
		switch(firstNmbr) {
		case 1 :
			driver.findElement(btnSatu).click();
			break;
		case 2 :
			driver.findElement(btnDua).click();
			break;
		case 3 :
			driver.findElement(btnTiga).click();
			break;
		case 4 :
			driver.findElement(btnEmpat).click();
			break;
		case 5 :
			driver.findElement(btnLima).click();
			break;
		case 6 :
			driver.findElement(btnEnam).click();
			break;
		case 7 :
			driver.findElement(btnTujuh).click();
			break;
		case 8 :
			driver.findElement(btnDelapan).click();
			break;
		case 9 :
			driver.findElement(btnSembilan).click();
			break;
		case 0 :
			driver.findElement(btnNol).click();
			break;
		default :
			driver.close();
		}
		
		driver.findElement(btnKurang).click();
		
		switch(scndNmbr) {
		case 1 :
			driver.findElement(btnSatu).click();
			break;
		case 2 :
			driver.findElement(btnDua).click();
			break;
		case 3 :
			driver.findElement(btnTiga).click();
			break;
		case 4 :
			driver.findElement(btnEmpat).click();
			break;
		case 5 :
			driver.findElement(btnLima).click();
			break;
		case 6 :
			driver.findElement(btnEnam).click();
			break;
		case 7 :
			driver.findElement(btnTujuh).click();
			break;
		case 8 :
			driver.findElement(btnDelapan).click();
			break;
		case 9 :
			driver.findElement(btnSembilan).click();
			break;
		case 0 :
			driver.findElement(btnNol).click();
			break;
		default :
			driver.close();
		}
		
		driver.findElement(btnSamaDengan).click();
		
		
	}
	
	public void calcDiv(int firstNmbr, int scndNmbr) {
		switch(firstNmbr) {
		case 1 :
			driver.findElement(btnSatu).click();
			break;
		case 2 :
			driver.findElement(btnDua).click();
			break;
		case 3 :
			driver.findElement(btnTiga).click();
			break;
		case 4 :
			driver.findElement(btnEmpat).click();
			break;
		case 5 :
			driver.findElement(btnLima).click();
			break;
		case 6 :
			driver.findElement(btnEnam).click();
			break;
		case 7 :
			driver.findElement(btnTujuh).click();
			break;
		case 8 :
			driver.findElement(btnDelapan).click();
			break;
		case 9 :
			driver.findElement(btnSembilan).click();
			break;
		case 0 :
			driver.findElement(btnNol).click();
			break;
		}
		
		driver.findElement(btnBagi).click();
		
		switch(scndNmbr) {
		case 1 :
			driver.findElement(btnSatu).click();
			break;
		case 2 :
			driver.findElement(btnDua).click();
			break;
		case 3 :
			driver.findElement(btnTiga).click();
			break;
		case 4 :
			driver.findElement(btnEmpat).click();
			break;
		case 5 :
			driver.findElement(btnLima).click();
			break;
		case 6 :
			driver.findElement(btnEnam).click();
			break;
		case 7 :
			driver.findElement(btnTujuh).click();
			break;
		case 8 :
			driver.findElement(btnDelapan).click();
			break;
		case 9 :
			driver.findElement(btnSembilan).click();
			break;
		case 0 :
			driver.findElement(btnNol).click();
			break;
		}
		
	driver.findElement(btnSamaDengan).click();
		
		
	}
	
	public void calcMultiplied(int firstNmbr, int scndNmbr) {
		switch(firstNmbr) {
		case 1 :
			driver.findElement(btnSatu).click();
			break;
		case 2 :
			driver.findElement(btnDua).click();
			break;
		case 3 :
			driver.findElement(btnTiga).click();
			break;
		case 4 :
			driver.findElement(btnEmpat).click();
			break;
		case 5 :
			driver.findElement(btnLima).click();
			break;
		case 6 :
			driver.findElement(btnEnam).click();
			break;
		case 7 :
			driver.findElement(btnTujuh).click();
			break;
		case 8 :
			driver.findElement(btnDelapan).click();
			break;
		case 9 :
			driver.findElement(btnSembilan).click();
			break;
		case 0 :
			driver.findElement(btnNol).click();
			break;
		}
		
		driver.findElement(btnKali).click();
		
		switch(scndNmbr) {
		case 1 :
			driver.findElement(btnSatu).click();
			break;
		case 2 :
			driver.findElement(btnDua).click();
			break;
		case 3 :
			driver.findElement(btnTiga).click();
			break;
		case 4 :
			driver.findElement(btnEmpat).click();
			break;
		case 5 :
			driver.findElement(btnLima).click();
			break;
		case 6 :
			driver.findElement(btnEnam).click();
			break;
		case 7 :
			driver.findElement(btnTujuh).click();
			break;
		case 8 :
			driver.findElement(btnDelapan).click();
			break;
		case 9 :
			driver.findElement(btnSembilan).click();
			break;
		case 0 :
			driver.findElement(btnNol).click();
			break;
		}
		
		driver.findElement(btnSamaDengan).click();
	}
	
	
	public String getTxtResult() {
		return driver.findElement(hasil).getText();
	}
	
	
	
}
