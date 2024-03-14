package com.bootcam.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingAlert {
	
	
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(chromeOptions);

		// login
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		WebElement webElmSignInBtn =  driver.findElement(By.xpath("//input[@value='Sign in']"));
		webElmSignInBtn.click();
		
		
		//switch
		Alert logInAlert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		String actualText = logInAlert.getText();
		System.out.println("Actual : "+actualText);
		
		logInAlert.accept();

		
	}
}
