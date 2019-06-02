package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
	//TC 1: Facebook login:Open chrome browser
	//Go to “https://www.facebook.com/”Enter valid username and valid password and 
	//click loginUser successfully logged in
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("703-505-9087");
		driver.findElement(By.name("pass")).sendKeys("Ahface2019$&");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		
		
//		driver.findElement(By.name("firstname")).sendKeys("Mina");
//		Thread.sleep(2000);
//		driver.findElement(By.name("lastname")).sendKeys("Smith");
//		driver.findElement(By.name("reg_email__")).sendKeys("mina19hoo@gmail.com");
//		driver.findElement(By.id("u_0_o")).sendKeys("Ahface2019$&");
//		driver.findElement(By.id("month")).sendKeys("May");
//		driver.findElement(By.id("day")).sendKeys("14");
//		driver.findElement(By.id("year")).sendKeys("1994");
//		driver.findElement(By.className("_58mt")).click();
//		driver.findElement(By.name("websubmit")).click();

	}

}
