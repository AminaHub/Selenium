package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class dragAndDrop extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome","https://jqueryui.com/droppable/");
		
		WebElement frame=driver.findElement(By.cssSelector("iFrame.demo-frame"));
		driver.switchTo().frame(frame);
		Actions action=new Actions(driver);
		WebElement draggable=driver.findElement(By.cssSelector("div#draggable"));
		WebElement droppable=driver.findElement(By.cssSelector("div#droppable"));
		
		Thread.sleep(2000);
		action.dragAndDrop(draggable, droppable).build().perform();
		
		driver.close();
	}

}
