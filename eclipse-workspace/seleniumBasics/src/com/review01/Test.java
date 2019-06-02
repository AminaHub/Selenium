package com.review01;



import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//C://Users//NZeki//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		//input[@name='exp']
		List<WebElement> list= driver.findElements(By.cssSelector("input[id^='exp-']"));
		int i=0;
		for(WebElement ele:list) {
			i++;
			if(ele.isEnabled()) {
				ele.click();
				Thread.sleep(2000);
				if(i==4) {
					break;
				}	
			}
		}
		List<WebElement> it=driver.findElements(By.xpath("//input[@name='exp']"));
		Iterator<WebElement> radios=it.iterator();
		while(radios.hasNext()) {
			radios.next();
			Thread.sleep(1000);
		}
		
		driver.close();
	}

}
