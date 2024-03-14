package com.bootcam.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandlingAttachSlider {
	
	
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(chromeOptions);

	
		driver.navigate().to("https://www.hyperlinkinfosystem.com/contact.html");
		
		
		//Image
		WebElement webElmChooseFile =  driver.findElement(By.id("files_doc"));
		webElmChooseFile.sendKeys("/Users/sdahal/Pictures/board_question_paper_csit.jpg");
		
		
		Thread.sleep(4000);
		
		//slider
		WebElement webElmKnobSlider = driver.findElement(By.xpath("//span[@class='irs-slider single']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(webElmKnobSlider, 100, 0).build().perform();
		
		
		

		
	}
}
