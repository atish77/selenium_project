package com.w2a.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import basepage.Basepage;

public class Supportpage extends  Basepage {
	
	public void clickOnSupportLink() throws InterruptedException {
		//String currentwindow=driver.getWindowHandle();
		driver.findElement(By.cssSelector(".zgh-nav > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")).click();
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector(cssSelector))
		List <String> list = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(list.get(0));
		System.out.println(driver.getTitle());
		driver.switchTo().window(list.get(1));
	//	String pagetitle= "Zoho Community |  Connect, network, and share on Zoho Forums";
   // Assert.assertEquals(driver.getTitle(), pagetitle);
		System.out.println(driver.getTitle());
    driver.close();
    //driver.switchTo().window(currentwindow);
    driver.quit();
    
    
		
	}
	
	

}
