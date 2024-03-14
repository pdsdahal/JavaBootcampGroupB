package com.bootcam.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocateByUsingName {
	
	
	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(chromeOptions);

		// login
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");

		// name attribute
		WebElement webElmEmailField = driver.findElement(By.name("email"));
		webElmEmailField.sendKeys("apple@gmail.com");

		WebElement wevElmPasswordField = driver.findElement(By.name("password"));
		wevElmPasswordField.sendKeys("Admin123");

		WebElement webElmSubmitBtn = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		webElmSubmitBtn.click();

	}
}
