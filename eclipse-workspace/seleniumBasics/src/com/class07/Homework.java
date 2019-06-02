package com.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommonMethods;

public class Homework extends CommonMethods {
	
	//TC 1: ToolsQA Windows verification
	//Open chrome browser
	//Go to “https://the-internet.herokuapp.com/”
	//Click on “Multiple Windows” link
	//Click on “Elemental Selenium”
	//Verify title of second window is “Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro”
	//Close second windowClick on “Click Here” link
	//Verify title if newly open window is “New Window”
	//Close second windowVerify title of second window is “The Internet”
	//Quit browser
	//NOTE: Selenium execution could be too fast, please use Thread.sleep

	public static void main(String[] args) {
		
	CommonMethods.setUpDriver("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
	//		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
	//		WebDriver driver=new ChromeDriver();
	//		driver.manage().window().maximize();
	//		driver.get("https://the-internet.herokuapp.com/");

	}

}
