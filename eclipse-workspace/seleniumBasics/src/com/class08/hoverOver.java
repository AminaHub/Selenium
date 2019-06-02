package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class hoverOver extends CommonMethods
{

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome","https://www.toolsqa.com");
		WebElement ele= driver.findElement(By.xpath("//span[text()='VIDEOS']"));
		Actions action= new Actions(driver);
		action.moveToElement(ele).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Paid Selenium Video Tutorial']")).click();
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
