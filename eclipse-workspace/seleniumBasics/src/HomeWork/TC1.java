package HomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class TC1 extends CommonMethods{
	
/************************************************************************************************	
* 	TC 1: Table headers and rows verification
*	1.Open browser and go to 
*	“http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
*	2.Login to the application
*	3.Create an Order
*	4.Verify order of that person is displayed in the table “List of All Orders”
*	5.Click on edit of that specific order
*	6.Verify each order details
*	7.Update street address
*	8.Verify in the table that street has been updated
*	9.Close browser
************************************************************************************************/

	public static void main(String[] args) throws InterruptedException {
		//Open Browser and go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
		String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("chrome",url);
		
		//Enter Logins and click login
		sendText(driver.findElement(By.cssSelector("input[id$='username']")),"Tester");
		sendText(driver.findElement(By.cssSelector("input[id*='password']")),"test");
		driver.findElement(By.cssSelector("input.button")).click();
		
		//Click on 'Order' Button to fill order form
		driver.findElement(By.xpath("//a[text()='Order']")).click();
		
		String product="FamilyAlbum";
		String quantity="3";
		String name="Anna Smith";
		String address="123 Adam Street";
		String city="Fairfax";
		String state="VA";
		String zip="12345";
		String card="visa";
		String cardNum="1234567812347890";
		String expDate="12/20";
		
		//3- Fill in the order form for Anna Smith order --> creating an order
		WebElement products= driver.findElement(By.cssSelector("select[id$='ddlProduct']"));
		Select productSelect=new Select(products);
		 productSelect.selectByVisibleText("FamilyAlbum");
	        driver.findElement(By.cssSelector("input[id$='txtQuantity']")).sendKeys("3");
	        driver.findElement(By.cssSelector("input[id$='txtUnitPrice']")).clear();
	        //driver.findElement(By.xpath("//input[contains(@value,'Calculate')]")).click();
	        driver.findElement(By.cssSelector("input[id$='txtName']")).sendKeys("Anna Smith");
	        driver.findElement(By.cssSelector("input[id$='TextBox2']")).sendKeys("123 Adam Street");
	        driver.findElement(By.cssSelector("input[id$='TextBox3']")).sendKeys("Fairfax");
	        driver.findElement(By.cssSelector("input[id$='TextBox4']")).sendKeys("VA");
	        driver.findElement(By.cssSelector("input[id$='TextBox5']")).sendKeys("12345");
	    
	        //Select visa credit card Radio button
	        List<WebElement> btnList=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_fmwOrder_cardList']/tbody/tr/td"));
	        
	        for (WebElement radio: btnList) {
	            String colText=radio.getText();
	            String value=radio.getText();
	            
	            if(radio.isEnabled()&& value.contentEquals("Visa")) {
	                radio.click();
	                break;
	            }
	        }
	        
	    driver.findElement(By.cssSelector("input[id$='TextBox6']")).sendKeys("1234567812347890");
	    driver.findElement(By.cssSelector("input[id$='TextBox1']")).sendKeys("12/20");
		//Click on Process button to process the order
		driver.findElement(By.xpath("//a[text()='Process']")).click();
		Thread.sleep(3000);
		//Click on View All Orders to check if order is listed in the Orders list
		driver.findElement(By.xpath("//a[text()='View all orders']")).click();
		

		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[1]/th"));
		
		//4- Verifying order of Anna Smith is displayed in the table “List of All Orders”
		for(int i=1; i<=rows.size();i++) {
			String rowText=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText();
			boolean isDisplayed=false;
			if(!rowText.equals(name) || rowText.equals(product)) {
				isDisplayed=true;
				System.out.println("Order for Anna Smith is Displayed in the List of All Oders Table");
				break;
			}else {
				System.out.println("Order is Not Displayed in the List of All Oders Table");
			}
		}
		
		//5.Click on edit of that specific order
		//6.Verify each order details
		//7.Update street address
		for(int i=1; i<=rows.size(); i++) {  
		    String rowText=driver.findElement(By.xpath("//*[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText();
		    if(rowText.contains(name)) {
		        driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]/td[13]")).click(); 
		        
		        verify(rowText, product);
		        verify(rowText, quantity);
		        verify(rowText, name);
		        verify(rowText, address);
		        verify(rowText, city);
		        verify(rowText, state);
		        verify(rowText, zip);
		        verify(rowText, card);
		        verify(rowText, cardNum);
		        verify(rowText, expDate);
		        sendText(driver.findElement(By.xpath("//input[contains(@id, 'ctl00_MainContent_fmwOrder_TextBox2')]")), "234 changed street");
		        click(driver.findElement(By.linkText("Update")));  
		    }
		}    
		
			//8.Verify in the table that street has been updated 
		    String updatedAddress="234 changed street";
			boolean isUpdated=false;
			for(int i=1; i<=rows.size(); i++) {
				WebElement element=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]"));
		    	if(!element.equals(updatedAddress)) {
					isUpdated=true;
					System.out.println("Street Address has been updated to: "+updatedAddress);
					break;
				}else {
					System.out.println("Address has not been updated");
			}
	}	
			
		Thread.sleep(3000);
		driver.quit();

	}

}
