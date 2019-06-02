package com.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		//Task One Ahead to http://uitestpractice.com/Students/Index
		//Click on the Actions
		//Click on the click me !Handle the alert and click okay
		//Double Click Double Click Me !Handle the alert and click okay
		//Close the browser
		setUpDriver("chrome","http://uitestpractice.com/Students/Index");
		WebElement ele= driver.findElement(By.xpath("//a[text()='Actions']"));
		Actions action= new Actions(driver);
		action.moveToElement(ele).click().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click Me !']")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Double Click Me !']")).click();
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.accept();
		driver.close();
	}

}
