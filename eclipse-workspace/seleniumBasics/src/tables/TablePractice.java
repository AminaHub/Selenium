package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.review01.MethodsReuse;

public class TablePractice extends MethodsReuse {

		// TODO Auto-generated method stub
		//table[@id='table1'/tbody/tr
		public static void main(String[] args) {
					
		MethodsReuse.browserSetUp("chrome", "https://the-internet.herokuapp.com/");
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		System.out.println(list.size());
		for (int i = 1; i <= list.size(); i++) {
			if (i >= 6) {
				String text = driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th[" + i + "]")).getText();
				System.out.println(text.equals("Printer"));
			} else {
				System.out.println("fail");
			}
//		String text=driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th["+i+"]")).getText();
//			System.out.println(text);
		}
	}
}	

