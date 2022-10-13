package com.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samprog {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver in = new ChromeDriver();
		in.manage().window().maximize();
		in.get("https://www.amazon.in/");
		
		
		
		
		
		}

}
