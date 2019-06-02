package com.review01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAToolsPt2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		String title= driver.getTitle();
		System.out.println(title);
		if(title.contentEquals("Demo Form for practicing Selenium Automation")) {
			System.out.println("you are in the right location");
			Thread.sleep(2000);
		}else {
			System.out.println("you are in the wrong location");
		}
		driver.findElement(By.name("firstname")).sendKeys("FirstName");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			System.out.println(link.getText());
		}
		Thread.sleep(2000);
		driver.close();
	}

}
