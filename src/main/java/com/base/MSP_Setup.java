package com.base;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MSP_Setup 
{

	public WebDriver driver;
	
	public MSP_Setup() 
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
	}
	
	public MSP_Setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();			
		}

		if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			driver=new FirefoxDriver();	
		}
		
		if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			
			driver=new EdgeDriver();
		}

	}
	
	public void startApplication()
	{
		driver.get("https://www.mysmartprice.com/mobile/apple-iphone-7-msp10208");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public double mySmartPrice;	
	public void getMySmartPrice()
	{
		String temp=driver.findElement(By.xpath("//span[@class='prdct-dtl__prc-val']")).getAttribute("innerHTML");

		mySmartPrice=Double.parseDouble(temp.replaceAll(",", ""));
		
		System.out.println("MSP :"+mySmartPrice);
	
	}	
	

	public static void main(String[] args) 
	{
		
		MSP_Setup obj=new MSP_Setup("firefox");
		
		obj.startApplication();
		
		obj.getMySmartPrice();
		
	
	}
	
	
	
	

}
