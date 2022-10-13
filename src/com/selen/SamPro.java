package com.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamPro {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver f=new ChromeDriver();
		f.get("https://www.redbus.in/");
	    f.manage().window().maximize();
		WebElement dow = f.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		dow.click();
		WebElement si = f.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
		si.click();
		Thread.sleep(3000);
		WebElement ph = f.findElement(By.xpath("//div[@class='mobileInput clearfix']"));
		ph.sendKeys("9595564378");
		WebElement ca = f.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])[2]"));
		ca.click();
		
		
		
		
		
	}
}
