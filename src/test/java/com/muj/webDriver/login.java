package com.muj.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class login {
public static WebDriver driver;
@BeforeSuite
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaik Mujahed\\Desktop\\chromedriver98\\chromedriver\\chromedriver.exe");
	
	driver= new ChromeDriver();
	
}
@Test
public void google() {
	driver.get("http://google.com");
	System.out.println(driver.getCurrentUrl());
	
}
@AfterSuite
public void tearDown() {
	driver.quit();
	
}
}
