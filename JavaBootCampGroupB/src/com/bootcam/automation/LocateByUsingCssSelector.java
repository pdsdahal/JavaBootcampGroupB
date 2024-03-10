package com.bootcam.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocateByUsingCssSelector {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		//register 
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		
		
		//tag based 
	 	WebElement webElmRegisterH1 =  driver.findElement(By.cssSelector("h1"));
	 	String actualMessageH1 =  webElmRegisterH1.getText();
	 	System.out.println("Actul Message of H1 tag : "+actualMessageH1);
	 	
		//Id based css selector
	 	driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Qa Automation");
		
	 	
	 	//class based locator
	 	List<WebElement> webElmsList = driver.findElements(By.cssSelector(".col-sm-2.col-form-label"));
	 	WebElement webElmLbl =  webElmsList.get(4);
 		String actualLabelText = webElmLbl.getText();
 		System.out.println("Actual Value of label : "+actualLabelText);
	 
//	 	for(int i=0;i<webElmsList.size();i++) {
//	 		
//	 	}
	 	
		//attribute based css selector 
 		driver.findElement(By.cssSelector("[id=\"input-password\"]")).sendKeys("123456789");
 		
 		
 		// child based selector 
 		driver.findElement(By.cssSelector(".col-sm-10 > [id=\"input-telephone\"]")).sendKeys("123456789");
		
	}
}
