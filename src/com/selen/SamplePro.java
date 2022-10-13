package com.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePro {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver f = new ChromeDriver();
		f.manage().window().maximize();
		f.get("https://demo.automationtesting.in/Register.html");
		WebElement fi = f.findElement(By.xpath("//input[@ng-model='FirstName']"));
		fi.sendKeys("Theepori");
		WebElement la = f.findElement(By.xpath("//input[@ng-model='LastName']"));
		la.sendKeys("Thirumugam");
		WebElement pa = f.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		pa.sendKeys("chennai");
		f.findElement(By.xpath("(//input[@ng-model='radiovalue'])[1]")).click();
		WebElement e = f.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		e.sendKeys("mrfireface3@gmail.com");
		WebElement p = f.findElement(By.xpath("//input[@ng-model='Phone']"));
		p.sendKeys("9790989691");
		f.findElement(By.xpath("//input[@id='checkbox1']")).click();
		f.findElement(By.xpath("//input[@id='checkbox2']")).click();
		Thread.sleep(3000);
		f.findElement(By.xpath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[7]")).click();
		f.findElement(By.xpath("(//li[@class='ng-scope'])[8]")).click();
		f.findElement(By.xpath("//img[@id='imagetrgt']")).click();
		f.findElement(By.xpath("//span[@class='selection']")).click();
		f.findElement(By.xpath("//input[@type='search']")).click();
		
		

	}

}
