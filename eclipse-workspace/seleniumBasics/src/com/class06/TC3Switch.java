package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3Switch {

	public static void main(String[] args) throws InterruptedException {
		// TC 1: JavaScript alert text verification
		//Open chrome browserGo to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
		//Verify alert box with text “I am an alert box!” is present
		//confirm box with text “Press a button!” 
		//is present prompt box with text “Please enter your name” is present
		//Quit browser
		
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(2000);
				
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText=alert.getText();
		System.out.println("Text of confirm alert="+alertText +"is present");
		if(alertText.equalsIgnoreCase("I am an alert box!")){
			alert.accept();
		}
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText1=alert.getText();
		System.out.println(alertText1+" Is Present");
		if(alertText1.equalsIgnoreCase("Press a button!")) {
			alert1.accept();
		}
		
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText2=alert.getText();
		System.out.println(alertText2+" Is Present");
		if(alertText2.equalsIgnoreCase("Please enter your name")) {
			alert2.accept();
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
