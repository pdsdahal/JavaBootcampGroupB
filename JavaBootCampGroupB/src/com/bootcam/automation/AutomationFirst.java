package com.bootcam.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomationFirst {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(chromeOptions);

		// home
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");

		// register
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");

// home
//		driver.navigate().back();
//		
//		//register
//		driver.navigate().forward();

		Thread.sleep(5000);

		// driver.close();

		driver.quit();

	}

}
