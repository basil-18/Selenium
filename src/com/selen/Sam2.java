package com.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sam2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver in = new ChromeDriver();
		Actions l=new Actions(in);
		in.manage().window().maximize();
		in.get("https://www.flipkart.com/");
		in.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement w = in.findElement(By.xpath("(//div[@class='eFQ30H'])[4]"));
		l.moveToElement(w).perform();
		Thread.sleep(3000);
		WebElement findElement = in.findElement(By.xpath("//h1[@class='_10Ermr']"));
		in.findElement(By.xpath("(//div[@class='TB_InB'])[2]")).click();
		
		
		
		
	}

}
