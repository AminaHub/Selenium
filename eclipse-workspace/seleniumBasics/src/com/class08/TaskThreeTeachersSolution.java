package com.class08;

import utils.CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TaskThreeTeachersSolution extends CommonMethods{
	
	public static void main(String[] args) {
			/*
			 * Task Three
				Ahead to http://uitestpractice.com/Students/Index
				Click on the Actions
				Click and hold on 1,2,3,4 boxes
				Close the browser

			 */
			setUpDriver("Chrome","http://uitestpractice.com/Students/Index");
			driver.findElement(By.xpath("//a[text()='Actions']")).click();
			WebElement one = driver.findElement(By.xpath("//li[text()='1']"));
			WebElement two = driver.findElement(By.xpath("//li[text()='2']"));
			WebElement three = driver.findElement(By.xpath("//li[text()='3']"));
			WebElement four = driver.findElement(By.xpath("//li[text()='4']"));
			Actions action = new Actions(driver);
			action.moveToElement(one).clickAndHold().moveToElement(two).clickAndHold().moveToElement(three).clickAndHold().moveToElement(four).build().perform();

		}

	}
