package HomeWork;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class TC3 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		/********************************************************************************
		 * 
		 * TC 1: Users Application Form Fill 
		 * 1. Open chrome browser 
		 * 2. Go to “http://uitestpractice.com/” 
		 * 3. Click on “Forms” link 
		 * 4. Fill out the entire form 
		 * 5. Close the browser 
		 * MUST USE Functions:
		 * 
		 ********************************************************************************/
		
		String url="http://uitestpractice.com/";
		setUpDriver("chrome",url);
		
		//Click on Form button from the top menu bar using Common Method click
		click(driver.findElement(By.xpath("//a[text()='Form']")));
		
		//Enter First Name using Common Method sendText
		sendText(driver.findElement(By.cssSelector("input#firstname")), "Emma");
		System.out.print("User First Name: ");
		verify("input#firstname", "Emma");
		
		//Enter Last Name using Common Method sendText
		sendText(driver.findElement(By.cssSelector("input#lastname")), "Borda");
		System.out.print("User Last Name: ");
		verify("input#lastname", "Borda");
		
		//Select Martial Status Radio Button using Common Method radioButton
		selectRadioButton("//label[@class='radio-inline']", "Married");
		verify("//label[@class='radio-inline']", "Married");
		
		//Select Hobby check box using Common Method checkBox
		selectCheckBoxes("//label[@class='checkbox-inline']","Reading");
		verify("//label[@class='checkbox-inline']", "Reading");
		
		//Select country using Common Method dropDownSelect 
		String countryText="//select[@id='sel1']";
		dropDownSelect(countryText,"Canada");
		verify("//select[@id='sel1']","Canada");
		
		//Click on the Date of Birth box using Common Method click
		click(driver.findElement(By.xpath("//input[@id='datepicker']")));
		
		//Select Birth date from Calendar
		//String variables to assign elements path for Calendar
		String getCalendar="//table[@class='ui-datepicker-calendar']/tbody/tr/td";
		String getMonthPath="//select[@class='ui-datepicker-month']";
		String getYearPath="//select[@class='ui-datepicker-year']";
				
		//Select year using Common Method selectValueFromDD with WebElement and integer parameter
		WebElement month=driver.findElement(By.xpath(getMonthPath));
		selectValueFromDD(month, 7);
		
		//Select year using Common Method selectValueFromDD with WebElement and string parameter
		WebElement year=driver.findElement(By.xpath(getYearPath));
		selectValueFromDD(year, "2014");
		
		//Select day date using Common Method selectCalendarDate
		selectCalendarDate(getCalendar, "12");
		System.out.println("User date of Birth: ");
		verify("//input[@id='datepicker']", "08/12/2014");
		
		//Enter tel. number
		sendText(driver.findElement(By.xpath("//input[@id='phonenumber']")), "703451234");
		
		
		//Enter User Name using Common Method sendText
		sendText(driver.findElement(By.xpath("//input[@id='username']")), "EmmaUser");
		
		
		
		//Enter Email address using Common Method sendText
		sendText(driver.findElement(By.xpath("//input[@id='email']")), "eborda@gmail.com");
		
		//Enter notes in the comment box using Common Method sendText
		sendText(driver.findElement(By.xpath("//textarea[@id='comment']")), "This is the comment box to test with");
		
		//Enter Password using Common Method sendText
		sendText(driver.findElement(By.xpath("//input[@id='pwd']")), "AnyPassword02$");
		
		System.out.println("The form is complete and ready to submit");
		
	
		Thread.sleep(3000);
		driver.quit();
	}

}


