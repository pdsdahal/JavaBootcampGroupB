package com.bootcam.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocateByUsingClass {
	
	
	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(chromeOptions);

		// login
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");

		//using className
		List<WebElement> lstWebElmsLoginPage =  driver.findElements(By.className("form-control"));
		
		WebElement webElmEmail =  lstWebElmsLoginPage.get(0);
		webElmEmail.sendKeys("ball@gmail.com");
		
		WebElement webElmPassword =  lstWebElmsLoginPage.get(1);
		webElmPassword.sendKeys("23456789");
		
		
		List<WebElement> webElmsBtn =  driver.findElements(By.className("//input[@class=\"btn btn-primary\"]"));
		System.out.println("size : "+webElmsBtn.size());
		
		
		List<WebElement> webElements =  driver.findElements(By.tagName("h2"));
		WebElement webElmRetunCu =  webElements.get(1);
		
		System.out.println("Actual Text : "+webElmRetunCu.getText());
		
		
		driver.findElement(By.linkText("Blog")).click();
		
		
	}
}
