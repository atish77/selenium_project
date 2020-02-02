package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basepage.Basepage;

public class Homepage  extends Basepage{
 
	/*
	 * public Homepage(WebDriver driver){ this.driver=driver; }
	 */
	public void dofreesignup() {
		driver.findElement(By.cssSelector(".zh-signup")).click();
	}
 public void goToLogin() {
	  driver.findElement(By.cssSelector(".zh-login")).click();
	
 }
 public void goToZohoEdu() {
	 
 }
 
 public void goToLearnmode() {
	 
 }
 
 public void validateFooterlinks() {
	 
 }
 public void doSupport() {
	 driver.findElement(By.cssSelector(".zh-support")).click();
 }
 public void docustomer() {
	 driver.findElement(By.cssSelector(".zh-customers")).click();
 }
}
