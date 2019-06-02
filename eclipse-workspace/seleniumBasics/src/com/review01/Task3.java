package com.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {
//Navigate to facebook and sign up will all fields needed, but you dont need to click sign up
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys("ABC");
		driver.findElement(By.name("lastname")).sendKeys("GEFD");
		
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("aminahanunun@yahoo.com");
		driver.findElement(By.cssSelector("input[data-type='password']")).sendKeys("1234");
		WebElement months=driver.findElement(By.cssSelector("select[id='month']"));
		Select month=new Select(months);
		month.selectByVisibleText("Oct");
		WebElement days=driver.findElement(By.cssSelector("select[id='day']"));
		Select day=new Select(days);
		day.selectByIndex(5);
		
		WebElement years=driver.findElement(By.cssSelector("select[id='year']"));
		Select year=new Select(years);
		year.selectByIndex(5);
		
	}

}
