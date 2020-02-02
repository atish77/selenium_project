package basepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage {
	
	
	public static  WebDriver  driver;
	
	
	public Basepage() {
		
		if (driver==null) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\exectuables\\chromedriver.exe");
		  driver = new ChromeDriver();
		
		 driver.get("https://www.zoho.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
		
	}
}
