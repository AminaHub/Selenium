package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
	//TC 2: Swag Labs Negative login:
	//Open chrome browserGo to “https://www.saucedemo.com/”
	//Enter invalid username and password and click login
	//Verify error message contains: “Username and password do not match any user in this service”
	public static void main(String[] args) {
		
		String userName="test";
		String password="anyPass"
				+ "";
		
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//login to the application
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys(password);
		driver.findElement(By.xpath("//input[starts-with(@class,'btn')]")).click();
		
		

	}

}
