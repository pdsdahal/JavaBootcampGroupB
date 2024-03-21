package com.bootcam.automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDiscussion {
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("From @BeforeMethod");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("From @AfterMethod");
	}
	
	
	@Test
	public void tc_1() {
		System.out.println("From Test annotation tc-1");
	}
	
	@Test
	public void tc_2() {
		System.out.println("From Test annotation tc-2");
	}
	
	
// @BeforeTest @Test @AfterTest -- First Way
// @BeforeTest @BeforeMethod @Test @AfterMethod @AfterTest	-- Way
// @BeforeTest @BeforeClass @BeforeMethod @Test @AfterMethod @AfterClass @AfterTest	-- Third Way
	

}
