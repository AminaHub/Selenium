package com.class07;

import utils.CommonMethods;

public class Windows extends CommonMethods{
	
	//TaskAhead to http://uitestpractice.com/Students/SwitchtoGet the parent title
	//Get the parentIdprint the parent title and parentId
	//Click on the open in a new window Get the child title
	//Get the childIdprint the child title and childId
	//close the child window

	public static void main(String[] args) {
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		String parent=driver.getTitle();
		String parentId=driver.getWindowHandle();
		System.out.println("title: "+parent+" "+"ID: "+parentId);
		driver.getWindowHandles();
		
		
		
		
		 //public static void main(String[] args) {        // TODO Auto-generated method stub        CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");        String parent =driver.getTitle();        String parentId= driver.getWindowHandle();        System.out.println("title: "+parent+" "+" ID: "+parentId);        driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();        Set<String> allWindows = driver.getWindowHandles();        Iterator<String> it = allWindows.iterator();        parent=it.next();        String child= it.next();        driver.switchTo().window(child);        child=driver.getTitle();        String childId= driver.getWindowHandle();        System.out.println("title: "+child+" "+" ID: "+childId);        driver.switchTo().window(parent);

	}

}
