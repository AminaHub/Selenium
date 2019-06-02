package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TastCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.syntaxtechs.com");
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		String title = driver.getTitle();
		if(title.contains("Syntax")) {
			System.out.println("title contains Syntax");
		}
		else
		{
			System.out.println("title does not contain Syntax");
		}	
		

	}

}
