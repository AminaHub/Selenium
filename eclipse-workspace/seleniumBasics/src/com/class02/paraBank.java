package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("bob");
		driver.findElement(By.name("customer.lastName")).sendKeys("tom");
		driver.findElement(By.id("customer.address.street")).sendKeys("123 street");
		driver.findElement(By.id("customer.address.city")).sendKeys("Reston");
		driver.findElement(By.id("customer.address.state")).sendKeys("VA");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("13456");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("324 676 7890");
		driver.findElement(By.id("customer.ssn")).sendKeys("234-678965");
		driver.findElement(By.id("customer.username")).sendKeys("AnyUser");
		driver.findElement(By.id("customer.password")).sendKeys("AnyPassword");
		driver.findElement(By.id("repeatedPassword")).sendKeys("AnyPassword");
		Thread.sleep(3000);
		driver.findElement(By.className("button")).click();
	}

}
