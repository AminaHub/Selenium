package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[contains(@class,'btn')]")).click();

	}

}
