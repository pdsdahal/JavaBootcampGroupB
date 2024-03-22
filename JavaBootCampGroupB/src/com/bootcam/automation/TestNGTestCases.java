package com.bootcam.automation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTestCases {
	
	WebDriver driver ;
	
	@BeforeMethod
	public void setUpDriver() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		
		driver = new ChromeDriver(chromeOptions);
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
	}
	
	@Test(priority = 1)
	public void TC_1_VerifyTitle() {
		assertEquals(driver.getTitle(), "Register Account");
	}
	
	//TC2 - Ensure all the components of Register page are visible
	@Test(priority = 2)
	public void TC_2_ensureAllTheWebComponentOfRegisterPageIsVisible() {
		
		WebElement webElmH1Tag = driver.findElement(By.tagName("h1"));
		assertEquals(webElmH1Tag.isDisplayed(), true);
		assertEquals(webElmH1Tag.getText(), "Register Account");
	}
	
	@Test(priority = 3, dependsOnMethods = "TC_2_ensureAllTheWebComponentOfRegisterPageIsVisible")
	public void TC_3_VeifyContinueBtnWithOutEnteringAnyDetailsInRegister() {
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		WebElement webElmAlertInline =  driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger')]"));
	
		assertEquals(webElmAlertInline.isDisplayed(), true);
		assertEquals(webElmAlertInline.getText(), "Warning: You must agree to the Privacy Policy!");
		
	}
	
	
	
	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}

}
