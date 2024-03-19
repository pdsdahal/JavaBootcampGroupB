package com.bootcam.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingRadioButton {
	
	
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		
		//radio button
		WebElement webElmRdBtnYes =  driver.findElement(By.xpath("//label[text()='Yes']"));
		webElmRdBtnYes.click();
		
		
		//checkbox
		WebElement webElmCheckBoxAgree =  driver.findElement(By.xpath("//label[@for='input-agree']"));
		webElmCheckBoxAgree.click();
		
		//btn
		WebElement webElmSubmitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		webElmSubmitBtn.click();
		
		
	}
}
