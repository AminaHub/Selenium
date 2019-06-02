package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1a {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("703-505-9087");
		//driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Smith");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Ahface2019$&");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Thread.sleep(2000);

	}

}
