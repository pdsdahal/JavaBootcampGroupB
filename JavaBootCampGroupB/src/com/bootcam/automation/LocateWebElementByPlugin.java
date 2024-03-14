package com.bootcam.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocateWebElementByPlugin {
	
	
	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(chromeOptions);

		// login
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Qa Autoamtion");
		

		
	}
}
