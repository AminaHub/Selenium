package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTC2 {

	public static void main(String[] args) throws InterruptedException {
		//Arif Rasmi (Instructor) [9:37 PM]TC 1: 
		//Mercury Tours Registration:Open chrome browserGo to 
		//“http://newtours.demoaut.com/”Click on Register 
		//LinkFill out all required infoClick SubmitUser successfully registered
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Anna");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Smith");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("111-111-1111");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("asmith@gmail.com");
		
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("abs street");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Ashburn");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Va");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("29108");
		//driver.findElement(By.cssSelector("input[name='country']")).sendKeys("UNITED STATES");
		driver.findElement(By.cssSelector("input#email")).sendKeys("123A");
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name='register']")).click();
		Thread.sleep(3000);
	}

}
