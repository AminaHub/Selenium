package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownReview {

	public static void main(String[] args) throws InterruptedException {
		//if we do not set the property we will get illegalStateException
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		//identify DD with <select>
		WebElement contriesDD=driver.findElement(By.cssSelector("select#continents"));
		//Pass to select class constructor
		Select select=new Select(contriesDD);
		
		//Find how many options is available
		List<WebElement> allOptions1=select.getOptions();
		System.out.println("#of Options in Country DD= "+allOptions1.size());
		
		Iterator<WebElement> it=allOptions1.iterator();
		while(it.hasNext()) {
			String optionText=it.next().getText();
			System.out.println(optionText);
		}
		select.selectByVisibleText("Africa");
		Thread.sleep(3000);
		select.selectByIndex(5);
		//deselect from single DD--> we will get unsupportedOperationException:
		//You may only deselect option of a multi select
		//select.deselectByIndex(5);
		
		
		//working with multi Select
		WebElement commandsDD=driver.findElement(By.id("selenium_commands"));
		Select select1=new Select(commandsDD);
		
		System.out.println("--------All options from command dd--------------");        
		for(int i=0; i<allOptions1.size(); i++) {            
			String text =allOptions1.get(i).getText();           
			System.out.println(text);        
		}
		
		if(select1.isMultiple()) {//checks if DD support multiple options
			select1.selectByVisibleText("Navigation Commands");
			Thread.sleep(2000);
			select1.selectByIndex(2);
			select1.selectByIndex(3);
			select1.selectByIndex(4);
			Thread.sleep(7000);
			
		}
		select1.deselectByIndex(2);
		Thread.sleep(5000);
		select.deselectByVisibleText("Navigate Commands");
		select1.deselectAll();
		
		Thread.sleep(2000);
		//driver.quit();
	}

}
