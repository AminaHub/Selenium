package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver1 = new ChromeDriver();
//		driver1.get("http://facebook.com");
//		WebDriver driver2 = new ChromeDriver();
//		driver1.get("http://amazon.com");
		
		System.setProperty("webdriver.gecko.driver","//C://Users//NZeki//Selenium//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		

	}

}
