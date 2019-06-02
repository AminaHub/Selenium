package com.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaceBookMethodsReuse extends MethodsReuse {
//public static WebDriver driver;
	public static void main(String[] args) {
		//WebElement ele=driver
		MethodsReuse.browserSetUp("chrome", "http://www.facebook.com");
		MethodsReuse.sendText(driver.findElement(By.name("firstname")), "Almighty Weqas");
	}

}
