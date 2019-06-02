package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class ScreenshotTask extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TC 1: Upload file and Take Screenshot
		//Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
		//Upload file
		//Verify file got successfully uploaded and take screenshot
		
		setUpDriver("chrome", "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");
		//driver.findElement(By.cssSelector("input.gwt-FileUpload")).click();
		
		String filePath="C:\\Users\\NZeki\\Desktop\\Upload\\UploadImage.png";
		driver.findElement(By.xpath("//input[@class='gwt-FileUpload']")).sendKeys(filePath);
		driver.findElement(By.xpath("//button[@class='gwt-Button']")).click();	
		 String expected="File uploaded!";
		 String textActual=getAlertText();
	        
	        if (textActual.equals(expected)) {
	        	System.out.println("File is uploaded");
	        }else {
	        	System.out.println("File is NOT uploaded");
	        }
	        
	        acceptAlert();
	        
	        TakesScreenshot ts=(TakesScreenshot)driver;
	        File scr=ts.getScreenshotAs(OutputType.FILE);
	        
	        try {
				FileUtils.copyFile(scr, new File("screenshot/WebTools/Upload.png"));
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Unable to take screesnhot");
			}
	        
	        driver.quit();
		}
	}
		
		//driver.findElement(By.id("file-submit")).click();
		//String filePath="C:\\Users\\NZeki\\Desktop\\Upload\\UploadImage.jpg";
		//driver.findElement(By.cssSelector("input.gwt-FileUpload")).sendKeys(filePath);
//		driver.findElement(By.id("file-submit")).click();
//		boolean isDisplayed=driver.findElement(By.xpath("h3[tet()='File Uploaded!']")).isDisplayed();
//		if(isDisplayed) {
//			System.out.println("File uploaded successfully");
//		}else {
//			System.out.println("File did not upload successfully");
//		}
//		
		
//		TakesScreenshot camera=(TakesScreenshot)driver;
//		File selfie=camera.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(selfie, new File("screenshot/gwtProject/gwtPage.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("Selfie not taken");
//		}
		
		//driver.quit();
