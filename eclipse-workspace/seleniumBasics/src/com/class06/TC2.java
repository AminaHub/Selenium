package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC2 {

	public static void main(String[] args) throws InterruptedException {
		//TC 2: Select and Deselect values
		//Open chrome browser  
		//Go to “http://uitestpractice.com/”
		//Click on “Select” tab
		//Verify how many options available in the first drop down and then select “United states of America”
		//Verify how many options available in the second drop down and then select all.
		//Deselect China from the second drop downQuit browser (edited) 
		
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/");
		
		
		WebElement DD1=driver.findElement(By.cssSelector("//a[@text()='Select']"));
		Select select=new Select(DD1);
		
		driver.findElement(By.cssSelector("select#countriesSingle")).click();

		
		//printing all options
		
		//Select select = new Select(departmentsDD);
		//find how many options is available 
		List<WebElement> allOptions=select.getOptions();
		System.out.println("# of option in DD="+allOptions.size());
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
