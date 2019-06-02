package com.class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.CommonMethods;

//TC 1: OrangeHRM Login
//Navigate to “https://opensource-demo.orangehrmlive.com/”
//Login to the application
//Verify user is successfully logged in
//Note: must use properties file
public class Task1 {
	Properties prop;
	
	@Test
	public void readFile() {
		String filePath="src/configs/credentials.properties";
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
			
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		
			System.out.println(prop.getProperty("browser"));
			System.out.println(prop.getProperty("url"));
			
			CommonMethods.setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
			CommonMethods.driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
			CommonMethods.driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("admin123");
			//Thread.sleep(2000);
			CommonMethods.driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
			CommonMethods.driver.quit();
		
	}	

}
