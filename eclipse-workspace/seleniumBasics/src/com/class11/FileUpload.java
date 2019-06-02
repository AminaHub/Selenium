package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class FileUpload extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		String url="http://the-internet.herokuapp.com";
		setUpDriver("chrome",url);
		driver.findElement(By.linkText("File Upload")).click();
		
		String filePath="/Users/Syntax/Desktop/UploadFile.jpg";
		driver.findElement(By.id("file-upload")).sendKeys(filePath);
		driver.findElement(By.id("file-submit")).click();
		boolean isDisplayed=driver.findElement(By.xpath("h3[tet()='File Uploaded!']")).isDisplayed();
		if(isDisplayed) {
			System.out.println("File uploaded successfully");
		}else {
			System.out.println("File did not upload successfully");
		}
		
		//steps to take screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File pic=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(pic, new File("screenshots/TheInternet/FileUpload.png"));
		}catch (IOException e) {
			
			
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
