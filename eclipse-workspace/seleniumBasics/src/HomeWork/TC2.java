package HomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TC2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	/*********************************************************************************
	 * TC 1: Table headers and rows verification 
	 * 1.Open chrome browser 
	 * 2.Go to “https://jqueryui.com/” 
	 * 3.Click on “Datepicker” 
	 * 4.Select August 10 of 2019 
	 * 5.Verify date “08/10/2019” has been entered successfully
	 * 6.Close browser
	 * @Author Amina Hanun
	 *********************************************************************************/
		 	
		// 1.Open chrome browser 
		// 2.Go to “https://jqueryui.com/”
		// Using Common Method setUpDriver
		String url="https://jqueryui.com/";
		setUpDriver("chrome",url);
		
		
		// 3.Click on “Datepicker” Using Common Method click
		click(driver.findElement(By.xpath("//a[text()='Datepicker']")));
		
		
		//Switching frame Using Common Method switchToFrame
		switchToFrame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//click the calendar box using Common Method click 
		click(driver.findElement(By.id("datepicker")));
		
		//4.Select August 10 of 2019 
		//String variables to assign elements path
		String getMonthPath="//div[@class='ui-datepicker-title']";
		String getNextButton= "//span[text()='Next']";
		
		//Get month - get month of August
		String month=driver.findElement(By.xpath(getMonthPath)).getText();
		if(!month.equals("August 2019")) {
			do {
				click(driver.findElement(By.xpath("//span[text()='Next']")));
			}while (!driver.findElement(By.xpath(getMonthPath)).getText().equals("August 2019"));	
		}
		
		//Get date cell-Loop through the calendar month of August to get 10th day 
		String cellsPath="//table[@class='ui-datepicker-calendar']/tbody//tr/td";
		List<WebElement> getCalanderCells= driver.findElements(By.xpath(cellsPath));
		for(WebElement cell:getCalanderCells) {
			String date=cell.getText();
			if(date.equals("10")) {
				cell.click();
				break;
			}
		}
		
		//5.Verify date “08/10/2019” has been entered successfully using Common Method verify
		String getDate="//input[@id='datepicker']";
		verify(getDate,"08/10/2019");
		
		//Switch back to main frame
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
