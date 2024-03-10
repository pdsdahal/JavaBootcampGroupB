package com.bootcam.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocateByUsingXPath {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		//register 
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		
		String actualPageTitle =  driver.getTitle();
		System.out.println("Actual Title : "+actualPageTitle);
		
		
		//Absolute XPath : FirstName
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[1]/div[2]/div/input")).sendKeys("Qa Automation");
	
		
		//Relative XPath : LastNAme
		driver.findElement(By.xpath("//div[@class=\"col-sm-10\"]/input[@placeholder=\"Last Name\"]")).sendKeys("Web Automation");
		
		//Attribute base XPath
		driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys("webautomation@gmail.com");
		
		
		//access the text value from the web element
		String actualMessage  = driver.findElement(By.xpath("//h1[@class=\"page-title h3\"]")).getText();
		String expectedMesssage = "Register Account";
		System.out.println("Actual Message : "+actualMessage);
		
		
		// Partial XPath Text base locator
		
		 WebElement webElmIfAl =  driver.findElement(By.xpath("//p[contains(text(), 'I')]"));
		 
		 // 
		 boolean resultDisplayed =  webElmIfAl.isDisplayed();
		 boolean resultEnable =  webElmIfAl.isEnabled();
		 
		 System.out.println("enable : "+resultEnable);
		 System.out.println("Diplay Check : "+resultDisplayed);
		 
		 
		 String actualText = webElmIfAl.getText();
		 
		 System.out.println("Actual Message : "+actualText);
		 
	
		 //Sibling based XPath
		 
		 driver.findElement(By.xpath("//label[@for=\"input-confirm\"]/following-sibling::div/input")).sendKeys("Admin1234");
		
		
	}
}
