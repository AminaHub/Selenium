package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.review01.MethodsReuse;

public class TablePractice2 extends MethodsReuse{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		browserSetUp("chrome", "https://the-internet.herokuapp.com/tables#edit");
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		String client="Doe";
		for(int i=1;i<=list.size();i++) {
			String text=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]")).getText();
			if(text.contentEquals(client)) {
				driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td/a[1]")).click();
				//or driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td/a[@href='#edit']")).click();
				System.out.println(client);
				Thread.sleep(3000);
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
