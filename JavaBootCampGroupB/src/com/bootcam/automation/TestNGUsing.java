package com.bootcam.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGUsing {

	WebDriver driver;

	@BeforeMethod
	public void setUpDriver() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
	}
	
	@Test
	public void checkFirstName() {
		WebElement webElmFirstName = driver.findElement(By.id("input-firstname"));
		boolean result =  webElmFirstName.isDisplayed();
		System.out.println("Actual Result : "+result);
		
	}

	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}
}
