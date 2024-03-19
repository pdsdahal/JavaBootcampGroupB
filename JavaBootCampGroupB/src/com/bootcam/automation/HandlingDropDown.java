package com.bootcam.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	
	
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=product/manufacturer/info&manufacturer_id=8");

		
		WebElement webElmSelectShow = driver.findElement(By.xpath("(//select[@class='custom-select'])[1]"));
		Select select = new Select(webElmSelectShow);
		select.selectByVisibleText("75");
		
		
		WebElement webElmSelectSortBy = driver.findElement(By.xpath("(//select[@class='custom-select'])[2]"));
		Select selectSortyBy = new Select(webElmSelectSortBy);
		selectSortyBy.selectByIndex(3);
		
		
		WebElement webElmAllCateogries = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		webElmAllCateogries.click();
		
		
		List<WebElement> webElms = driver.findElements(By.xpath("(//a[@class='dropdown-item'])"));
		WebElement webElmMP3Players = webElms.get(8);
		webElmMP3Players.click();
		
		
		
		
		
	}
}
