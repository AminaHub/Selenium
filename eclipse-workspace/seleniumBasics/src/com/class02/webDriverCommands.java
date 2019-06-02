package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("google")) {
			System.out.println("this is the right title");
		}
		else
		{
			System.out.println("sorry this is not the title");
		}	
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://facebook.com");
		System.out.println(driver1.getTitle());
		String title2 = driver1.getTitle();
		if(title2.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
			System.out.println("this is the right title");
		}
		else
		{
			System.out.println("sorry this is not the title");
		}	
		

	}

}
