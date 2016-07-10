package base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;

public class CreateDriver {
	
	//public ChromeDriver driver;
	public WebDriver driver;
	@BeforeMethod
	public void bmet()
	{
		ResourceBundle rb = ResourceBundle.getBundle("Config");
		if(rb.getString("browser").equalsIgnoreCase("firefox"))
		{
			//FirefoxDriver driver = new FirefoxDriver();
			 driver = new FirefoxDriver();
		}
		else if(rb.getString("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			//ChromeDriver driver = new ChromeDriver();
			driver = new ChromeDriver();
		}
		
		else if(rb.getString("browser").equalsIgnoreCase("InternetExplorer"))
		{
			System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
			//InternetExplorerDriver driver = new InternetExplorerDriver();
							driver = new InternetExplorerDriver();
		}
	
		driver.get(rb.getString("baseUrl"));
	}

}
