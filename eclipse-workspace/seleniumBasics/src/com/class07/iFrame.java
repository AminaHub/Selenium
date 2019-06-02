package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class iFrame extends CommonMethods
{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		
		//driver.switchTo().frame("iframe_a");
		
		//driver.switchTo().frame(0);
		
		WebElement ele=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.cssSelector("input#name")).sendKeys("Amina");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.close();

	}

}
