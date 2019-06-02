package com.review01;

import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement> list= driver.findElements(By.name("sex"));
		//we used advanced for loop
		for(WebElement web:list) {
			if(web.isEnabled()) {
				Thread.sleep(3000);
				web.click();
			}
		}	
			
		Iterator<WebElement> it=list.iterator();
		while(it.hasNext()){
			
			it.next().click();
			Thread.sleep(4000);
		}
		driver.close();
			
	}
		
		

	}


