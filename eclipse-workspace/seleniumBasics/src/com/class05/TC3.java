package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {
	//TC 1: Amazon link count:
	//Open chrome browserGo to “https://www.amazon.com/”
	//Using Iterator 
	//get text of each link
	//Get number of links that has text
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		int count=0;
		
		Iterator<WebElement> iterator = links.iterator();
		while(iterator.hasNext()) {
			WebElement num=iterator.next();
			String linkText=num.getText();
			if (!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
			}
		}	
		
		System.out.println("Total number of links with text "+count);
		//driver.quit();
		driver.close();
		
		
	}

}
