package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) throws InterruptedException {
		//TC 1: Swag Labs Positive login:
		//Open chrome browserGo to 
		//“https://www.saucedemo.com/”Enter valid username and valid password and click 
		//login
		//Verify robot icon is displayed
		//Verify “Products” text is available next 
		//to the robot icon
		
		String userName="standard_user";
		String password="secret_sauce";
		
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//login to the application
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys(password);
		driver.findElement(By.xpath("//input[starts-with(@class,'btn')]")).click();
		
		//logo display verification
		boolean logo= driver.findElement(By.xpath("//div[@class='peek']")).isDisplayed();
		if (logo) {
			System.out.println("Robo Icon is displayed");
		} else {
			System.out.println("Robo icon is NOT displayed");
		}
		Thread.sleep(2000);
	
		//Products word display
		WebElement products = driver.findElement(By.xpath("//div.product_label"));
		boolean displayP=products.isDisplayed();
		String value=products.getText();
		
		String expectedText="Products";
		
		if (displayP && value.equals(expectedText)) {
			System.out.println("Products word is displayed");
		} else {
			System.out.println("Products word is NOT displayed");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
