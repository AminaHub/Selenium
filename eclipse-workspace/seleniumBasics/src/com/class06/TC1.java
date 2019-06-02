package com.class06;

import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC1 {
	
	//TC 1: Amazon Department List Verification
	//Open chrome browserGo to “http://amazon.com/”
	//Verify how many department options available.
	//Print each departmentSelect Computers
	//Quit browser

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com/");
		
		WebElement departmentsDD=driver.findElement(By.cssSelector("select#searchDropdownBox"));
		//Pass to select class constructor
		Select select=new Select(departmentsDD);

		
		//printing all options
		
		//Select select = new Select(departmentsDD);
		//find how many options is available 
		List<WebElement> allOptions=select.getOptions();
	System.out.println("# of option in departments DD="+allOptions.size());
		
		System.out.println("------ all options from departments dd-------");
		Iterator <WebElement> it=allOptions.iterator();
		while(it.hasNext()) {
			String optionText=it.next().getText();
			System.out.println(optionText);
		}
		select.selectByVisibleText("Computers");
		Thread.sleep(3000);
		driver.quit();
	}

}
