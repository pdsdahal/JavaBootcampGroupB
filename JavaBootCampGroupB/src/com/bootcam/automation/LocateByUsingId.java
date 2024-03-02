package com.bootcam.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocateByUsingId {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		
		
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		//register 
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
	
		driver.findElement(By.id("input-firstname")).sendKeys("Ram");
		
		driver.findElement(By.id("input-lastname")).sendKeys("Todd");
	}
}
