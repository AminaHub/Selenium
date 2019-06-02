package com.class10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class WebTableTask extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// Open chrome browser
		//Go to “https://the-internet.herokuapp.com/”
		//Click on “Click on the “Sortable Data Tables” link
		//Verify tables consist of 4 rows and 6 columns
		//Print name of all column headers
		//Print data of all rows
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		//GET NUMBER OF ROWS
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		List <WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		List <WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		
		
		System.out.println("Number of rows ="+rows.size());
		
		System.out.println("Number of colums ="+cols.size());
		
		System.out.println("-----------COLUMNS HEADERS-----------------");
		for (WebElement col: cols) {
			String colText=col.getText();
			System.out.println(colText);
		}
		
		System.out.println("-----------ROW DATA-----------------");
		Iterator<WebElement> it=rows.iterator();
		while(it.hasNext()) {
			String rowText=it.next().getText();
			System.out.println(rowText);
		}
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
