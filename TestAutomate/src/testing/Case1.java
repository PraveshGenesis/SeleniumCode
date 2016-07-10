package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ResourceBundle;
import org.testng.annotations.Test;
import base.CreateDriver;
public class Case1 extends CreateDriver{
	
	@Test
	public void testCase1()
	{
		ResourceBundle rb = ResourceBundle.getBundle("Element");
		
		// GENERIC CODING
		driver.findElement(By.id(rb.getString("login_username_id"))).sendKeys("Hello");
		driver.findElement(By.id(rb.getString("login_password_id"))).sendKeys("HEEEEE");
		driver.findElement(By.id(rb.getString("login_signIn_id"))).click();
		
		// ---------****Normal Coding****---------- 
		
		/*driver.findElementById(rb.getString("login_username_id")).sendKeys("Hello");
		driver.findElementById(rb.getString("login_password_id")).sendKeys("heheheheh");
		driver.findElementById(rb.getString("login_signIn_id")).click();*/
	}

}
