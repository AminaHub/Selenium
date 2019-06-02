package com.class07;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class TC1 extends CommonMethods{

		// TC 1: ToolsQA Frame verificationOpen chrome browser
		//Go to “https://www.toolsqa.com/iframe-practice-page/”
		//Click on “Blogs” link inside first frame
		//Verify element “Interactions” is present in second frame
		//Navigate to Home PageQuit browser
		
		public static void main(String[] args) throws InterruptedException {
			
			CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tom");
		driver.switchTo().defaultContent();
		boolean Switch =driver.findElement(By.xpath("//h2[text()='SwitchTo']")).isDisplayed();
		if(Switch==true) {
		driver.close();	
		}
	}

}
